package gr.aueb.cf.solutions.ch15;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat(2, "White Cat");
        Animal dog = new Dog(3, "Black Dog");
        cat.speak();
        dog.speak();
        System.out.println(cat);
        System.out.println(dog);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
