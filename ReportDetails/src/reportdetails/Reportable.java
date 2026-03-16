/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reportdetails;

import java.time.LocalDateTime;

/**
 *
 * @author HP
 */
//methods being implemented 

public interface Reportable {
    String getSummary();
    String getFullDetails();
    String getLocation();
    LocalDateTime getTimestamp();
}