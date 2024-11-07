package org.example.objectOrientedClasses.polyMorphism;

public class MethodOverridingParent {

    public void parent(){
        System.out.println("Parent Method");
    }

    static String testString(){
        return "ParentStaticString";
    }

    String testString1(String str){
        return "ParentStaticString";
    }

}
