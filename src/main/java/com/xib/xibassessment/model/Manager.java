package com.xib.xibassessment.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Manager")
public class Manager {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "managername")
    private String managername;

    @Column(name = "managersurname")
    private String managersurname;


   /* @OneToMany(mappedBy = "managerinstance")
    private List <Team> teamList = new ArrayList<>();
*/
}