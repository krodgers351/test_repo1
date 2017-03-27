/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.KMCatalogEntry;
import edu.infsci2560.repositories.KMCatalogEntryRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author KRodgers
 */
@Controller
public class KMCatalogEntriesController {
    @Autowired
    private KMCatalogEntryRepository repository;
    
    @RequestMapping(value = "kmcatalogentries", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("kmcatalogentries", "kmcatalogentries", repository.findAll());
    }
    
    @RequestMapping(value = "kmcatalogentries/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid KMCatalogEntry catalogEntry, BindingResult result) {
        repository.save(catalogEntry);
        return new ModelAndView("kmcatalogentries", "kmcatalogentries", repository.findAll());
    }
    
	@RequestMapping(value = "kmcatalogentries/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        KMCatalogEntry entry = repository.findOne(id);
        return new ModelAndView("catalogEntryEdit", "kmcatalogentries", entry);
    }
    
    @RequestMapping(value = "kmcatalogentries/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public String update( @Valid KMCatalogEntry entry, BindingResult result) {
        repository.save(entry);
        return "redirect:/kmcatalogentries";
    }     
	
	//@RequestMapping(value = "kmcatalogentries/delete/{id}", method = RequestMethod.DELETE)
	//public void delete(@PathVariable long id) {
	//  repository.save(catalogEntry);
    //    return new ModelAndView("kmcatalogentries", "kmcatalogentries", repository.findAll());
	//}
	
	@RequestMapping(value = "kmcatalogentries/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ModelAndView delete(@PathVariable Long id) {
        repository.delete(id);
        return new ModelAndView("kmcatalogentries", "kmcatalogentries", repository.findAll());
    }   

}
