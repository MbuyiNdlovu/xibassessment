package com.xib.xibassessment.repository;


import com.xib.xibassessment.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository  extends JpaRepository<Agent, Long> {
}
