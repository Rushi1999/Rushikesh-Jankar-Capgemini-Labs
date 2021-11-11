/*Exercise 6: Create a method which accepts the id and the age of people as a Map and decide if they are eligible for vote. A person is eligible for vote if his age is greater than 18. Add the IDs of all the eligible persons to list and return the list.

Method Name 	    votersList
Method Description 	Generate the list of voters based on the ages of the people
Argument 	        Map
Return Type 	    List
Logic 	            Accept a map with ID as key and Date of Birth as value and check if the person is eligible to vote. A person is eligible for vote for if his age is greater than 18. If the person is eligible add his ID to the list. */
package Lab6;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class  Exercise6 {


    public static List<Integer>  votersList(HashMap<Integer, String> hmap) {

        LocalDate curr = LocalDate.now();

        List<Integer> l = new ArrayList<Integer>();

        for(Map.Entry<Integer, String> i: hmap.entrySet()) {
            LocalDate dob = LocalDate.parse(i.getValue());
            Period age = Period.between(dob, curr);
            if(age.getYears() > 18) {
                l.add(i.getKey());
            }
        }
        return l;
    }

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "1999-07-05");
        map.put(2, "2007-08-11");
        map.put(3, "2000-02-14");
        System.out.println(votersList(map));

    }



}
