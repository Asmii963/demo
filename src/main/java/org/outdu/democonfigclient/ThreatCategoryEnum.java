package org.outdu.democonfigclient;

public enum ThreatCategoryEnum {
    Intrusion, Theft, Hazard, SystemFault, CrowdBuildup,
    MovementViolation, SuspiciousActivity;

    public static ThreatCategoryEnum fromString(String category) {
        for (ThreatCategoryEnum threatCategory : ThreatCategoryEnum.values()) {
            if (threatCategory.name().equalsIgnoreCase(category)) {
                return threatCategory;
            }
        }
        throw new IllegalArgumentException("Invalid ThreatCategory: " + category);
    }

}
