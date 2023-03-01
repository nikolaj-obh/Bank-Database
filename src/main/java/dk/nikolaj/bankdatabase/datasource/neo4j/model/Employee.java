package dk.nikolaj.bankdatabase.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.util.Date;

@Getter
@Setter
@Node("employees")
public class Employee {

    @Id
    @GeneratedValue
    private Long ID;
    @Property(name = "first_name")
    private String firstName;
    @Property(name = "last_name")
    private String lastName;
    @Property(name = "gender")
    private Character gender;
    //@Column(name = "is_admin")
    //private Boolean isAdmin;
    @Property(name = "level_of_access")
    private String accessLevel;
    @Property(name = "supervisor_id")
    private Long supervisorID;
    @Property(name = "birthday")
    private Date birthday;
    @Property(name = "address")
    private String address;
    @Property(name = "city")
    private String city;
    @Property(name = "state")
    private String state;
    @Property(name = "zip_code")
    private Integer zipcode;
    //@Column(name = "email")
    //private String email;
    // TODO implement login with email & password
    // TODO find correct datatype for passwords
    // TODO add assigned employee to customer?
    // TODO add employee role (for example Banker?)
    // TODO add Manager/Supervisor id for employees
}
