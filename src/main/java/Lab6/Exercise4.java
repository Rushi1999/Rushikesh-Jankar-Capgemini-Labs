/*Exercise 4:  school offers medals to the students of tenth based on the following criteria
If(Marks>=90) : Gold
If(Marks between 80 and 90) : Silver
If(Marks between 70 and 80) : Bronze
Note: Marks between 80 and 90 means marks>=80 and marks<90


Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal.
The input Hashmap contains the student registration number as key and mark as value.
The output Hashmap should contain the student registration number as key and the medal type as value.

Method Name 	        getStudents
Method Description 	    Generate the list of students eligible for scholarship
Argument 	            Hashmap
Return Type         	Hashmap
Logic 	                The method should return the details of the students eligible for the medals along with the medal type. */


package Lab6;

import java.util.*;
public class Exercise4  {

    public static HashMap getStudents(HashMap<String, Integer> hmap) {

        HashMap<String, String> hMap = new HashMap<>();

        for (Map.Entry e : hmap.entrySet()) {

            int m = (int)e.getValue();

            if(m > 69 && m < 80) {

                hMap.put((String)e.getKey(), "Bronze MEDAL");

            } else if(m > 79 && m < 90) {
                hMap.put((String)e.getKey(), "Silver MEDAL");

            } else {
                if(m > 89 && m < 101) {
                    hMap.put((String)e.getKey(), "Gold MEDAL");
                }
            }
        }

        return hMap;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Shruti", 70);
        map.put("Shreyash", 81);
        map.put("Vijay", 92);
        map.put("Varsha", 52);
        System.out.println(getStudents(map));
    }


}
