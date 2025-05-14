package com.cabind.scrapmanagementapi.entity;

import java.sql.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;


@MappedSuperclass
@Getter // Lombok: génère les getters
@Setter // Lombok: génère les setters
@EntityListeners(AuditingEntityListener.class) // Active l'écoute des événements pour l'audit
public abstract class AuditInfo {

    @CreatedDate // Rempli automatiquement à la création par Spring Data Auditing
    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @CreatedBy // Rempli automatiquement à la création par l'AuditorAware
    @Column(name = "created_by", nullable = false, updatable = false)
    private String createdBy;

    @LastModifiedDate // Rempli automatiquement à la mise à jour par Spring Data Auditing
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @LastModifiedBy // Rempli automatiquement à la mise à jour par l'AuditorAware
    @Column(name = "updated_by")
    private String updatedBy;

    // Optionnel: pour soft delete
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    // Les getters et setters sont générés par Lombok @Getter/@Setter
    // Pas besoin de méthodes manuelles ici
}
