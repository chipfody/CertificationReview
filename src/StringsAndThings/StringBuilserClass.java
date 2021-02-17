package StringsAndThings;

public class StringBuilserClass {
}

class Person {
    final StringBuilder name = new StringBuilder("Sh");
    Person() {
        name.append("reya");
        //name = new StringBuilder();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
    }
}
class TestStrings {
    static String addString (String a) {
        a = a + "addOn";
        return a;
    }

    static StringBuilder addStringBuilder(StringBuilder b) {
        b = b.append("String");
        return b;
    }
    public static void main(String[] args) {
        String word = "word";
        StringBuilder build = new StringBuilder("build");
        String newWord = addString(word);
        System.out.println(word);
        System.out.println(newWord);
        System.out.println(addStringBuilder(build));
    }
}
