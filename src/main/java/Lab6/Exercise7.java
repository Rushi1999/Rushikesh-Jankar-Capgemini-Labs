/*Exercise 7: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order

Method Name 	        getSorted
Method Description 	    Return the resulting array after reversing the numbers and sorting it
Argument 	            int []
Return Type 	        int
Logic 	                Accept and integer array, reverse the numbers in the array, sort it and return the resulting array.
Hint
1. Convert the numbers to String to reverse it
2. Use Collection APIs to sort it
*/
package Lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7{


    public static int[] getSecondSmallest(int[] a) {

        List<Integer> l = new ArrayList<Integer>();

        for(int i = 0; i < a.length; i++) {
            String s = "" + a[i];
            StringBuilder sbr = new StringBuilder(s);
            String st = "" + sbr.reverse();
            l.add(Integer.parseInt(st));
        }

        Collections.sort(l);
        for(int i = 0; i < a.length; i++) {
            a[i] = l.get(i);
        }
        return a;
    }

    public static void main(String[] args) {

        while(true) {
            System.out.println("Enter the Arr here:");
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            getSecondSmallest(a);
            System.out.println("________________________");
            System.out.println("Sorted Arr:");
            for(int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        }

    }
}
