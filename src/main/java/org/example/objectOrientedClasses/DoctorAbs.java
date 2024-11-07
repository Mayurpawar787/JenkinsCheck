package org.example.objectOrientedClasses;

public class DoctorAbs {

    protected String testProt;
    public String test = "testInstanceVariable";
    private String testPrivVar="testPrivVariable";
    static String testInstVariable;
    boolean workAtHospital;

    public String getTestPrivVar() {
        return testPrivVar;
    }

    public void setTestPrivVar(String testPrivVar) {
        this.testPrivVar = testPrivVar;
    }

    void treatPatient(){
        System.out.println("Parent Doctor Treating Patients...");
    }

}
