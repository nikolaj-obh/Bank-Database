package dk.nikolaj.webbanking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private Character gender;
    @Column(name = "date_of_birth")
    private Date birthday;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "zip_code")
    private Integer zipCode;
    @Column(name = "email")
    private String email;
    // TODO implement login with email & password
    // TODO find correct datatype for passwords
    // TODO add assigned employee to customer?

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<Loan> loans = new HashSet<>();
}
