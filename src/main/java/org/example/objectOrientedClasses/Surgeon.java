package org.example.objectOrientedClasses;

public class Surgeon extends DoctorAbs{

    @Override
    void treatPatient() {
        System.out.println("First Print: child Dr Treating Patients...");
        super.treatPatient();
    }

    void makeIncision(){
        System.out.println("child Surgeon Making Incisions...");
    }

    void managingDoctors(){
        System.out.println("Managing other Jr Doctors");
    }

    /*public static void main(String[] args) {

     DoctorAbs doctor = new Surgeon();
     //Surgeon surgeon = new Surgeon();
     doctor.treatPatient();
     *//*boolean flag = surgeon.workAtHospital;
        System.out.println(flag);*//*
     //surgeon.treatPatient();


    }*/

}
