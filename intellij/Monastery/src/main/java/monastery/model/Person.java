package monastery.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person extends Entity {

    private String firstName;
    private String lastName;
    private String email;
    private String oib;

    public Person() {
    }

    public Person(Integer id, String firstName, String lastName, String email, String oib) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.oib = oib;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }
}
