package com.xib.xibassessment.repository;


import com.xib.xibassessment.model.Agent;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface AgentRepository  extends JpaRepository<Agent, Long> {
}