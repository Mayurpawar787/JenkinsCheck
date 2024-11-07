package org.example.objectOrientedClasses;

public class AbstractImplClass extends AbstractClassTest{

    @Override
    void abstractMethod1() {
        System.out.println("implementing body in abstract Method 1 however not using Abstract Method 2");
    }

    AbstractImplClass(){
        super("TestSuperConstr");
        System.out.println("Child Constr Called");
    }

    public static void main(String[] args) {

        /*AbstractImplClass abstractClass = new AbstractImplClass();
        abstractClass.abstractMethod1();*/

        AbstractClassTest abstractClassTest = new AbstractImplClass();
        abstractClassTest.abstractMethod1();
        abstractClassTest.abstractMethod2();
        System.out.println(AbstractClassTest.concreteMethinAbs("TestConcrete"));
        abstractClassTest.concreteMethod2();
        String newStr = abstractClassTest.str;
        System.out.println(newStr);
        AbstractImplClass.testStatMeth();
        System.out.println(abstractClassTest.getConstrTestStr());

    }

}