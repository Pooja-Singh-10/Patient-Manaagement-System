/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2PartTwo;

/**
 *
 * @author Pooja
 */

import java.util.ArrayList;
import java.util.List;

public class PatientDetails {
    
    
    ArrayList<Integer> P_Age= new ArrayList<>();
    ArrayList<Integer> P_RespiratoryRate= new ArrayList<>();
    ArrayList<Integer> P_HeartRate= new ArrayList<>();
    ArrayList<Integer> P_BloodPressure= new ArrayList<>();
    ArrayList<Double> P_WeightInKg= new ArrayList<>();
    ArrayList<Double> P_WeightInPound= new ArrayList<>();
    ArrayList<String> condition=new ArrayList<>();
    String name=new String();
    
    double PAge;
    double PWeightInKg;
    double PWeightInPound;
    int PRespiratoryRate;
    int PHeartRate;
    int PBloodPressure;
    
    String condition_String=new String();
    
    public ArrayList<String> getCondition() {
        return condition;
    }

    public void setCondition(ArrayList<String> condition) {
        this.condition = condition;
    }

    public String getCondition_String() {
        return condition_String;
    }

    public void setCondition_String(String condition_String) {
        condition.add(condition_String);
        this.condition_String = condition_String;
    }

     public double getPWeightInKg() {
        return PWeightInKg;
    }

    public void setPWeightInKg(double PWeightInKg) {
        P_WeightInKg.add(PWeightInKg);
        this.PWeightInKg = PWeightInKg;
    }

    public double getPWeightInPound() {
        return PWeightInPound;
    }

    public void setPWeightInPound(double PWeightInPound) {
        P_WeightInPound.add(PWeightInPound);
        this.PWeightInPound = PWeightInPound;
    }

    public int getPRespiratoryRate() {
        return PRespiratoryRate;
    }

    public void setPRespiratoryRate(int PRespiratoryRate) {
        P_RespiratoryRate.add(PRespiratoryRate);
        this.PRespiratoryRate = PRespiratoryRate;
    }

    public int getPHeartRate() {
        return PHeartRate;
    }

    public void setPHeartRate(int PHeartRate) {
        P_HeartRate.add(PHeartRate);
        this.PHeartRate = PHeartRate;
    }

    public int getPBloodPressure() {
        return PBloodPressure;
    }

    public void setPBloodPressure(int PBloodPressure) {
        P_BloodPressure.add(PBloodPressure);
        this.PBloodPressure = PBloodPressure;
    }

    public double getPAge() {
        return PAge;
    }

    public void setPAge(int PAge) {
        P_Age.add(PAge);
        this.PAge = PAge;
    }
    

 
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Integer> getP_Age() {
        return P_Age;
    }

    public void setP_Age(ArrayList<Integer> P_Age) {
        this.P_Age = P_Age;
    }

    public List<Integer> getP_RespiratoryRate() {
        return P_RespiratoryRate;
    }

    public void setP_RespiratoryRate(ArrayList<Integer> P_RespiratoryRate) {
        this.P_RespiratoryRate = P_RespiratoryRate;
    }

    public List<Integer> getP_HeartRate() {
        return P_HeartRate;
    }

    public void setP_HeartRate(ArrayList<Integer> P_HeartRate) {
        this.P_HeartRate = P_HeartRate;
    }

    public List<Integer> getP_BloodPressure() {
        return P_BloodPressure;
    }

    public void setP_BloodPressure(ArrayList<Integer> P_BloodPressure) {
        this.P_BloodPressure = P_BloodPressure;
    }

    public List<Double> getP_WeightInKg() {
        return P_WeightInKg;
    }

    public void setP_WeightInKg(ArrayList<Double> P_WeightInKg) {
        this.P_WeightInKg = P_WeightInKg;
    }

    public List<Double> getP_WeightInPound() {
        return P_WeightInPound;
    }

    public void setP_WeightInPound(ArrayList<Double> P_WeightInPound) {
        this.P_WeightInPound = P_WeightInPound;
    }
    
    
    }

