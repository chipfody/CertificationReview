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

class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = new StringBuilder(sb.append("+end")); // "start+middle+end"
        System.out.println(sb == same);
        System.out.println(sb);
        StringBuilder same2 = new StringBuilder(sb.append("+end"));
        System.out.println(same2
        );
    }
}

class StringBuilderTest2 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}

class StringBuilderTest3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
        System.out.println(sb);
    }
}

class Tiger {
    String name;
public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;
        System.out.println(t1 == t3); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false
         }
}
