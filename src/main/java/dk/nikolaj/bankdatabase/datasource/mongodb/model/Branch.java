package dk.nikolaj.bankdatabase.datasource.mongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "branches")
public class Branch {

    @Id
    private Long ID;
    private String branchName;
    private String address;
    private String city;
    private String state;
    private Integer zipcode;
    private String phoneNumber;
}
