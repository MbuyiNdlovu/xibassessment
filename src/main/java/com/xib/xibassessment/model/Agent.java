package com.xib.xibassessment.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Agent")
public class Agent {

    @Id
    @Column(name = "Id")
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private Long Id;

    @Column(name = "agentname")
    private String agentname;

    @Column(name = "agentsurname")
    private String agentsurname;

    @Column(name= "managerid")
    private Long managerid;

    @Column(name= "teamid")
    private Long teamid;

}
