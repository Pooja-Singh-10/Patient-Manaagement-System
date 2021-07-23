/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in thishe editor.
 */
package Part4;
        

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author Pooja
 */
public class Test {
    public static void main(String[] args) {

        
        ArrayList<Object> data = scanPerson();       
        Person p1 = new Person(data.get(0).toString(), data.get(1).toString(), data.get(2).toString(), data.get(3).toString(), data.get(4).toString());
        data = scanPerson();
        Person p2 = new Person(data.get(0).toString(), data.get(1).toString(), data.get(2).toString(), data.get(3).toString(), data.get(4).toString());
       //Person p3 = new Person("Dan3", "Brown", "Seattle", "SLU", "103");
        //Person p4 = new Person("Dan11", "Brown", "Seattle", "UW", "101");
        //Person p5 = new Person("Dan12", "Brown", "Seattle", "UW", "102");
        //Person p6 = new Person("Dan13", "Brown", "Seattle", "UW", "103");

        data = scanPerson();
        ArrayList<Object> data1 = scanPatient();
        Patient pt1 = new Patient(data.get(0).toString(), data.get(1).toString(), data.get(2).toString(), data.get(3).toString(), data.get(4).toString())
                .addVitalSigns(new VitalSigns((int) data1.get(0),
                (int) data1.get(1),
                (int) data1.get(2),
                (int) data1.get(3),
                (long)data1.get(4),
                (long)data1.get(5))) ;
        data = scanPerson();
        data1 = scanPatient();
        Patient pt2 = new Patient(data.get(0).toString(), data.get(1).toString(), data.get(2).toString(), data.get(3).toString(), data.get(4).toString())
                .addVitalSigns(new VitalSigns((int) data1.get(0),
                (int) data1.get(1),
                (int) data1.get(2),
                (int) data1.get(3),
                (long)data1.get(4),
                (long)data1.get(5))) ;
        data = scanPerson();
        data1 = scanPatient();
        Patient pt3 = new Patient(data.get(0).toString(), data.get(1).toString(), data.get(2).toString(), data.get(3).toString(), data.get(4).toString())
                .addVitalSigns(new VitalSigns((int) data1.get(0),
                (int) data1.get(1),
                (int) data1.get(2),
                (int) data1.get(3),
                (long)data1.get(4),
                (long)data1.get(5))) ;
        data = scanPerson();
        data1 = scanPatient();
        Patient pt4 = new Patient(data.get(0).toString(), data.get(1).toString(), data.get(2).toString(), data.get(3).toString(), data.get(4).toString())
                .addVitalSigns(new VitalSigns((int) data1.get(0),
                (int) data1.get(1),
                (int) data1.get(2),
                (int) data1.get(3),
                (long)data1.get(4),
                (long)data1.get(5))) ;
        data = scanPerson();
        data1 = scanPatient();
        Patient pt5 = new Patient(data.get(0).toString(), data.get(1).toString(), data.get(2).toString(), data.get(3).toString(), data.get(4).toString())
                .addVitalSigns(new VitalSigns((int) data1.get(0),
                (int) data1.get(1),
                (int) data1.get(2),
                (int) data1.get(3),
                (long)data1.get(4),
                (long)data1.get(5))) ;
        data = scanPerson();
        data1 = scanPatient();
        Patient pt6 = new Patient(data.get(0).toString(), data.get(1).toString(), data.get(2).toString(), data.get(3).toString(), data.get(4).toString())
                .addVitalSigns(new VitalSigns((int) data1.get(0),
                (int) data1.get(1),
                (int) data1.get(2),
                (int) data1.get(3),
                (long)data1.get(4),
                (long)data1.get(5))) ;

        System sys = new System();
        sys     .addPatient(pt1)
                .addPatient(pt2)
                .addPatient(pt3)
                .addPatient(pt4)
                .addPatient(pt5)
                .addPatient(pt6)

                .addPerson(p1)
                .addPerson(p2);
                //.addPerson(p3)
                //.addPerson(p4)
                //.addPerson(p5)
                //.addPerson(p6);

        Map<String, Integer> abonormals = sys.getAbonormalsForAllCommunities("systolicBloodPressure");

        abonormals.entrySet().stream().forEach(e -> java.lang.System.out.println(e));
    }
    
    public static ArrayList<Object> scanPerson(){
        ArrayList<Object> input = new ArrayList<>();
        Scanner person = new Scanner(java.lang.System.in);
        java.lang.System.out.print("Enter first name: ");
        String firstName = person.nextLine();
        java.lang.System.out.print("Enter last name: ");
        String lastName = person.nextLine();
        java.lang.System.out.print("Enter City: ");
        String city = person.nextLine();
        java.lang.System.out.print("Enter Community: ");
        String community = person.nextLine();
        java.lang.System.out.print("Enter Street Address: ");
        String streetAddress = person.nextLine();
        
        input.add(firstName);
        input.add(lastName);
        input.add(city);
        input.add(community);
        input.add(streetAddress);
        
        return input;     
}
    
    public static ArrayList<Object> scanPatient(){
        ArrayList<Object> input = new ArrayList<>();
        Scanner patient = new Scanner(java.lang.System.in);
        java.lang.System.out.print("Enter Age Group of the Patient: ");
        int ageInMonths = patient.nextInt();
        java.lang.System.out.print("Enter Respiratory Rate of the Patient: ");
        int respiratoryRate = patient.nextInt();
        java.lang.System.out.print("Enter Heart Rate of the Patient: ");
        int heartRate = patient.nextInt();
        java.lang.System.out.print("Enter Blood Pressure of the Patient: ");
        int systolicBloodPressure = patient.nextInt();
        java.lang.System.out.print("Enter Weight of the Patient (in kg): ");
        long weightInKgs = patient.nextLong();
        java.lang.System.out.print("Enter Weight of the Patient (in pounds): ");
        long weightInPonds = patient.nextLong();
        input.add(ageInMonths);
        input.add(respiratoryRate);
        input.add(heartRate);
        input.add(systolicBloodPressure);
        input.add(weightInKgs);
        input.add(weightInPonds);
        return input;      
    }
}


    

