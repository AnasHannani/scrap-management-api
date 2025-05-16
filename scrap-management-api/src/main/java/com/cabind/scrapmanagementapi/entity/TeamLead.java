package com.cabind.scrapmanagementapi.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "team_leads")
@Data
public class TeamLead extends User {

    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;

}
