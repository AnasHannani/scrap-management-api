package com.cabind.scrapmanagementapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "operators")
@Data
public class Operator extends User {

    //@ManyToOne
    //@JoinColumn(name = "team_id")
    //private Team team;

    //@ManyToOne
    //@JoinColumn(name = "zone_id")
    //private Zone assignedZone;

    //@OneToMany(mappedBy = "operator")
    //private List<DefectiveItemDeclaration> pendingDeclarations = new ArrayList<>();
}
