package com.aiIncident.AiIncident.ai;

public class AiLogicSimulator {
    public static String getSeverity(String description) {
        // Simple logic to determine severity based on keywords
        String lowerDesc = description.toLowerCase();
        
        if (lowerDesc.contains("critical") || lowerDesc.contains("down") || lowerDesc.contains("outage")) {
            return "CRITICAL";
        } else if (lowerDesc.contains("error") || lowerDesc.contains("failed") || lowerDesc.contains("broken")) {
            return "HIGH";
        } else if (lowerDesc.contains("slow") || lowerDesc.contains("degraded") || lowerDesc.contains("issue")) {
            return "MEDIUM";
        } else {
            return "LOW";
        }
    }

    public static String getCategory(String description) {
        // Simple logic to determine category based on keywords
        String lowerDesc = description.toLowerCase();
        
        if (lowerDesc.contains("database") || lowerDesc.contains("db")) {
            return "DATABASE";
        } else if (lowerDesc.contains("network") || lowerDesc.contains("connection")) {
            return "NETWORK";
        } else if (lowerDesc.contains("server") || lowerDesc.contains("host")) {
            return "INFRASTRUCTURE";
        } else if (lowerDesc.contains("api") || lowerDesc.contains("service")) {
            return "APPLICATION";
        } else {
            return "GENERAL";
        }
    }
}
