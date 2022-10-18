package dk.nikolaj.webbanking.customer;

import java.util.Date;

public class Customer {

    private Long ID;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String email;
    // TODO find correct datatype for passwords:
    private Character password;
    private String address;
    private String city;
    private String postal;

    public Customer(
            Long ID,
            String firstName,
            String lastName,
            Date birthday,
            String email,
            Character password,
            String address,
            String city,
            String postal
    ) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.password = password;
        this.address = address;
        this.city = city;
        this.postal = postal;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }
}
