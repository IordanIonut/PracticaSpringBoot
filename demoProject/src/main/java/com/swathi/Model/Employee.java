package com.swathi.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_employee")
    private Long Id_Employee;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Cos_Center")
    private String Cos_Center;
    @Column(name = "Manager")
    private String Manager;
    @Column(name = "Nr_Of_Phone")
    private int Nr_Of_Phone;
    @Column(name = "Password")
    private String Password;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Code")
    private String Code;

    public Employee() {
    }

    public Employee(String name, String cos_Center, String manager, int nr_Of_Phone, String password, String email, String code) {
        Name = name;
        Cos_Center = cos_Center;
        Manager = manager;
        Nr_Of_Phone = nr_Of_Phone;
        Password = password;
        Email = email;
        Code = code;
    }

    public Employee(Long id_Employee, String name, String cos_Center, String manager, int nr_Of_Phone, String password, String email, String code) {
        Id_Employee = id_Employee;
        Name = name;
        Cos_Center = cos_Center;
        Manager = manager;
        Nr_Of_Phone = nr_Of_Phone;
        Password = password;
        Email = email;
        Code = code;
    }
}

