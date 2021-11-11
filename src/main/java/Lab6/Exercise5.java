/*
* Exercise 5: Create a method which accepts an array of integer elements and return the second smallest element in the array

Method Name 		    getSecondSmallest
Method Description 		Get the second smallest element in the array
Argument 		        int[]
Return Type 		    int
Logic 		            Sort the array and return the second smallest element in the array Hint: 1. Convert to Array List 2. Use sort method in Collections class
*/
package Lab6;

import java.util.*;
public class Exercise5 {

    public static int getSecondSmallest(int[] a) {

        List<Integer> l = new ArrayList<Integer>();

        for(int i = 0; i < a.length; i++) {
            l.add(a[i]);
        }

        Collections.sort(l);
        return l.get(1);
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter Arr here:");
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Second Smallest Integer is:");
            System.out.println("______________________________________");
            System.out.println(getSecondSmallest(a));
        }
    }

}

