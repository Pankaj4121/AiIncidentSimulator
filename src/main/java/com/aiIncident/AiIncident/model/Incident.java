package com.aiIncident.AiIncident.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String affectedService;
    private String aiSeverity;
    private String aiCategory;
    
    // Default constructor
    public Incident() {
    }
    
    // Constructor with all fields
    public Incident(Long id, String title, String description, String affectedService, String aiSeverity, String aiCategory) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.affectedService = affectedService;
        this.aiSeverity = aiSeverity;
        this.aiCategory = aiCategory;
    }
    
    // Constructor without ID (for creating new incidents)
    public Incident(String title, String description, String affectedService) {
        this.title = title;
        this.description = description;
        this.affectedService = affectedService;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getAffectedService() {
        return affectedService;
    }
    
    public void setAffectedService(String affectedService) {
        this.affectedService = affectedService;
    }
    
    public String getAiSeverity() {
        return aiSeverity;
    }
    
    public void setAiSeverity(String aiSeverity) {
        this.aiSeverity = aiSeverity;
    }
    
    public String getAiCategory() {
        return aiCategory;
    }
    
    public void setAiCategory(String aiCategory) {
        this.aiCategory = aiCategory;
    }
    
    @Override
    public String toString() {
        return "Incident{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", affectedService='" + affectedService + '\'' +
                ", aiSeverity='" + aiSeverity + '\'' +
                ", aiCategory='" + aiCategory + '\'' +
                '}';
    }
}
