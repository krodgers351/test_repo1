/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.DocumentCategory;
import edu.infsci2560.repositories.DocumentCategoryRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author KRodgers
 */
@Controller
public class DocumentCategoriesController {    
	@Autowired
    private DocumentCategoryRepository repository;
    
    @RequestMapping(value = "documentcategories", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("documentcategories", "documentcategories", repository.findAll());
    }
    
    @RequestMapping(value = "documentcategories/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid DocumentCategory documentCategory, BindingResult result) {
        repository.save(documentCategory);
        return new ModelAndView("documentcategories", "documentcategories", repository.findAll());
    }

}
