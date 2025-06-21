package com.aiIncident.AiIncident.repository;

import com.aiIncident.AiIncident.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {

} 