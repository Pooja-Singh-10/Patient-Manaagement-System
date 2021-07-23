/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part4;

/**
 *
 * @author win 10
 */
import java.util.Date;

public class Encounter {
    private VitalSigns vitalSigns;
    private Date date;

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public Date getDate() {
        return date;
    }

    public Encounter(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
        this.date = new Date();
    }
    
    @Override
    public String toString() {
    return "Encounter{" + "vitalSigns=" + vitalSigns + ", date=" + date + '}';
}
}