/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportdetails;

import java.time.LocalDateTime;

/**
 *
 * @author HP
 */

public abstract class Infrastracture extends ReportDetails {
    private String assetType;
    private String urgency;

    public Infrastracture(String assetType, String urgency, String reporterName, 
                      String location, String description, LocalDateTime timestamp, String status) {
        super(reporterName, location, description, timestamp, status);
        this.assetType = assetType;
        this.urgency = urgency;
    }

    public String getAssetType() {
        return assetType;
    }

    public String getUrgency() {
        return urgency;
    }

    public String getCategory() {
        return "Infrastracture: " + assetType + " (" + urgency + " urgency)";
    }

    @Override
    public String getSummary() {
        return timestamp.toString() + " - " + urgency + ": " + assetType + " at " + location;
    }

    @Override
    public String getFullDetails() {
        return """
               Infrastracture Report
               Reporter: """ + reporterName + "\n"
                + "Location: " + location + "\n"
                + "Asset Type: " + assetType + "\n"
                + "Urgency: " + urgency + "\n"
                + "Description: " + description + "\n"
                + "Reported: " + timestamp + "\n"
                + "Status: " + status;
    }
}
