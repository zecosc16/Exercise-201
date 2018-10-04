/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_201;

import java.time.LocalDateTime;

/**
 *
 * @author johannesriedmueller
 */
public class Measurement {
    private LocalDateTime dateTime;
    private String label;
    private int velocityMeasured;
    private int velocityAllowed;

    public Measurement(LocalDateTime dateTime, String label, int velocityMeasured, int velocityAllowed) {
        this.dateTime = dateTime;
        this.label = label;
        this.velocityMeasured = velocityMeasured;
        this.velocityAllowed = velocityAllowed;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getLabel() {
        return label;
    }

    public int getVelocityMeasured() {
        return velocityMeasured;
    }

    public int getVelocityAllowed() {
        return velocityAllowed;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setVelocityMeasured(int velocityMeasured) {
        this.velocityMeasured = velocityMeasured;
    }

    public void setVelocityAllowed(int velocityAllowed) {
        this.velocityAllowed = velocityAllowed;
    }
    
    
}
