package com.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties
@Entity(name = "employee")
@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@Table(indexes = {
        @Index(name = "idx_employee", columnList = "manager_id_manager")
})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee" , nullable = false)
    private long Id_Employee;

    @Column(name = "name", nullable = false)
    private String Name;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = CosCenter.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cos_center_id_cos_center", referencedColumnName = "id_cos_center")
    private CosCenter Cos_Center;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Manager.class)
    @JoinColumn(name = "manager_id_manager", referencedColumnName = "id_manager")
    private Manager Manager;

    @Column(name = "nr_of_phone",  nullable = false)
    private long Nr_Of_Phone;

    @Column(name = "password", nullable = false)
    private String Password;

    @Email
    @Column(name = "email", nullable = false)
    private String Email;

    @Column(name = "code", nullable = false)
    private long Code;

    public Employee() {

    }
}

