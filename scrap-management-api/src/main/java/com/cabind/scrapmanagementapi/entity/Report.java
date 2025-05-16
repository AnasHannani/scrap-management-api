package com.cabind.scrapmanagementapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "reports")
@Data
public class Report {

    @Id
    private String id; // UUID as String for easier external use

    // in PostgreSQL Only
//    @Id
//    @Column(columnDefinition = "UUID")
//    private UUID id;

    private String title;

    @Column(length = 1000)
    private String description;

    private String format; // e.g., PDF, CSV, XLSX

    @Enumerated(EnumType.STRING)
    private
    ReportType type; // e.g., DEFECTS_BY_ARTICLE, DEFECTS_BY_ZONE

    @Column(name = "generation_date")
    private LocalDateTime generationDate;

    private String filePath; // e.g., /reports/2025/04/report-uuid.pdf

    private String fileName; // e.g., defects_by_zone_20250405.pdf

    private Long fileSize; // in bytes

    @ManyToOne
    @JoinColumn(name = "analyst_id", nullable = false)
    private Analyst analyst;
    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private Admin admin;

    // Auto-generate ID before persisting
    @PrePersist
    public void generateId() {
        if (this.id == null || this.id.isBlank()) {
            this.id = UUID.randomUUID().toString();
        }
    }

    // Optional: add filters used to generate this report (like options)
//    private String filterCriteria; // JSON string of filters applied
}