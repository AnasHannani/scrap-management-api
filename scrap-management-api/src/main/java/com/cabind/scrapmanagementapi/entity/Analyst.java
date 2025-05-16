package com.cabind.scrapmanagementapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "analysts")
@Data
public class Analyst extends User {

    @OneToMany(mappedBy = "analyst", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Report> reports;
}
