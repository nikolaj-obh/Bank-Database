package dk.nikolaj.webbanking.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Getter
@Setter
@Node("branches")
public class Branch {

    @Id
    @GeneratedValue
    private Long ID;
    private String branchName;
    private String address;
    private String city;
    private String state;
    private Integer zipcode;
    private String phoneNumber;
}
