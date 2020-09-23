package com.def.api.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.def.api.entities.WorkflowCategories;

@Repository
public interface WorkflowCategoriesRepository extends CrudRepository<WorkflowCategories, Long> {

}