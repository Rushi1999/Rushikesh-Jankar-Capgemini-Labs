/*Exercise 5: Write a method to calculate factorial of a number. Test this method using method reference feature. */
package Lab9;
import   java.util.function.Function;
import java.util.Scanner;

public class   Exercise5 {

    public Integer factorial(int n) {         // instance method
        if(n==0   || n==1){
            return 1;
        }
        return n *   factorial(n-1);
    }

    public static void   main(String[] args) {

        //using   lambda
        Exercise5 cal = new Exercise5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        Function<Integer, Integer> funLambda = (a) ->   cal.factorial(n);
        System.out.println("Factorial of "+n+":"+funLambda.apply(n));

        // bound type
        Function<Integer, Integer> funBoundType = cal::factorial;
        System.out.println("Using a method References To Instance bound type: "+funBoundType.apply(5));

    }
}