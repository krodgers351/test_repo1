/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.repositories;

import edu.infsci2560.models.KMCatalogEntry;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author KRodgers
 */
public interface KMCatalogEntryRepository extends PagingAndSortingRepository<KMCatalogEntry, Long> {}