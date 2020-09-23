package com.def.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.def.api.entities.Workflow;
import com.def.api.repository.WorkflowRepository;
import com.def.api.controllers.WorkflowCategorieController;;

@Controller
@RequestMapping("/workflow/")

public class WorkflowController {
	private final WorkflowRepository workflowRepository;
	
    @Autowired
    public WorkflowController(WorkflowRepository workflowRepository) {
        this.workflowRepository = workflowRepository;
       
    }
    
    @GetMapping("listworkflow")
    public String listProviders(Model model) {
      model.addAttribute("workflows", workflowRepository.findAll());
        return "workflow/listWorkflow";
    }
    
    
   
    @PostMapping("listworkflow")
    //@ResponseBody
    public String addProvider(Workflow workflow , BindingResult result, Model model) {
    	
    	if ((workflow.getName().isEmpty()) & (workflow.getEnable() == 0 ) & (workflow.getIdcategorie() == 0 ))
    	{
    		model.addAttribute("workflows", workflowRepository.findAll());
    	}
    	else if (!(workflow.getName().isEmpty()) & (workflow.getEnable() == 0 ) & (workflow.getIdcategorie() == 0 ))
    	{
    		
    		model.addAttribute("workflows", workflowRepository.findByName(workflow.getName()));
    	}
    	
    	else if (!(workflow.getName().isEmpty()) & (workflow.getEnable() != 0 ) & (workflow.getIdcategorie() == 0 ))
    	{
    		model.addAttribute("workflows", workflowRepository.findByNameAndEnable(workflow.getName(), workflow.getEnable()));
    	}
    	
    	else if (!(workflow.getName().isEmpty()) & (workflow.getEnable() != 0 ) & (workflow.getIdcategorie() != 0 ))
    	{
    		model.addAttribute("workflows", workflowRepository.findByNameAndEnableAndIdcategorie(workflow.getName(), workflow.getEnable(),workflow.getIdcategorie()));
    	}
    	
    	else if (!(workflow.getName().isEmpty()) & (workflow.getEnable() == 0 ) & (workflow.getIdcategorie() != 0 ))
    	{
    		model.addAttribute("workflows", workflowRepository.findByNameAndAndIdcategorie(workflow.getName(), workflow.getIdcategorie()));
    	}
    	
    	else if ((workflow.getName().isEmpty()) & (workflow.getEnable() != 0 ) & (workflow.getIdcategorie() == 0 ))
    	{
    		model.addAttribute("workflows", workflowRepository.findByEnable(workflow.getEnable()));
    	}
    	else if ((workflow.getName().isEmpty()) & (workflow.getEnable() != 0 ) & (workflow.getIdcategorie() != 0 ))
    	{
    		model.addAttribute("workflows", workflowRepository.findByEnableAndIdcategorie(workflow.getEnable() , workflow.getIdcategorie()));
    	}
    	
    	else if ((workflow.getName().isEmpty()) & (workflow.getEnable() == 0 ) & (workflow.getIdcategorie() != 0 ))
    	{
    		model.addAttribute("workflows", workflowRepository.findByIdcategorie(workflow.getIdcategorie()));
    	}
    	
          return "workflow/listWorkflow";
      
    }
   

   
}