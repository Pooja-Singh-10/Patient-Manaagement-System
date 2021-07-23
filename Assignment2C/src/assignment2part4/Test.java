/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author win 10
 */
public class Test {


    /**
     *
     * @author win 10
     */
    public static void main(String[] args) {

         ArrayList<Object> data = scanPerson(); 
         ArrayList<Object> data1 = scanPatient();
        Patient pt1 = new Patient(data.get(0).toString(), data.get(1).toString())
                .addVitalSigns(new VitalSigns((int) data1.get(0),
                (int) data1.get(1),
                (int) data1.get(2),
                (int) data1.get(3),
                (long)data1.get(4),
                (long)data1.get(5))) ;
        data1 = scanPatient();
         pt1  
                .addVitalSigns(new VitalSigns((int) data1.get(0),
                (int) data1.get(1),
                (int) data1.get(2),
                (int) data1.get(3),
                (long)data1.get(4),
                (long)data1.get(5))) ;
        data1 = scanPatient();
         pt1
                .addVitalSigns(new VitalSigns((int) data1.get(0),
                (int) data1.get(1),
                (int) data1.get(2),
                (int) data1.get(3),
                (long)data1.get(4),
                (long)data1.get(5))) ;
         
        pt1.printVitalSigns();
         
        java.lang.System.out.println(pt1.isPatientNormal());
        java.lang.System.out.println(pt1.isThisVitalSignNormal("systolicBloodPressure"));


        java.lang.System.out.println("_____________________________________________");
        
    }
     public static ArrayList<Object> scanPerson(){
        ArrayList<Object> input = new ArrayList<>();
        Scanner person = new Scanner(java.lang.System.in);
        java.lang.System.out.print("Enter First Name");
        String firstName = person.nextLine();
        java.lang.System.out.print("Enter Last Name");
        String lastName = person.nextLine();
        
        
        input.add(firstName);
        input.add(lastName);
        
        return input;     
}
    
    public static ArrayList<Object> scanPatient(){
        ArrayList<Object> input = new ArrayList<>();
        Scanner patient = new Scanner(java.lang.System.in);
        java.lang.System.out.print("Age Group");
        int ageInMonths = patient.nextInt();
        java.lang.System.out.print("Respiratory Rate");
        int respiratoryRate = patient.nextInt();
        java.lang.System.out.print("Heart Rate");
        int heartRate = patient.nextInt();
        java.lang.System.out.print("Sysolic Blood Pressure");
        int systolicBloodPressure = patient.nextInt();
        java.lang.System.out.print("Weight in kg");
        long weightInKgs = patient.nextLong();
        java.lang.System.out.print("Weight in pounds");
        long weightInPonds = patient.nextLong();
        input.add(ageInMonths);
        input.add(respiratoryRate);
        input.add(heartRate);
        input.add(systolicBloodPressure);
        input.add(weightInKgs);
        input.add(weightInPonds);
        return input;      
}}

