package dk.nikolaj.webbanking.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.Date;

@Getter
@Setter
@Node("employees")
public class Employee {

    @Id
    @GeneratedValue
    private Long ID;
    private String firstName;
    private String lastName;
    private Character gender;
    //@Column(name = "is_admin")
    //private Boolean isAdmin;
    private String accessLevel;
    private Long supervisorID;
    private Date birthday;
    private String address;
    private String city;
    private String state;
    private Integer zipcode;
    //@Column(name = "email")
    //private String email;
    // TODO implement login with email & password
    // TODO find correct datatype for passwords
    // TODO add assigned employee to customer?
    // TODO add employee role (for example Banker?)
    // TODO add Manager/Supervisor id for employees
}
