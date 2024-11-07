package org.example.objectOrientedClasses.polyMorphism;

public class MethodOverridingChild extends MethodOverridingParent {

    @Override
    public void parent() {
        System.out.println("Overidden by Child");
    }

    static String testString(){
        return "ChildStaticString";
    }

    String testString1(String test){
        System.out.println(test);
       return "childTest";
    }

    public static void main(String[] args) {

        MethodOverridingParent methodOverridingParent = new MethodOverridingChild();
        methodOverridingParent.parent();
        //methodOverridingParent.test();
        System.out.println(methodOverridingParent.testString1("test"));
    }

}
