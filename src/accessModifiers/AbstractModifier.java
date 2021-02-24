package accessModifiers;


public class AbstractModifier {
}

abstract class Animal {
    public abstract String getName();
}
abstract class BigCat extends Animal {
    public abstract void roar();

}
class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.getName());
        lion.roar();

    }
}


