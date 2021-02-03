package StringsAndThings;

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
