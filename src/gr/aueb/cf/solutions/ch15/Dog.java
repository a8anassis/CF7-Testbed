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
        System.out.println("I am a Dog!");
    }

    @Override
    public String toString() {
        return "id: " + getId() + ", name: " + getName();
    }
}
