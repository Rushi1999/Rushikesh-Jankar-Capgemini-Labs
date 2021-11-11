/*  Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol . */

package Lab3;
import  java.util.*;

public class Excercise2 {


        public String getImage(String str)
        {
            StringBuffer sbr = new StringBuffer(str);
            sbr.append('|');
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            sbr.append(sb);
            return sbr.toString();
        }
        public static void main(String[] ar)
        {
            Excercise2 E = new Excercise2();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = s.next();
            System.out.println(E.getImage(str));
        }
    }

