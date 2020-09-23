package com.def.api.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.def.api.entities.Workflow;

@Repository
public interface WorkflowRepository extends CrudRepository<Workflow, Long> {

	List<Workflow> findByName(String name);
	List<Workflow> findByEnable(int enable);
	List<Workflow> findByIdcategorie(long idcategorie);
	
	
	List<Workflow> findByNameAndEnable (String name , int enable);
	
	List<Workflow> findByNameAndEnableAndIdcategorie (String name , int enable , long idcategorie);
	
	List<Workflow> findByEnableAndIdcategorie (int enable , long idcategorie);
	
	
	List<Workflow> findByNameAndAndIdcategorie (String name , long idcategorie);
	
	
	
	

}
