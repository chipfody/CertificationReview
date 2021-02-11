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
