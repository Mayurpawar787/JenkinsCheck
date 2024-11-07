package org.example.objectOrientedClasses;

abstract class AbstractClassTest {
    //Types of Variables
    String constrTestStr;
    static String statVar="StaticVariable";
    public String str = "StringPublic";
    private String strPriv;
    public String getStrPriv() {
        return strPriv;
    }
    public void setStrPriv(String strPriv) {
        this.strPriv = strPriv;
    }
    protected int a = 9;
    //Constructor
    AbstractClassTest(String constrTestStr){
        System.out.println("This is Constructor in Abstract Clss");
        this.constrTestStr = constrTestStr;
    };
    //Abstract Methods
    abstract void abstractMethod1();
    void abstractMethod2(){};

    //Non Abstract Methods(Concrete)
    public void concreteMethod2(){
        System.out.println("This is also public void Concrete Method");
    };
    static String concreteMethinAbs(String test){
        return test;
    }

    public String getConstrTestStr() {
        return constrTestStr;
    }

    static void testStatMeth(){
        System.out.println("This is Static Method from Abstract Class");
    };
}
