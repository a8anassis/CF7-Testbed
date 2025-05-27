package gr.aueb.cf.ch15.abstract_data;

public class Student extends GenericClass {
    private String fatherName;
    private String motherName;

    public Student() {

    }

    public Student(String firstname, String lastname, String fatherName, String motherName) {
        super(firstname, lastname);
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
}
