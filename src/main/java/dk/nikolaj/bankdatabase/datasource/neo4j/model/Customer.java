package dk.nikolaj.bankdatabase.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
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
    @Property(name = "first_name")
    private String firstName;
    @Property(name = "last_name")
    private String lastName;
    @Property(name = "gender")
    private Character gender;
    @Property(name = "birthday")
    private Date birthday;
    @Property(name = "address")
    private String address;
    @Property(name = "city")
    private String city;
    @Property(name = "state")
    private String state;
    @Property(name = "zip_code")
    private Integer zipCode;
    @Property(name = "email")
    private String email;
    // TODO implement login with email & password
    // TODO find correct datatype for passwords
    // TODO add assigned employee to customer?

    @Relationship(type = "HAS_LOAN")
    private Set<Loan> loans = new HashSet<>();
}
