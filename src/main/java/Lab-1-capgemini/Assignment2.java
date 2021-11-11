package Java_Assignment;

import java.util.Scanner;

public class Assignment2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT COLOR CHOICE");
        System.out.println("1:RED");
        System.out.println("2:YELLOW");
        System.out.println("3:GREEN");

        int ch= sc.nextInt();

        Excercize1 ex= new Excercize1();
    switch (ch)
    {
        case 1:
            ex.Red();
            break;
        case 2:
            ex.Green();
            break;
        case 3:
            ex.Yellow();
            break;
        default:
            System.out.println("WRONG CHOICE");

    }

    }
    void Red()
    {
        System.out.println("STOP");
    }
    void Green()
    {
        System.out.println("GO");
    }
    void Yellow()
    {
        System.out.println("READY");
    }
}