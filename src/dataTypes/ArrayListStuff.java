package dataTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStuff {
    public static void main(String[] args) {


//        ArrayList list = new ArrayList();
//        list.add("hawk");
//        list.add(Boolean.TRUE); // [hawk, true]
//        System.out.println(list);
//
//        List<String> birds = new ArrayList<>();
//        birds.add("hawk"); // [hawk]
//        birds.add(1, "robin"); // [hawk, robin]
//        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
//        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
//        System.out.println(birds); // [blue jay, cardinal, hawk, robin]
//        System.out.println(birds.remove("heron"));
//        System.out.println(birds.remove("hawk"));
//        System.out.println(birds);

//        List<String> numList = new ArrayList<>();
//        numList.add("1");
//        numList.add("2");
//        numList.add("3");
//        numList.add("4");
//        numList.add("5");
//        System.out.println(numList);
//        numList.remove(2);
//        System.out.println(numList);
//        numList.remove("4");
//        System.out.println(numList);
//        numList.set(0, "0");
//        System.out.println(numList);

//        List <Integer> newList = new ArrayList<>();
//        newList.add(1);
//        newList.add(2);
//        newList.add(3);
//        newList.add(4);
//        newList.add(5);
//        System.out.println(newList);
//        newList.remove(Integer.valueOf(3));
//        System.out.println(newList);

//        String[] array = { "hawk", "robin" }; // [hawk, robin]
//        List<String> list = Arrays.asList(array); // returns fixed size list
//        System.out.println(list.size()); // 2
//        System.out.println(list);
//        list.set(1, "test"); // [hawk, test]
//        array[0] = "new"; // [new, test]
//           for (String b : array) System.out.println(b + " "); // new test
//        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("hawk");
        list2.add("robin");
        System.out.println(list2);
        String[] stringArray = list2.toArray(new String[0]);
        System.out.println(stringArray.length);
        for (String s : stringArray)
            System.out.println(s);

    }
}
