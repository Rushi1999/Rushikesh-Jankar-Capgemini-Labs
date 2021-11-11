/* Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName is blank.*/

package Lab5;

import java.util.Scanner;
 class NameException extends Exception{

    public NameException (String str)
    {
        System.out.println(str);
    }
}
public class Excercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NAME");
        String fname= sc.next();
        System.out.println("ENTER LAST NAME");
        String lname= sc.next();

        try
        {
            if (fname != null && lname != null)
            {
                System.out.println("Valid Full name ");
            }
            else {
                throw new NameException("Invalid name");
            }
        }
        catch (NameException name)
        {
            System.out.println(name);
        }
    }
}
