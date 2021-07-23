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
public class VitalSigns {


    private int ageInMonths;
    private int respiratoryRate;
    private int heartRate;
    private int systolicBloodPressure;
    private float weightInKgs;
    private float weightInPonds;

    public VitalSigns(int ageInMonths, int respiratoryRate, int heartRate, int systolicBloodPressure, long weightInKgs, long weightInPonds) {
        this.ageInMonths = ageInMonths;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.systolicBloodPressure = systolicBloodPressure;
        this.weightInKgs = weightInKgs;
        this.weightInPonds = weightInPonds;
    }

    public boolean isNormal() {
        return VitalsByAgeGroup.isVitalSignsNormal(this);
    }

    // TODO: add more cases
    public boolean isNormal(final String vitalSignName) {
        final VitalsByAgeGroup vitalsByAgeGroup = VitalsByAgeGroup.getVitalsByAgeGroup(this.ageInMonths);
        switch (vitalSignName) {
            case "respiratoryRate":
                return vitalsByAgeGroup.respiratoryRate.contains(this.respiratoryRate);
            case "heartRate":
                return vitalsByAgeGroup.heartRate.contains(this.heartRate);
            case "systolicBloodPressure":
                return vitalsByAgeGroup.systolicBloodPressure.contains(this.systolicBloodPressure);
            case "weightInKgs":
                return vitalsByAgeGroup.weightInKgs.contains(this.weightInKgs);
            case "weightInPounds":
                return vitalsByAgeGroup.weightInPonds.contains(this.weightInPonds);
            default:
                throw new IllegalArgumentException("Invalid Argument: " + vitalSignName);
        }
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public float getWeightInKgs() {
        return weightInKgs;
    }

    public float getWeightInPonds() {
        return weightInPonds;
    }

    @Override
    public String toString() {
        return "VitalSigns{" + "ageInMonths=" + ageInMonths + ", respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate
                + ", systolicBloodPressure=" + systolicBloodPressure + ", weightInKgs=" + weightInKgs + ", weightInPonds=" + weightInPonds
                + '}';
    }



    private enum VitalsByAgeGroup {
        // TODO: fill and verify the range for vitals
        NEWBORN(new Range(30,50), new Range(120,160), new Range(50,70),new Range(2,3),new Range(4.5f,7) ),
        INFANT(new Range(20,30), new Range(80,140), new Range(70,100),new Range(4,10),new Range(9,22) ),
        TODDLER(new Range(20,30), new Range(80,130), new Range(80,110),new Range(10,14),new Range(22,31) ),
        PRE_SCHOOL(new Range(20,30), new Range(80,120), new Range(80,110),new Range(14,18),new Range(31,40) ),
        SCHOOL_AGE(new Range(20,30), new Range(70,110), new Range(80,120),new Range(20,42),new Range(41,92) ),
        ADOLESCENT(new Range(12,20), new Range(55,105), new Range(110,120),new Range(50, Float.MAX_VALUE),new Range(110, Float.MAX_VALUE) );

        VitalsByAgeGroup(Range respiratoryRate, Range heartRate, Range systolicBloodPressure, Range weightInKgs, Range weightInPonds) {
            this.respiratoryRate = respiratoryRate;
            this.heartRate = heartRate;
            this.systolicBloodPressure = systolicBloodPressure;
            this.weightInKgs = weightInKgs;
            this.weightInPonds = weightInPonds;
        }

        private Range respiratoryRate;
        private Range heartRate;
        private Range systolicBloodPressure;
        private Range weightInKgs;
        private Range weightInPonds;

        public static boolean isVitalSignsNormal(final VitalSigns vitalSigns) {
            final VitalsByAgeGroup vitalsByAgeGroup = getVitalsByAgeGroup(vitalSigns.getAgeInMonths());
            return vitalsByAgeGroup.respiratoryRate.contains(vitalSigns.getRespiratoryRate()) &&
                    vitalsByAgeGroup.heartRate.contains(vitalSigns.getHeartRate()) &&
                    vitalsByAgeGroup.systolicBloodPressure.contains(vitalSigns.getSystolicBloodPressure()) &&
                    vitalsByAgeGroup.weightInKgs.contains(vitalSigns.getWeightInKgs()) &&
                    vitalsByAgeGroup.weightInPonds.contains(vitalSigns.getWeightInPonds());
        }

        // TODO: verify if else
        private static VitalsByAgeGroup getVitalsByAgeGroup(int age) {
            if (age == 0) {
                return VitalsByAgeGroup.NEWBORN;
            } else if (age > 0 && age <= 12) {
                return VitalsByAgeGroup.INFANT;
            } else if (age > 12 && age <= 36) {  // requirement not clear what to do with age 3?
                return VitalsByAgeGroup.TODDLER;
            } else if (age > 36 && age <= 60) {
                return VitalsByAgeGroup.PRE_SCHOOL;
            } else if (age >= 60 && age <= 144) {
                return VitalsByAgeGroup.SCHOOL_AGE;
            }  else if (age > 144 && age <=240);{
                return VitalsByAgeGroup.ADOLESCENT;
            }
        }
    }

    // Helper class to hold rangeÃ¥
    private static class Range {

        private float low;
        private float high;
        public Range(float low, float high){
            this.low = low;
            this.high = high;
        }

        public boolean contains(float number){
            return (number >= low && number <= high);
        }

        @Override
        public String toString() {
            return "Range{" + "low=" + low + ", high=" + high + '}';
        }

    }
}