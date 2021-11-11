package Lab5;

import java.util.Scanner;

class SalaryException extends Exception
{
    public SalaryException(String str)
    {
        System.out.println(str);
    }
}
public class Excercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SALARY OF EMP");
        Double sal = sc.nextDouble();

        try
        {
            if(sal<3000)
            {
                throw new SalaryException("Below 3000");
            }
            else
            {
                System.out.println("SAL is greater than 3000");
            }

        }
        catch (SalaryException s)
        {
            System.out.println(s);
        }
    }
}
