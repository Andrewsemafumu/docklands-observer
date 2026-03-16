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

//I applied Inheritence and polymorphism in this class 

public abstract class IssueReport extends ReportDetails {
    private String issue; // This could be broken traffic lights on the road or even an accident causing traffic 

    //constructor 
    public IssueReport(String issue, String reporterName, String location, 
                      String description, LocalDateTime timestamp, String status) {
        super(reporterName, location, description, timestamp, status);
        this.issue = issue;
    }
   //getters 
    public String getIssue() {
        return issue;
    }

    public String getCategory() {
        return "Issue: " + issue;
    }

    @Override
    public String getSummary() {
        return timestamp.toString() + " - " + issue + " at " + location;
    }
    //method for returning details for issue report 
    @Override
    public String getFullDetails() {
        return """
               Issue Report
               Reporter: """ + reporterName + "\n"
                + "Location: " + location + "\n"
                + "Issue: " + issue + "\n"
                + "Description: " + description + "\n"
                + "Reported: " + timestamp + "\n"
                + "Status: " + status;
    }
}