/*: Create a method which accepts a hash map and return the values of the map in sorted order as a List.
*
 Method Name 	        getValues
Method Description 	    Get the values of a map in sorted order
Argument 	            HashMap
Return Type 	        List
Logic 	                 Return the values of a hash map in sorted order
* */
package Lab6;

import java.util.*;
public class Exercise {

    @SuppressWarnings("unchecked")
    public static List sortByValue(HashMap<String, Integer> map) {

        List list = new LinkedList(map.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object obj1, Object obj2) {
                return ((Comparable) ((Map.Entry) (obj1)).getValue()).compareTo(((Map.Entry) (obj2)).getValue());
            }
        });
        return list;

    }

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 23);
        map.put("B", 31);
        map.put("C", 96);

        List<?> list = sortByValue(map);
        System.out.println(list);

    }

}

