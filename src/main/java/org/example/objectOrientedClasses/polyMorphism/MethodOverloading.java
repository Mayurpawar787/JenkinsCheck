package org.example.objectOrientedClasses.polyMorphism;

public class MethodOverloading {
    //Compile Time Polymorphism, Static Polymorphism & Method Overloading done in Single Class

    private double multiply(int a, double b, String c){
        double d = Double.parseDouble(c);
        return a*b*d;
    }
    public int multiply(int a, int b){
        return a*b;
    }

    //Not allowed as it is changing only return stmt adn keeping parameters and name same
    /*public int multiply(int a, int b){
        return a+b;
    }*/

    /*public double multiply(int a, int b){
        return 4.5;
    }*/

    public double multiply(double a, double b, double c){
        return a*b*c;
    }

    static String multiply(){
        return "testWithoutParameters";
    }

    static void testMethod(String firstName, String... args){
        System.out.println(firstName);
        System.out.println(args[0]);
        System.out.println(args[1]);
    }

    public static void main(String[] args) {

        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.multiply(2,3.5,"2.7"));
        System.out.println(MethodOverloading.multiply());
        System.out.println(methodOverloading.multiply(2,4));
        System.out.println(methodOverloading.multiply(2.4,3.2,5.45));

        testMethod("Mayur","Pawar","Test");

    }
}
