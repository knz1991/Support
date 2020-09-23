package com.def.api.entities;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class WorkflowCategories {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idcategorie;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;
    
    @NotBlank(message = "Description is mandatory")
    @Column(name = "description")
    private String description;
    
    @NotBlank(message = "CreateAt is mandatory")
    @Column(name = "createat")
    private Date createat;
    
    
    @NotBlank(message = "UpdateAt is mandatory")
    @Column(name = "updateat")
    private Date updateat;
    
    
    @NotBlank(message = "Enable is mandatory")
    @Column(name = "enable")
    private int enable;
    

    @Column(name = "parentcategorie")
    private long parentcategorie;
    	
    public WorkflowCategories() {}

    public WorkflowCategories(String name, String description, int enable) {
        this.name = name;
        this.description = description;
        this.enable = enable;
    }

    public void setIdcategorie(long idcategorie) {
        this.idcategorie = idcategorie;
    }

    public long getIdcategorie() {
        return idcategorie;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void seEnable(int enable) {
        this.enable = enable;
    }
    public int getEnable() {
        return enable;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    public Date getCreateat() {
        return createat;
    }
    
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    public Date getUpdateat() {
        return updateat;
    }
    
    public void setParentcategorie(long parentcategorie) {
        this.parentcategorie = parentcategorie;
    }

    public long getParentcategorie() {
        return parentcategorie;
    }
    
}


