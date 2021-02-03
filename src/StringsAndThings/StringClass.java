package StringsAndThings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StringClass {
    public static void main(String[] args) {
        String one = "one";
        String two = new String("one");
        String three = new String("one");

        System.out.println(one == two);
        System.out.println(one.equals(two));
        System.out.println(two == three);
    }
}

class Test {

    public static void main(String[] args) {
        String line = "The quick brown fox jumped over the lazy dog";

//        for (int i = 0; i <line.length(); i++)
//            System.out.println(line.substring(0, 1 + i));

        System.out.println("The length of the sentence is :" + line.length() + " letters");
        System.out.println("The letter in the 12th position is : " + line.charAt(12));
        System.out.println("The first occurrence of the letter q is at position: " + line.indexOf('q'));
        System.out.println("lazy occurs starting at position: " + line.indexOf("lazy"));
        System.out.println("Does the sentence starts with the word 'Of'?  " + line.startsWith("Of") );
        System.out.println("Does the sentence end with the word 'dog?  " + line.endsWith("dog"));
    }

}

class Main {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>(Arrays.asList("Volvo", "Toyota", "Honda", "Tesla", "Ford", "Mazda"));

        Iterator<String> iterator = cars.iterator();

       while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
