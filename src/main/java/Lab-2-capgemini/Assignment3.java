/*Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order*/
package Day3;
import java.util.Scanner;
public class  Assignment3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int size =sc.nextInt();
        int [] arr = new int[size];


        System.out.println("ENTER ELEMENTS ");
        for (int i = 0; i < size; i++) {
           arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array in reverse order: ");

        for (int j = arr.length-1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}

/*O/P

* ENTER SIZE OF ARRAY
4
ENTER ELEMENTS 
1 2 3 4

Array in reverse order: 
4 3 2 1 

*
 */
