package gr.aueb.cf.ch20.lambdas;

public class Teacher {
    private int id;
    private String firstname;
    private String lastname;

    public Teacher() {

    }

    public Teacher(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "id: " + id + ", Firstname: " + firstname + ", Lastname: " + lastname;
    }

    public void printInstanceTeacher() {
        System.out.println("id: " + id + ", Firstname: " + firstname + ", Lastname: " + lastname);
    }

    public static void printStaticTeacher(Teacher teacher) {
        System.out.println("id: " + teacher.getId() + ", Firstname: " + teacher.getFirstname() +
                ", Lastname: " + teacher.getLastname());
    }
}
