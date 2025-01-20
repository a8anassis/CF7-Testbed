package gr.aueb.cf.ch16.interfaces.model;

public class Customer {
    private Long id;
    private String vat;
    private String region;
    private String address;
    private String lastname;
    private String firstname;
    private String phoneNumber;

    public Customer() {

    }

    public Customer(Long id, String vat,
                    String region, String address, String lastname, String firstname, String phoneNumber) {
        this.id = id;
        this.vat = vat;
        this.region = region;
        this.address = address;
        this.lastname = lastname;
        this.firstname = firstname;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
