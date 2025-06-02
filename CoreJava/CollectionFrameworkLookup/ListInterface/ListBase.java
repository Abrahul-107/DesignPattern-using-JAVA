package CoreJava.CollectionFrameworkLookup.ListInterface;

import java.util.ArrayList;
import java.util.List;

/*
Java List - Operations
List can be used only with a class that implements this interface. Now, let's see how to perform a few frequently used operations on the List.

Operation 1: Adding elements to List using add() method
Operation 2: Updating elements in List using set() method
Operation 3: Searching for elements using indexOf(), lastIndexOf methods
Operation 4: Removing elements using remove() method
Operation 5: Accessing Elements in List using get() method
Operation 6: Checking if an element is present in the List using contains() method
 */

public class ListBase {
    public static void main(String[] args) {

        List<String> listofstring = new ArrayList<>();
        // Adding element
        listofstring.add("OM");
        listofstring.add("Namah");
        listofstring.add("Shivay");
        System.out.println(listofstring);
        listofstring.add(2, "Mahadev");
        System.out.println(listofstring);

        // Removing element
        listofstring.remove(2);

        // Accessing element
        String str = listofstring.get(2);
        System.out.println(str);

        // Updating element
        listofstring.set(2, "Mahadev");
        System.out.println(listofstring);

        // Containing or not
        boolean check = listofstring.contains("Rahul");
        System.out.println(check);
    }
}