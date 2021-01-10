package com.xib.xibassessment.repository;


import com.xib.xibassessment.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TeamRepository  extends JpaRepository <Team, Long> {
    public List<Team> findByAgentidOrManagerid (Long agentid, Long managerid);
}
