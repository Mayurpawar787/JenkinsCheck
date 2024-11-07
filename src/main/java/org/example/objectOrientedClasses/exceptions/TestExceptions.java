package org.example.objectOrientedClasses.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class TestExceptions {

    public static void main(String[] args) {
        //Below Are Unchecked Exceptions(Runtime Exception)
        //ArrayIndexOutOfBound
//        int[] arr = {1,2,3};
//        System.out.println(arr[4]);

        //NumberFormatException
        //int a= Integer.parseInt("12.34");

        //StringIndexOutOfBoundsException
        String str2 = null;
        //System.out.println(str2.charAt(1));
        //NullPointerException
        //System.out.println(str2.charAt(0));




        //Below are Checked CompileTime Exception
        /*try {
            String str = Arrays.toString(Files.readAllBytes(new File("testPath.txt").toPath()));
        }catch (Exception e){
            e.printStackTrace();
        }*/

        //File not Found Exception Compile Time
       /* File file = new File("E://file.txt");
        FileReader fileReader = new FileReader(file);*/
    }


}
