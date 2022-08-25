package com.swathi.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_employee", nullable = false)
    private Long Id_Employee;
    @Column(name="Name", nullable = false)
    private String Name;
    @Column(name="Cos_Center", nullable = false)
    private String Cos_Center;
    @Column(name="Manager", nullable = false)
    private String Manager;
    @Column(name="Nr_Of_Phone", nullable = false)
    private int Nr_Of_Phone;
    @Column(name="Password", nullable = false)
    private String Password;
    @Column(name="Email", nullable = false)
    private String Email;

    @Column(name="Code")
    private String Code;
    public Employee(){

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

    public Employee(String name, String cos_Center, String manager, int nr_Of_Phone, String password, String email, String code) {
        Name = name;
        Cos_Center = cos_Center;
        Manager = manager;
        Nr_Of_Phone = nr_Of_Phone;
        Password = password;
        Email = email;
        Code = code;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public Long getId_Employee() {
        return Id_Employee;
    }

    public void setId_Employee(Long id_Employee) {
        this.Id_Employee = id_Employee;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCos_Center() {
        return Cos_Center;
    }

    public void setCos_Center(String cos_Center) {
        Cos_Center = cos_Center;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String manager) {
        Manager = manager;
    }

    public int getNr_Of_Phone() {
        return Nr_Of_Phone;
    }

    public void setNr_Of_Phone(int nr_Of_Phone) {
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

    @Override
    public String toString() {
        return "Employee{" +
                "Id_Employee=" + Id_Employee +
                ", Name='" + Name + '\'' +
                ", Cos_Center='" + Cos_Center + '\'' +
                ", Manager='" + Manager + '\'' +
                ", Nr_Of_Phone=" + Nr_Of_Phone +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Nr_Of_Phone == employee.Nr_Of_Phone && Objects.equals(Id_Employee, employee.Id_Employee) && Objects.equals(Name, employee.Name) && Objects.equals(Cos_Center, employee.Cos_Center) && Objects.equals(Manager, employee.Manager) && Objects.equals(Password, employee.Password) && Objects.equals(Email, employee.Email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id_Employee, Name, Cos_Center, Manager, Nr_Of_Phone, Password, Email);
    }

}

