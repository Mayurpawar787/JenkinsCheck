package org.example.objectOrientedClasses;

public class DrSujith extends Surgeon{

    String name;
    void service(){
        System.out.println("I'm Dr.Sujith, Jr Surgeon..");
    }

    public static void main(String[] args) {
        DrSujith sujith = new DrSujith();
        sujith.service();
        sujith.treatPatient();
        sujith.makeIncision();
        System.out.println("Public Instance Variable from Parent : "+sujith.test);
        //***Note: Cannot Inherit Private Variables and Methods from SuperClass, gives error in Compilation
        //System.out.println("Private Instance Variable from Parent : "+sujith.testPrivVar);
        //***Note: Need to use Getters nd Setters to get Private Variables
        System.out.println("Private Instance Variable from Parent : "+sujith.getTestPrivVar());
        sujith.setTestPrivVar("updatedValuesofPrivateVar");
        System.out.println("Updated Private Instance Variable from Parent : "+sujith.getTestPrivVar());

    }

}
