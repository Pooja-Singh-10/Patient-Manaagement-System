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
import java.util.Scanner;

public class MainMenu {
 int i=0;
    Scanner scan=new Scanner(System.in);
    PatientDetails patientDetails[]=new PatientDetails[100];
    void OpenMenu(){ 
         boolean b=true;
        
        while(b==true){
            System.out.println("\n\n1. Create new Patient");
            System.out.println("2. History");
            System.out.println("3. Check Vital Signs");
            System.out.println("4. Update new Vital Signs");
            System.out.println("5. Exit");
            int a=scan.nextInt();
            if(a==1){
                i++;
                CreateNewPatient(i);
            }else if(a==5){
                b=false;
            }else if(a==2){
                getPatientHistory();
            }else if(a==4){
                updatePatientDetail();
            }else if(a==3){
                checkAbnormal();
            }
            
        }
    }
 

void CreateNewPatient(int m){
        patientDetails[m]=new PatientDetails();
        System.out.println("\n\nEnter Name of the Patient:");
        patientDetails[m].setName(scan.next());
       
        System.out.println("Enter the age of Person:");
        patientDetails[m].setPAge(scan.nextInt());
        
        
        System.out.println("Enter the Respiratory Rate:");
        patientDetails[m].setPRespiratoryRate(scan.nextInt());
        
       
        
        System.out.println("Enter the Heart Rate:");
        patientDetails[m].setPHeartRate(scan.nextInt());
        
         System.out.println("Enter the Blood Pressure:");
        patientDetails[m].setPBloodPressure(scan.nextInt());
        
        System.out.println("Enter the Weight(Kgs):");
        patientDetails[m].setPWeightInKg(scan.nextDouble());
        
        System.out.println("Enter the Weight(lbs):");
        patientDetails[m].setPWeightInPound(scan.nextDouble());

         if(IsPatientNormal(m)==false){
            System.out.println("\n\nPatient is Abnormal");
            patientDetails[m].setCondition_String(" Abnormal Condition");
        }else if(IsPatientNormal(m)==true){
            System.out.println("\n\nPatient is Normal");
            patientDetails[m].setCondition_String(" Normal Condition");
        }
       
        
    }

void getPatientHistory(){
        for(int n=1;n<=i;n++){
            
        String s=patientDetails[n].getName();
        System.out.println(n+" "+s);
                         
        }
        System.out.println("Enter Patient's Index:");
            int k=scan.nextInt();
            
            getInformation(k);
        
    }

 void getInformation(int x){
        System.out.println(patientDetails[x].getName());
           for(int y=0;y<patientDetails[x].getP_Age().size();y++){
                System.out.println("\n\nVisit:"+(y+1)+":Age:"+patientDetails[x].P_Age.get(y));
                System.out.println("Visit:"+(y+1)+":Heart Rate:"+patientDetails[x].P_HeartRate.get(y));
                System.out.println("Visit:"+(y+1)+":Respirotary Rate:"+patientDetails[x].P_RespiratoryRate.get(y));
                System.out.println("Visit:"+(y+1)+":Blood Pressure:"+patientDetails[x].P_BloodPressure.get(y));
                System.out.println("Visit:"+(y+1)+":Weight in KGs:"+patientDetails[x].P_WeightInKg.get(y));
                System.out.println("Visit:"+(y+1)+":Weight in LBs:"+patientDetails[x].P_WeightInPound.get(y));
                System.out.println("Visit:"+(y+1)+":Condition:"+patientDetails[x].condition.get(y));
            }   
        
        
    }

void updatePatientDetail(){
        int k;
            for(int n=1;n<=i;n++){
            
            
            System.out.println(n+" "+patientDetails[n].getName());
  
            
        }       
            System.out.println("Enter Patient's Index:");
             k=scan.nextInt();
            updatePatient(k);
    }

void updatePatient(int m){
        System.out.println("\n\nEnter the new age of Person:");
        patientDetails[m].setPAge(scan.nextInt());
        
        System.out.println("Enter the new Respiratory Rate:");
        patientDetails[m].setPRespiratoryRate(scan.nextInt());
        
        System.out.println("Enter the new Blood Pressure:");
        patientDetails[m].setPBloodPressure(scan.nextInt());
        
        System.out.println("Enter the new Heart Rate:");
        patientDetails[m].setPHeartRate(scan.nextInt());
        
        System.out.println("Enter the new Weight(Kgs):");
        patientDetails[m].setPWeightInKg(scan.nextDouble());
        
        System.out.println("Enter the new Weight(lbs):");
        patientDetails[m].setPWeightInPound(scan.nextDouble());

if(IsPatientNormal(m)==false){
            System.out.println("\n\nPatient is Abnormal");
            patientDetails[m].setCondition_String("Abnormal Condition");
            
        }else if(IsPatientNormal(m)==true){
            System.out.println("\n\nPatient is Normal");
            patientDetails[m].setCondition_String("Normal Condition");
        }
        
    }
    
void checkAbnormal(){
        int k;
          for(int n=1;n<=i;n++){
            System.out.println(n+" "+patientDetails[n].getName());
            }
          System.out.println("\n\nEnter Patient's Index:");
             k=scan.nextInt();
             ThisVitalSignNormal(k);
          
    }

 void ThisVitalSignNormal(int vsign){
        String sign=new String();
        int abc=0;
        System.out.println("\n\nAvailable options are:\n1)Respitory_Rate\n2)Heart_Rate\n3)Blood_Pressure\n4)Weight_in_Kgs\n5)Weight_in_Pounds  ");
        while(abc==0){
        System.out.println("\nEnter Vital Sign you want to check:");
        sign=scan.next();
        if (sign.equals("Respiratory_Rate")==true) {
            System.out.println("\n\nEnter Respiratory Rate to check:");
            int P_RespiratoryRate=scan.nextInt();
            if(verifyP_RespiratoryRate(patientDetails[vsign].getPAge(),P_RespiratoryRate)==false){
                System.out.println("\n\n ABNORMAL ");
                abc++;
            }else if(verifyP_RespiratoryRate(patientDetails[vsign].getPAge(),P_RespiratoryRate)==true){
                System.out.println("\n\n NORMAL ");
                abc++;
            }          
        }else  if (sign.equals("Heart_Rate")==true) {
            System.out.println("\n\nEnter Heart Rate to check:");
            int P_HeartRate=scan.nextInt();
            if(verifyP_HeartRate(patientDetails[vsign].getPAge(),P_HeartRate)==false){
                System.out.println("\n\n ABNORMAL ");
                abc++;
            }else if(verifyP_HeartRate(patientDetails[vsign].getPAge(),P_HeartRate)==true){
                System.out.println("\n\n NORMAL ");
                abc++;
            }          
        }else  if (sign.equals("Blood_Pressure")==true) {
            System.out.println("\n\nEnter Blood Pressure to check:");
            int P_BloodPressure=scan.nextInt();
            if(verifyStolic_bp(patientDetails[vsign].getPAge(),P_BloodPressure)==false){
                System.out.println("\n\n ABNORMAL ");
                abc++;
            }else if(verifyStolic_bp(patientDetails[vsign].getPAge(),P_BloodPressure)==true){
                System.out.println("\n\n NORMAL ");
                abc++;
            }          
        }else  if (sign.equals("Weight_in_Kgs")==true) {
            System.out.println("\n\nEnter Weigth in KG to check:");
            double weight=scan.nextDouble();
            if(verifyP_WeightInKg(patientDetails[vsign].getPAge(),weight)==false){
                System.out.println("\n\n ABNORMAL ");
                abc++;
            }else if(verifyP_WeightInKg(patientDetails[vsign].getPAge(),weight)==true){
                System.out.println("\n\n NORMAL ");
                abc++;
            }          
        }else  if (sign.equals("Weight_in_Pounds")==true) {
            System.out.println("\n\nEnter Respiratory Rate to check:");
            double P_WeightInPound=scan.nextDouble();
            if(verifyP_WeightInPound(patientDetails[vsign].getPAge(),P_WeightInPound)==false){
                System.out.println("\n\n ABNORMAL ");
                abc++;
            }else if(verifyP_WeightInPound(patientDetails[vsign].getPAge(),P_WeightInPound)==true){
                System.out.println("\n\n NORMAL ");
                abc++;
            }          
        }else{
            System.out.println("\n\nIncorrect Input \n Please enter again!!!");
        }
    }
    }

 
    boolean verifyP_RespiratoryRate(double age,int rate){
            if (age == 0) {
                if (rate >= 30 && rate <= 50) {
                return true;
            } else {
                return false;
            }
        }else if(age>=0 && age<=1){
                if(rate>=20 && rate<=30){
                    return true;
                }else{
                    return false;
                }
            }else if(age>1 && age<=3){
                if(rate>=20 && rate<=30){
                    return true;
                }else{
                    return false;
                }
            } else if(age>3 && age<=5){
                if(rate>=20 && rate<=30){
                    return true;
                }else{
                    return false;
                }
            } else if(age>=6 && age<=12){
                if(rate>=20 && rate<=30){
                    return true;
                }else{
                    return false;
                }
            } else if(age>12){
                if(rate>=12 && rate<=20){
                    return true;
                }else{
                    return false;
                }
            } 
            return true;
        
    }
    boolean verifyP_HeartRate(double age, int heartRate) {

        if (age == 0) {
            if (heartRate >= 120 && heartRate <= 160) {
                return true;
            } else {
                return false;
            }

        } else if (age > 0 && age <= 1) {
            if (heartRate >= 80 && heartRate <= 140) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (heartRate >= 80 && heartRate <= 130) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (heartRate >= 80 && heartRate <= 120) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (heartRate >= 70 && heartRate <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 13) {
            if (heartRate >= 55 && heartRate <= 105) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }
    boolean verifyStolic_bp(double age, int stolicBP) {

        if (age == 0) {
            if (stolicBP >= 50 && stolicBP <= 70) {
                return true;
            } else {
                return false;
            }

        } else if (age > 0 && age <= 1) {
            if (stolicBP >= 70 && stolicBP <= 100) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (stolicBP >= 80 && stolicBP <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (stolicBP >= 80 && stolicBP <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (stolicBP >= 80 && stolicBP <= 120) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 13) {
            if (stolicBP >= 110 && stolicBP <= 120) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }
    
    boolean verifyP_WeightInKg(double age, double Weightkgs) {

        if (age == 0) {
            if (Weightkgs >= 2 && Weightkgs <= 3) {
                return true;
            } else {
                return false;
            }

        } else if (age > 0 && age <= 1) {
            if (Weightkgs >= 4 && Weightkgs <= 10) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (Weightkgs >= 10 && Weightkgs <= 14) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (Weightkgs >= 14 && Weightkgs <= 18) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (Weightkgs >= 20 && Weightkgs <= 42) {
                return true;
            } else {
                return false;
            }
        } else if (age > 12) {
            if (Weightkgs >= 50) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }
    
    boolean verifyP_WeightInPound(double age, double weightPnds) {

        if (age == 0) {
            if (weightPnds >= 4.5 && weightPnds <= 7) {
                return true;
            } else {
                return false;
            }

        } else if (age >= 0 && age <= 1) {
            if (weightPnds >= 9 && weightPnds <= 22) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (weightPnds >= 22 && weightPnds <= 31) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (weightPnds >= 31 && weightPnds <= 40) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (weightPnds >= 41 && weightPnds <= 92) {
                return true;
            } else {
                return false;
            }
        } else if (age > 12) {
            if (weightPnds >= 110) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }

 boolean IsPatientNormal(int p){
        
        
        System.out.println(patientDetails[p].getPAge());
        if(patientDetails[p].getPAge()==0){
            //System.out.println("Infant");
            if (patientDetails[p].getPRespiratoryRate()>=30 && patientDetails[p].getPRespiratoryRate()<=50 && 
                    patientDetails[p].getPHeartRate()>=120 && patientDetails[p].getPHeartRate()<=160 && 
                    patientDetails[p].getPBloodPressure()>=50 && patientDetails[p].getPBloodPressure()<=70 &&
                    patientDetails[p].getPWeightInKg()>=2 && patientDetails[p].getPWeightInKg()<=3 &&
                    patientDetails[p].getPWeightInPound()>=4.5 && patientDetails[p].getPWeightInPound()<=7) {
                return true;
            }else{
                return false;
            }
        }else if(patientDetails[p].getPAge()>=0 && patientDetails[p].getPAge()<=1){
            //System.out.println("Infant");
            if (patientDetails[p].getPRespiratoryRate()>=20 && patientDetails[p].getPRespiratoryRate()<=30 && 
                    patientDetails[p].getPHeartRate()>=80 && patientDetails[p].getPHeartRate()<=140 && 
                    patientDetails[p].getPBloodPressure()>=70 && patientDetails[p].getPBloodPressure()<=100 &&
                    patientDetails[p].getPWeightInKg()>=4 && patientDetails[p].getPWeightInKg()<=10 &&
                    patientDetails[p].getPWeightInPound()>=9 && patientDetails[p].getPWeightInPound()<=22) {
                return true;
            }else{
                return false;
            }           
        }else if(patientDetails[p].getPAge()>1 && patientDetails[p].getPAge()<=3){
            //System.out.println("Toddler");
            if (patientDetails[p].getPRespiratoryRate()>=20 && patientDetails[p].getPRespiratoryRate()<=30 && 
                    patientDetails[p].getPHeartRate()>=80 && patientDetails[p].getPHeartRate()<=130 && 
                    patientDetails[p].getPBloodPressure()>=80 && patientDetails[p].getPBloodPressure()<=110 &&
                    patientDetails[p].getPWeightInKg()>=10 && patientDetails[p].getPWeightInKg()<=14 &&
                    patientDetails[p].getPWeightInPound()>=22 && patientDetails[p].getPWeightInPound()<=31) {
                return true;
            }else{
                return false;
            }           
            
        }else if(patientDetails[p].getPAge()>3 && patientDetails[p].getPAge()<=5){
            //System.out.println("school");
            if (patientDetails[p].getPRespiratoryRate()>=20 && patientDetails[p].getPRespiratoryRate()<=30 && 
                    patientDetails[p].getPHeartRate()>=80 && patientDetails[p].getPHeartRate()<=120 && 
                    patientDetails[p].getPBloodPressure()>=80 && patientDetails[p].getPBloodPressure()<=110 &&
                    patientDetails[p].getPWeightInKg()>=14 && patientDetails[p].getPWeightInKg()<=18 &&
                    patientDetails[p].getPWeightInPound()>=31 && patientDetails[p].getPWeightInPound()<=40) {
                return true;
            }else{
                return false;
            }           
            
        }else if(patientDetails[p].getPAge()>=6 && patientDetails[p].getPAge()<=12){
            //System.out.println("bacha");
            if (patientDetails[p].getPRespiratoryRate()>=20 && patientDetails[p].getPRespiratoryRate()<=30 && 
                    patientDetails[p].getPHeartRate()>=70 && patientDetails[p].getPHeartRate()<=110 && 
                    patientDetails[p].getPBloodPressure()>=80 && patientDetails[p].getPBloodPressure()<=120 &&
                    patientDetails[p].getPWeightInKg()>=20 && patientDetails[p].getPWeightInKg()<=42 &&
                    patientDetails[p].getPWeightInPound()>=41 && patientDetails[p].getPWeightInPound()<=92) {
                return true;
                
            }else{
                return false;
            }           
            
        }else if(patientDetails[p].getPAge()>12){
            
            //System.out.println("Adult");
            if (patientDetails[p].getPRespiratoryRate()>=12 && patientDetails[p].getPRespiratoryRate()<=20 && 
                    patientDetails[p].getPHeartRate()>=55 && patientDetails[p].getPHeartRate()<=105 && 
                    patientDetails[p].getPBloodPressure()>=110 && patientDetails[p].getPBloodPressure()<=120 &&
                    patientDetails[p].getPWeightInKg()>=50 &&
                    patientDetails[p].getPWeightInPound()>=110 ) {
                return true;
            }else{
                return false;
            }           
            
        }
        return true;
    }
    
    
}
