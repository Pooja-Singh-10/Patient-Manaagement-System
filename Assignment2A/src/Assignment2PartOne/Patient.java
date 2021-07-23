/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2PartOne;

import java.util.Scanner;

/**
 *
 * @author Pooja
 */
public class Patient {
    static VitalSigns Patient1=new VitalSigns();
    static Scanner scan = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      getPatientInformation();
      if (IsPatientNormal()==false) {
            System.out.println("Patient is Abnormal");
            
        }else if(IsPatientNormal()==true){
            System.out.println("Patient is Normal");
        }
}

static void getPatientInformation(){
        System.out.println("Enter the age of Person:");
        Patient1.setAge(scan.nextInt());
        
        System.out.println("Enter the Respiratory Rate:");
        Patient1.setRespiratoryRate(scan.nextInt());
        
        System.out.println("Enter the Blood Pressure:");
        Patient1.setBloodPressure(scan.nextInt());
        
        System.out.println("Enter the Heart Rate:");
        Patient1.setHeartRate(scan.nextInt());
        
        System.out.println("Enter the Weight(Kgs):");
        Patient1.setWeightInKg(scan.nextInt());
        
        System.out.println("Enter the Weight(lbs):");
        Patient1.setWeightInPound(scan.nextInt());
    }
static boolean IsPatientNormal(){
        System.out.println(Patient1.getAge());
        if(Patient1.getAge()==0){
            //System.out.println("New Born");
            if (Patient1.getRespiratoryRate()>=30 && Patient1.getRespiratoryRate()<=50 && 
                    Patient1.getHeartRate()>=120 && Patient1.getHeartRate()<=160 && 
                    Patient1.getBloodPressure()>=50 && Patient1.getBloodPressure()<=70 &&
                    Patient1.getWeightInKg()>=2 && Patient1.getWeightInKg()<=3 &&
                    Patient1.getWeightInPound()>=4.5 && Patient1.getWeightInPound()<=7) {
                return true;
            }else{
                return false;
            }
        }else if(Patient1.getAge()>=0 && Patient1.getAge()<=1){
            //System.out.println("Infant");
            if (Patient1.getRespiratoryRate()>=20 && Patient1.getRespiratoryRate()<=30 && 
                    Patient1.getHeartRate()>=80 && Patient1.getHeartRate()<=140 && 
                    Patient1.getBloodPressure()>=70 && Patient1.getBloodPressure()<=100 &&
                    Patient1.getWeightInKg()>=4 && Patient1.getWeightInKg()<=10 &&
                    Patient1.getWeightInPound()>=9 && Patient1.getWeightInPound()<=22) {
                return true;
            }else{
                return false;
            }           
        }else if(Patient1.getAge()>1 && Patient1.getAge()<=3){
            //System.out.println("Toddler");
            if (Patient1.getRespiratoryRate()>=20 && Patient1.getRespiratoryRate()<=30 && 
                    Patient1.getHeartRate()>=80 && Patient1.getHeartRate()<=130 && 
                    Patient1.getBloodPressure()>=80 && Patient1.getBloodPressure()<=110 &&
                    Patient1.getWeightInKg()>=10 && Patient1.getWeightInKg()<=14 &&
                    Patient1.getWeightInPound()>=22 && Patient1.getWeightInPound()<=31){
                return true;
            }else{
                return false;
            }           
            
        }else if(Patient1.getAge()>3 && Patient1.getAge()<=5){
            //System.out.println("Preschooler");
            if (Patient1.getRespiratoryRate()>=20 && Patient1.getRespiratoryRate()<=30 && 
                    Patient1.getHeartRate()>=80 && Patient1.getHeartRate()<=120 && 
                    Patient1.getBloodPressure()>=80 && Patient1.getBloodPressure()<=110 &&
                    Patient1.getWeightInKg()>=14 && Patient1.getWeightInKg()<=18 &&
                    Patient1.getWeightInPound()>=31 && Patient1.getWeightInPound()<=40){
                return true;
            }else{
                return false;
            }           
            
        }else if(Patient1.getAge()>=6 && Patient1.getAge()<=12){
           // System.out.println("School Age");
            if (Patient1.getRespiratoryRate()>=20 && Patient1.getRespiratoryRate()<=30 && 
                    Patient1.getHeartRate()>=70 && Patient1.getHeartRate()<=110 && 
                    Patient1.getBloodPressure()>=80 && Patient1.getBloodPressure()<=120 &&
                    Patient1.getWeightInKg()>=20 && Patient1.getWeightInKg()<=42 &&
                    Patient1.getWeightInPound()>=41 && Patient1.getWeightInPound()<=92) {
                return true;
                
            }else{
                return false;
            }           
            
        }else if(Patient1.getAge()>12){
            
           // System.out.println("Adolescent");
            if (Patient1.getRespiratoryRate()>=12 && Patient1.getRespiratoryRate()<=20 && 
                    Patient1.getHeartRate()>=55 && Patient1.getHeartRate()<=105 && 
                    Patient1.getBloodPressure()>=110 && Patient1.getBloodPressure()<=120 &&
                    Patient1.getWeightInKg()>50&&
                    Patient1.getWeightInPound()>110) {
                return true;
            }else{
                return false;
            }           
            
        }
        return true;
    }
}