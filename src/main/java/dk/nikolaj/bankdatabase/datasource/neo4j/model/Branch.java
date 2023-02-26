package dk.nikolaj.bankdatabase.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Getter
@Setter
@Node("branches")
public class Branch {

    @Id
    @GeneratedValue
    private Long ID;
    @Property(name = "branch_name")
    private String branchName;
    @Property(name = "address")
    private String address;
    @Property(name = "city")
    private String city;
    @Property(name = "state")
    private String state;
    @Property(name = "zip_code")
    private Integer zipcode;
    @Property(name = "phone")
    private String phoneNumber;
}
