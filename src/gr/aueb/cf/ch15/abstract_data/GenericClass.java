package gr.aueb.cf.ch15.abstract_data;

public abstract class GenericClass {
    private String firstname;
    private String lastname;

    public GenericClass() {

    }

    public GenericClass(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
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
