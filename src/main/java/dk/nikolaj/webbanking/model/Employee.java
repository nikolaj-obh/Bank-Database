package dk.nikolaj.webbanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String firstName;
    private String lastName;
    private Boolean isAdmin;
    private String email;
    // TODO find correct datatype for passwords:
    private Character password;

    public Employee(
            Long ID,
            String firstName,
            String lastName,
            Boolean isAdmin,
            String email,
            Character password
    ) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
        this.email = email;
        this.password = password;
    }

    public Employee() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getPassword() {
        return password;
    }

    public void setPassword(Character password) {
        this.password = password;
    }
}
