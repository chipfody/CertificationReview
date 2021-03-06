package dataTypes;

public class WorkingWithMethods {
}

class MyClass {
    double calcAverage(double marks1, int marks2) {
        return (marks1 + marks2)/2.0;
    }
    double calcAverage(int marks1, double marks2) {
        return (marks1 + marks2)/2.0;
    }
    public static void main(String args[]) {
        MyClass myClass = new MyClass();
        myClass.calcAverage(2.1, 3);
    }
}

class Employee {
    {
        System.out.println("Employee:initializer 2");
    }
    Employee() {
        System.out.println("Employee:constructor");
    }

    {
        System.out.println("Employee:initializer");
    }
}

class TestEmp {
    public static void main(String args[]) {
        Employee e = new Employee();
    }
}

class Employee3 {
    String name;
    int age;
    Employee3() {
        this ("Tom", 25);
    }
    Employee3 (String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}

class Employee4 {
    String name;
    int age;
    Employee4() {
        age = 22;
    }
    public void setName(String val) {
        name = val;
    }
    public void printEmp() {
        System.out.println("name = " + name + " age = " + age);
    }
}

class Office {
    public static void main(String args[]) {
        Employee4 e1 = new Employee4();
        Employee4 e2 = new Employee4();
        e1.name = "Selvan";
        e2.setName("Harry");
        e1.printEmp();
        e2.printEmp();
    }
}

class Employee5 {
    int age;
    void modifyVal(int a) {
        this.age = a + 1;
        System.out.println(a);
    }
}
class Office2 {
    public static void main(String args[]) {
        Employee5 e = new Employee5();
        System.out.println(e.age);
        e.modifyVal(e.age);
        System.out.println(e.age);
    }
}

class Person {
    private String name;
    Person(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    public void setName(String val) {
        name = val;
    }
}

class Test {
    public static void swap(Person p1, Person p2) {
        String temp = p1.getName();
        p1.setName(p2.getName());
        p2.setName(temp);
        }

    public static void main(String args[]) {
        Person person1 = new Person("John");
        Person person2 = new Person("Paul");
        System.out.println(person1.getName()
                + " : " + person2.getName());
        swap(person1, person2);
        System.out.println(person1.getName()
                + " : " + person2.getName());
    }
}

class UnaryOperators {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        long x1 = 5;
        long y1 = (x1 = 3);
        System.out.println(x1); // Outputs 3
        System.out.println(y1); // Also, outputs 3

        int z = 6;
        boolean y2 = (z >= 6) || (++z <= 7);
        System.out.println(z);
        System.out.println(y2);
    }
}

class Loops {
    public static void main(String[] args) {
        int x;
        long y = 10;
        for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            //System.out.print(x + " ");
        }
        System.out.print(x + " ");
    }
}

class SwitchSample {
    public static void main(String[] args) {
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue FIRST_CHAR_LOOP;
                System.out.print(" " + a + x);
            }
        }
    }
}

