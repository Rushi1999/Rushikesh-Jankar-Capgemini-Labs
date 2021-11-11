package Lab5;

import java.util.Scanner;
import java.io.*;

class AgeException extends Exception {

    public AgeException(String str) {
        System.out.println(str);
    }
}
public class Excercise1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER AGE");
        double age= sc.nextDouble();


        try {
            if(age>15)
            {

                System.out.println("Valid age");
            }
            else {
                throw  new AgeException("Invalid Age");
            }
        }
        catch (AgeException e){
            System.out.println(e);
        }
    }

}
