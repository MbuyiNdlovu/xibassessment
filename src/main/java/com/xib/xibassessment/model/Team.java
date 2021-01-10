package com.xib.xibassessment.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name= "Team")
public class Team {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long Id;

    @Column (name = "teamname")
    private String teamname;

    @Column (name = "agentid")
    private Long agentid;

    @Column (name = "managerid")
    private Long managerid;

    @ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name="managerid", insertable = false, updatable = false)
    private Manager managerinstance;




}
