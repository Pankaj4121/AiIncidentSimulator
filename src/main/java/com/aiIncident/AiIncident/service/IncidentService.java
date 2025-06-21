package com.aiIncident.AiIncident.service;

import com.aiIncident.AiIncident.model.Incident;
import com.aiIncident.AiIncident.repository.IncidentRepository;
import com.aiIncident.AiIncident.ai.AiLogicSimulator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class IncidentService {

    private final IncidentRepository repository;
    public IncidentService(IncidentRepository repository){
        this.repository=repository;
    }

    public Incident processAndSaveIncident(Incident incident){
        incident.setAiSeverity(AiLogicSimulator.getSeverity(incident.getDescription()));
        incident.setAiCategory(AiLogicSimulator.getCategory(incident.getDescription()));
        return repository.save(incident);
    }

    public Optional<Incident> getIncidentById(Long id) {
        return repository.findById(id);
    }

}