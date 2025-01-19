package gr.aueb.cf.solutions.ch12;

public class Main {

    public static void main(String[] args) {
        User user = new User(1L, "Alice", "Wonderland");
        UserCredentials userCredentials = new UserCredentials(1L, "bob", "12345");

        System.out.println("{" + user.getId() + ", " + user.getFirstname() + ", " + user.getLastname() + "}");
        System.out.println("{" + userCredentials.getId() + ", " + userCredentials.getUsername() + ", " + userCredentials.getPassword() + "}");
    }
}
