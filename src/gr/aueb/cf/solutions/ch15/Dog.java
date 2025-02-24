package gr.aueb.cf.solutions.ch15;

public class Dog extends Animal {

    public Dog() {
        //super();
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void speak() {
        System.out.println("Dog is speaking.");
    }

    @Override
    public String toString() {
        return "id: " + getAge() + ", name: " + getName();
    }
}
