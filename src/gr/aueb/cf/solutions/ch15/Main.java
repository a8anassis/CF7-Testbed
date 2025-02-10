package gr.aueb.cf.solutions.ch15;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal cat2 = new Cat(1, "White Cat");
        cat1.speak();
        System.out.println(cat2);

        Animal dog1 = new Dog();
        Animal dog22 = new Dog(1, "Black Dog");
        dog1.speak();
        System.out.println(dog2);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
