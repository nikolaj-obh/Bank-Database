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
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private Character gender;
    @Column(name = "is_admin")
    private Boolean isAdmin;
    @Column(name = "email")
    private String email;
    // TODO implement login with email & password
    // TODO find correct datatype for passwords
    // TODO add assigned employee to customer?
    // TODO add employee role (for example Banker?)
    // TODO add Manager/Supervisor id for employees
}
