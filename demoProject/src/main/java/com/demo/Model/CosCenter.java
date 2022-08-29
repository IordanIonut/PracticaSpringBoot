package com.demo.Model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cos_center")
public class CosCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cos_center" , nullable = false)
    private long Id_Cos_Center;
    @NotNull
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id_employee")
    private Employee Employee;
    @NotNull
    @Column(name = "flag", nullable = false)
    private boolean Flag;

    public CosCenter() {
    }

    public CosCenter(long id_Cos_Center, com.demo.Model.Employee employee, boolean flag) {
        Id_Cos_Center = id_Cos_Center;
        Employee = employee;
        Flag = flag;
    }

    public CosCenter(com.demo.Model.Employee employee, boolean flag) {
        Employee = employee;
        Flag = flag;
    }

    @Override
    public String toString() {
        return "CosCenter{" +
                "Id_Cos_Center=" + Id_Cos_Center +
                ", Employee=" + Employee +
                ", Flag=" + Flag +
                '}';
    }

    public long getId_Cos_Center() {
        return Id_Cos_Center;
    }

    public void setId_Cos_Center(long id_Cos_Center) {
        Id_Cos_Center = id_Cos_Center;
    }

    public com.demo.Model.Employee getEmployee() {
        return Employee;
    }

    public void setEmployee(com.demo.Model.Employee employee) {
        Employee = employee;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean flag) {
        Flag = flag;
    }
}
