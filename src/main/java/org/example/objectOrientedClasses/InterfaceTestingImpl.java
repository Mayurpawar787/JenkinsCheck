package org.example.objectOrientedClasses;

public class InterfaceTestingImpl implements TestInterface {

    @Override
    public void testMethod1() {
        System.out.println("Implemented Method1");
    }


    @Override
    public void testMethod2() {
        System.out.println("Implemented Method2");
    }


    public static void main(String[] args) {

        TestInterface interfaceTesting = new InterfaceTestingImpl();

        interfaceTesting.testMethod1();
        interfaceTesting.testMethod2();
        String str = TestInterface.concreteMethod("Test");
        //System.out.println(str);


    }
    
}
