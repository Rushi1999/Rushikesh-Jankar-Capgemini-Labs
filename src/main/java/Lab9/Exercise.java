/*Exercise 1: Write a lambda expression which accepts x and y numbers and return xy.
 */

package Lab9;


interface Addable{
    int add(int x,int y);
}

public class Exercise{
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addable ad1=(x,y)->(x+y);
        System.out.println(ad1.add(10,20));

        // Multiple parameters with data type in lambda expression
        Addable ad2=(int x,int y)->
        {
            return (x);
        };
        System.out.println(ad2.add(100,200));
    }
}