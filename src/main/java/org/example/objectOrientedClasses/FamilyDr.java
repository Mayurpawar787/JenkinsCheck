package org.example.objectOrientedClasses;

public class FamilyDr extends DoctorAbs {

        boolean makeHouseCalls;

        void giveAdvice(){
            System.out.println("Family Doctor Giving Advices...");
        }

    public static void main(String[] args) {
        FamilyDr familyDr = new FamilyDr();
        DoctorAbs doctor = new FamilyDr();
        familyDr.treatPatient();


    }

}
