package dk.nikolaj.webbanking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "branches")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "branch_name")
    private String branchName;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state", columnDefinition = "char(2)")
    private Character state;
    @Column(name = "zip_code")
    private Integer zipcode;
    @Column(name = "phone_number")
    private String phoneNumber;
}
