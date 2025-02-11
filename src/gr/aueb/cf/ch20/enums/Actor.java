package gr.aueb.cf.ch20.enums;

public enum Actor {
    STUDENT("ROLE_STUDENT"),
    TEACHER("ROLE_TEACHER");

    private final String role;

    Actor(String role) {
        this.role = role;
    }

    public String toRole() {
        return role;
    }
}
