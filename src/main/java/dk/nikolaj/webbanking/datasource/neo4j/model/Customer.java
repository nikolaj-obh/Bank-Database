package dk.nikolaj.webbanking.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Node("customers")
public class Customer {

    @Id
    @GeneratedValue
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

    @Relationship
    private Set<Loan> loans = new HashSet<>();
}
