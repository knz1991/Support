package com.def.api.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Workflow {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idworkflow;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;
    
    
    
    @NotBlank(message = "Email is mandatory")
    @Column(name = "enable")
    private int enable;
    
    
    @NotBlank(message = "Email is mandatory")
    @Column(name = "idcategorie")
    private long idcategorie;

    public Workflow() {}

    public Workflow(String name, String description, int enable) {
        this.name = name;
        this.description = description;
        this.enable = enable;
    }

    public void setIdWorkflow(long idworkflow) {
        this.idworkflow = idworkflow;
    }

    public long getIdworkflow() {
        return idworkflow;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setEnable(int enable) {
        this.enable = enable;
    }
    public int getEnable() {
        return enable;
    }
   
    
    public void setIdcategorie(long idcategorie) {
        this.idcategorie = idcategorie;
    }

    public long getIdcategorie() {
        return idcategorie;
    }
}

