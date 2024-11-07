package org.example.objectOrientedClasses;

public interface TestInterface {
    //Variables
    public String str = "testPubVari";

    default void pubConcreteMethod(String test2){
        System.out.println(test2);
    }

    //Constructor Not Allowed Here
    /*TestInterface(){
        System.out.println("Constructor in Interface");
    }*/

    //Test Interface
    void testMethod1();
    void testMethod2();
    public
    static String concreteMethod(String test){
        System.out.println(test);
        return test;
    }
}
