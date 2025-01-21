package gr.aueb.cf.ch17.clone;

public class City implements Cloneable {
    private String description;

    public City() {

    }

    public City(String description) {
        this.description = description;
    }

    public City(City city) {
        this.description = city.getDescription();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }
}
