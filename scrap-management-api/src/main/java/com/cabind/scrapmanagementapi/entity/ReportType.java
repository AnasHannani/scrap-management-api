package com.cabind.scrapmanagementapi.entity;

import lombok.Getter;

@Getter
public enum ReportType {
    DEFECTS_BY_ARTICLE("Defects by Article"),
    DEFECTS_BY_CAUSE("Defects by Cause"),
    DEFECTS_BY_ZONE("Defects by Zone"),
    DEFECTS_BY_SUPPLIER("Defects by Supplier");

    private final String label;

    ReportType(String label) {
        this.label = label;
    }
}
