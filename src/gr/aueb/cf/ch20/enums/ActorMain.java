package gr.aueb.cf.ch20.enums;


public class ActorMain {

    public static void main(String[] args) {
        Actor actor = Actor.STUDENT;
        System.out.println(actor.getRole());
        System.out.println(actor.name());
    }
}
