/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author KRodgers
 */
@Entity
public class KMCatalogEntry {
    private static final long serialVersionUID = 1L;
    
    public enum DocumentCategory {
        Unknown,
        Best_Practice,
        Design,
        Lessons_Learned,
        Procedure,
        Reference,
        Requirements,
        Standard,
        Template,
        Training,
        User_Documentation               
    }
    
    public enum Community {
        Everyone,
        Chemical_Engineers,
        Electrical_Engineers,
        Mechanical_Engineers,
        System_Administration,
        Developers
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String documentTitle;
    protected String knowledgeOwner;
    protected String audience;
    protected DocumentCategory documentCategory;
    protected Community community;
    protected String documentFilename;
    
    public KMCatalogEntry(){
        this.id = Long.MAX_VALUE;
        this.documentTitle = null;
        this.knowledgeOwner = null;
        this.audience = null;
        this.documentCategory = DocumentCategory.Unknown;
        this.community = Community.Everyone;
        this.documentFilename = null;
    }
    
    public KMCatalogEntry(Long id, String title, String owner, String audience, DocumentCategory category, Community community, String filename){
        this.id = id;
        this.documentTitle = title;
        this.knowledgeOwner = owner;
        this.audience = audience;
        this.documentCategory = category;
        this.community = community;
        this.documentFilename = filename;
    }
    
    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.documentTitle + ", knowledge owner=" + this.knowledgeOwner + ", audience=" + this.audience + ", category=" 
                + this.documentCategory + ", community=" + this.community + ", filename=" + this.documentFilename + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the documentTitle
     */
    public String getDocumentTitle() {
        return documentTitle;
    }

    /**
     * @param documentTitle the documentTitle to set
     */
    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    /**
     * @return the knowledgeOwner
     */
    public String getKnowledgeOwner() {
        return knowledgeOwner;
    }

    /**
     * @param knowledgeOwner the knowledgeOwner to set
     */
    public void setKnowledgeOwner(String knowledgeOwner) {
        this.knowledgeOwner = knowledgeOwner;
    }

    /**
     * @return the audience
     */
    public String getAudience() {
        return audience;
    }

    /**
     * @param audience the audience to set
     */
    public void setAudience(String audience) {
        this.audience = audience;
    }

    /**
     * @return the documentCategory
     */
    public DocumentCategory getDocumentCategory() {
        return documentCategory;
    }

    /**
     * @param documentCategory the documentCategory to set
     */
    public void setDocumentCategory(DocumentCategory documentCategory) {
        this.documentCategory = documentCategory;
    }

    /**
     * @return the community
     */
    public Community getCommunity() {
        return community;
    }

    /**
     * @param community the community to set
     */
    public void setCommunity(Community community) {
        this.community = community;
    }

    /**
     * @return the documentFilename
     */
    public String getDocumentFilename() {
        return documentFilename;
    }

    /**
     * @param documentFilename the documentFilename to set
     */
    public void setDocumentFilename(String documentFilename) {
        this.documentFilename = documentFilename;
    }
}
