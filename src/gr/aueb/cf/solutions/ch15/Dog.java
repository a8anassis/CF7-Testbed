package gr.aueb.cf.solutions.ch15;

public class Dog extends Animal {

    public Dog() {
        //super();
    }

    public Dog(int id, String name) {
        super(id, name);
    }

    @Override
    public void speak() {
        System.out.println("Dog is speaking.");
    }

    @Override
    public String toString() {
        return "id: " + getId() + ", name: " + getName();
    }
}
