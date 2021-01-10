package com.xib.xibassessment.controller;

import com.xib.xibassessment.model.Agent;
import com.xib.xibassessment.model.Manager;
import com.xib.xibassessment.model.Team;
import com.xib.xibassessment.repository.AgentRepository;
import com.xib.xibassessment.repository.ManagerRepository;
import com.xib.xibassessment.repository.TeamRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/com/xib/xibassessment/operations/")
public class OperationsController {

    // logger
    private static Logger logger = LoggerFactory.getLogger(OperationsController.class);

    // team repository
    @Autowired
    private TeamRepository teamRepository;

    // agent Repository
    @Autowired
    private AgentRepository agentRepository;

    // manager repository
    @Autowired
    private ManagerRepository managerRepository;

    @GetMapping(value = "/teams", produces = "application/json")
    public List<Team> getTeams() {
        logger.info("Returns a list of teams in the database in JSON format");
        return teamRepository.findAll();
    }

    @GetMapping(value = "/team/{id}", produces = {"application/json"})
    public Optional<Team> getTeam(@PathVariable(value = "id") Long id) {
        logger.info("Returns a detail view of the specified team in JSON format");
        return teamRepository.findById(id);
    }

    @GetMapping(value = "/agents", produces = {"application/json"})
    public List<Agent> getAgents() {
        logger.info("Returns a list of all agents in the database in JSON format");
        return agentRepository.findAll();
    }

    @GetMapping(value = "/agent/{id}", produces = {"application/json"})
    public Optional<Agent> getAgent(@PathVariable(value = "id") Long id) {
        logger.info("Returns a detail view of the specified agent in JSON format. This should include team details.");
        return agentRepository.findById(id);
    }

    @PostMapping(value = "createteam", consumes = {"application/json"})
    public void createTeam(@RequestBody Team team) {
        logger.info("Creates a new team with the specified details - Expects a JSON body");
        teamRepository.save(team);
    }

    @PostMapping(value = "createagent", consumes = {"application/json"})
    public void createTeam(@RequestBody Agent agent) {
        logger.info("Creates a new agent with the specified details - Expects a JSON body");
        agentRepository.save(agent);
    }

    @GetMapping(value = "/getagentspaginated/{paginatefrom}/{paginateto}", produces = {"application/json"})
    public void getAgentPaginated(@PathVariable(value = "paginatefrom") int paginatefrom, @PathVariable(value = "paginateto") int paginateto) {
        logger.info("Paginate from #"+ paginatefrom + "  to  #" + paginateto);
        Pageable pageable = PageRequest.of(paginatefrom, paginateto);
    }

    @PostMapping(value = "createmanager", consumes = {"application/json"})
    public void createManager(@RequestBody Manager manager) {
        logger.info("Creates a new manager with the specified details - Expects a JSON body");
        managerRepository.save(manager);
    }

  @GetMapping(value = "/getemptyteams", produces = {"application/json"})
    public List<Team> getEmptyTeams() {
        logger.info("api endpoint that  returns a list of all empty teams ");
        return teamRepository.findByAgentidOrManagerid(0L,0L);
    }

}
