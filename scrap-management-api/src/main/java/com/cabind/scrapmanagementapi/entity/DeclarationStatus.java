package com.cabind.scrapmanagementapi.entity;

public enum DeclarationStatus {
	REJECTED,
    DRAFT, // Créée par l'opérateur, non soumise
    PENDING_VALIDATION, // Soumise par l'opérateur, en attente de validation par le chef d'équipe
    VALIDATED // Validée par le chef d'équipe
}
