package lecnotes.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {
    //WrapperClasses: Integer - Boolean - Float - Double - Byte....
    public static void main(String[] args) {
        //Don't reference the primitive type in the generics
//        ArrayList<Integer> numbers = new ArrayList<>();
//        ArrayList differentVariables = new ArrayList();
//
//
//        System.out.println("\n::Adding data to the Array::");
//        System.out.println("Adding 20 at index 0: ");
//        numbers.add(20);
//        System.out.println("Adding 21 at index 0: ");
//        numbers.add(0, 21); //Pushes 20 to index 1
//        System.out.println("Adding 22 at end of array: ");
//        numbers.add(22);
//        System.out.println();
//        System.out.println("Numbers: " + numbers);
//
//        System.out.println("\n:Setting 250 at index 2::");
//        numbers.set(2, 250);
//
//        //Adding something at index 10
////        numbers.add(10, 100); //ERROR! Out of range
//        System.out.println("Adding 100 at the end of the array");
//        numbers.add(numbers.size(), 100);
//
//
//        System.out.println("\n::Getting info about the Array::");
//        System.out.println("Second index: " + numbers.get(2));
//        System.out.println("'20' at index: " + numbers.indexOf(20));
//        System.out.println("Size of numbers: " + numbers.size());
//        System.out.println("Array contains 50: " + numbers.contains(50));
//        System.out.println("Array is empty?: " + numbers.isEmpty());
//        System.out.println("Removing 20: " + numbers.remove(Integer.valueOf(20)));
//        System.out.println("Numbers: " + numbers);
//
//        System.out.println("\n::Creating an Array of different types::");
//        System.out.println("Adding 'Dude' to array: ");
//        differentVariables.add("Dude");
//        System.out.println("Adding '3' to array: ");
//        differentVariables.add("3");
//        System.out.println("\n::differentVariable Types are different!:: " + differentVariables);


//        Hashmaps
        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Luis", "MontealegreLuis");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");
        System.out.println(usernames);

        System.out.println(usernames.get("Ryan")); //Returns the value at the "Ryan" key
        System.out.println(usernames.get("Phillip")); //Doesn't Exist, returns null
        System.out.println(usernames.getOrDefault("Kay", "gocodeup")); //Get the key's value or return gocodup
// "gocodeup"
        System.out.println(usernames.containsKey("Luis")); //Returns true if it exists
        System.out.println(usernames.containsValue("zgulde")); //Returns true if value exists

        System.out.println("Changing the value of 'Ryan'");
        usernames.put("Ryan", "changedValue");
        System.out.println("Ryan's new value: " + usernames.get("Ryan"));

        usernames.putIfAbsent("Ben", "superCoolGuy");
        usernames.putIfAbsent("Ryan", "Test");
        System.out.println(usernames);

        usernames.clear(); //nukes it
        System.out.println(usernames.isEmpty()); // returns boolean


    }


}
