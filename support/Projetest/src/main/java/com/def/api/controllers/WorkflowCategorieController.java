package com.def.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.def.api.entities.Workflow;
import com.def.api.entities.WorkflowCategories;
import com.def.api.entities.Workflow;
import com.def.api.repository.WorkflowCategoriesRepository;
@Controller
@RequestMapping("/workflow/")

public class WorkflowCategorieController {
	private final WorkflowCategoriesRepository workflowCategoriesRepository;
	
    @Autowired
    public WorkflowCategorieController(WorkflowCategoriesRepository workflowCategoriesRepository) {
        this.workflowCategoriesRepository = workflowCategoriesRepository;
    }
    
    
    @GetMapping("ListCategories")
    public String showAddProviderForm(Workflow workflow , Model model) { 
    	model.addAttribute("workflowcategorie", workflowCategoriesRepository.findAll());
        return "workflow/listWorkflowCateg";
    }

    
}
