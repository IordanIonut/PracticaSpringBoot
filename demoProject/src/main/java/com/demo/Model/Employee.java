package com.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id_Employee;
    @Column(name = "name")
    private String Name;
    @Column(name = "cos_Center")
    private long Cos_Center;
    @ManyToOne(targetEntity=Manager.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Manager Manager;
    @Column(name = "nr_of_phone")
    private long Nr_Of_Phone;
    @Column(name = "password")
    private String Password;
    @Column(name = "email")
    private String Email;
    @Column(name = "code")
    private long Code;

    public Employee() {
    }

    public Employee(String name, long cos_Center, Manager manager, long nr_Of_Phone, String password, String email, long code) {
        Name = name;
        Cos_Center = cos_Center;
        Manager = manager;
        Nr_Of_Phone = nr_Of_Phone;
        Password = password;
        Email = email;
        Code = code;
    }

    public Employee(long id_Employee, String name, long cos_Center, Manager manager, long nr_Of_Phone,
                    String password, String email, long code) {
        Id_Employee = id_Employee;
        Name = name;
        Cos_Center = cos_Center;
        Manager = manager;
        Nr_Of_Phone = nr_Of_Phone;
        Password = password;
        Email = email;
        Code = code;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "Id_Employee=" + Id_Employee +
                ", Name='" + Name + '\'' +
                ", Cos_Center=" + Cos_Center +
                ", Manager=" + Manager +
                ", Nr_Of_Phone=" + Nr_Of_Phone +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                ", Code='" + Code + '\'' +
                '}';
    }

    public long getId_Employee() {
        return Id_Employee;
    }

    public void setId_Employee(long id_Employee) {
        Id_Employee = id_Employee;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getCos_Center() {
        return Cos_Center;
    }

    public void setCos_Center(long cos_Center) {
        Cos_Center = cos_Center;
    }

    public Manager getManager() {
        return Manager;
    }

    public void setManager(Manager manager) {
        Manager = manager;
    }

    public long getNr_Of_Phone() {
        return Nr_Of_Phone;
    }

    public void setNr_Of_Phone(long nr_Of_Phone) {
        Nr_Of_Phone = nr_Of_Phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getCode() {
        return Code;
    }

    public void setCode(long code) {
        Code = code;
    }
}

