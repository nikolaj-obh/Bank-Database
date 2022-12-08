package dk.nikolaj.webbanking.datasource.mongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Document(collection = "customers")
public class Customer {

    @Id
    private Long ID;
    private String firstName;
    private String lastName;
    private Character gender;
    private Date birthday;
    private String address;
    private String city;
    private String state;
    private Integer zipCode;
    private String email;
    // TODO implement login with email & password
    // TODO find correct datatype for passwords
    // TODO add assigned employee to customer?

    @DBRef
    private Set<Loan> loans = new HashSet<>();
}
