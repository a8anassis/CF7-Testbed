package gr.aueb.cf.ch12;

/**
 * Data class.
 * POJO (Plain Old Java Object)
 * Java Bean.
 */
public class Student {
    private static int studentsCount;

    private int id;
    private String firstname;
    private String lastname;

    static {
        studentsCount = 0;
    }

    // Default Constructor
    public Student() {
        studentsCount++;
    }

    // Overloaded Constructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public static int getStudentsCount() {
        return studentsCount;
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
}
