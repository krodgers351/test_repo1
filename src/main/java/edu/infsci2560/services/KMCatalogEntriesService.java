/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.services;

import edu.infsci2560.models.KMCatalogEntry;
import edu.infsci2560.repositories.KMCatalogEntryRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author KRodgers
 */
@RestController
@RequestMapping("/public/api/kmcatalogentries")
public class KMCatalogEntriesService {

    @Autowired
    private KMCatalogEntryRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<KMCatalogEntry>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<KMCatalogEntry> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<KMCatalogEntry> create(@RequestBody KMCatalogEntry catalogEntry) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(catalogEntry), headers, HttpStatus.OK);
    }

	@RequestMapping(value = "/search/{searchString}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<KMCatalogEntry>> searchRepo(@PathVariable String searchString){
		Iterable<KMCatalogEntry> allEntries = repository.findAll();
		Iterable<KMCatalogEntry> returnEntries = new ArrayList<KMCatalogEntry>();
		for(KMCatalogEntry entry : allEntries){
			if(entry.getDocumentTitle().toLowerCase().contains(searchString.toLowerCase())
				|| entry.getKnowledgeOwner().toLowerCase().contains(searchString.toLowerCase())
				|| entry.getAudience().toLowerCase().contains(searchString.toLowerCase())
				|| entry.getDocumentCategory().toLowerCase().contains(searchString.toLowerCase())
				|| entry.getProduct().toLowerCase().contains(searchString.toLowerCase())
				|| entry.getCommunity().toLowerCase().contains(searchString.toLowerCase())
				|| entry.getDocumentFilename().toLowerCase().contains(searchString.toLowerCase())){
				((ArrayList<KMCatalogEntry>)returnEntries).add(entry);
			}
		}
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(returnEntries, headers, HttpStatus.OK);
	}

}
