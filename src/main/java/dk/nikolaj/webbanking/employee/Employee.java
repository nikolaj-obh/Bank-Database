package dk.nikolaj.webbanking.employee;

public class Employee {

    private Long ID;
    private String firstName;
    private String lastName;
    private Boolean isAdmin;
    private String email;
    // find correct datatype for passwords: private String password;

    public Employee(
            Long ID,
            String firstName,
            String lastName,
            Boolean isAdmin,
            String email
    ) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
        this.email = email;
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
}
