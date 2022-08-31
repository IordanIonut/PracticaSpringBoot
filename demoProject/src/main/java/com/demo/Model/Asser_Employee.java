package com.demo.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;

@Entity(name = "assert_employee")
@Table(name = "assert_employee")
public class Asser_Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assert_employee" , nullable = false)
    private long Id_Assert_Employee;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id_employee")
    private Employee Employee;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id_cos_center")
    private CosCenter CosCenter;
    @Column( nullable = false)
    private Date From_Date;
    @Column( nullable = false)
    private Date To_Date;
    @Column(nullable = false)
    private Date End_To_Life;

    public Asser_Employee(long id_Assert_Employee, Employee employee, CosCenter cosCenter,Date from,
                          Date to, Date end_To_Life) {
        Id_Assert_Employee = id_Assert_Employee;
        Employee = employee;
        CosCenter = cosCenter;
        From_Date = from;
        To_Date = to;
        End_To_Life = end_To_Life;
    }

    public Asser_Employee(Employee employee, CosCenter cosCenter, Date from, Date to, Date end_To_Life) {
        Employee = employee;
        CosCenter = cosCenter;
        From_Date = from;
        To_Date = to;
        End_To_Life = end_To_Life;
    }

    public Asser_Employee() {
    }

    @Override
    public String toString() {
        return "Asser_Employee{" +
                "Id_Assert_Employee=" + Id_Assert_Employee +
                ", Employee=" + Employee +
                ", CosCenter=" + CosCenter +
                ", From=" + From_Date +
                ", To=" + To_Date +
                ", End_To_Life=" + End_To_Life +
                '}';
    }

    public long getId_Assert_Employee() {
        return Id_Assert_Employee;
    }

    public void setId_Assert_Employee(long id_Assert_Employee) {
        Id_Assert_Employee = id_Assert_Employee;
    }

    public com.demo.Model.Employee getEmployee() {
        return Employee;
    }

    public void setEmployee(com.demo.Model.Employee employee) {
        Employee = employee;
    }

    public CosCenter getCosCenter() {
        return CosCenter;
    }

    public void setCosCenter(CosCenter cosCenter) {
        CosCenter = cosCenter;
    }

    public Date getFrom() {
        return From_Date;
    }

    public void setFrom(Date from) {
        From_Date = from;
    }

    public Date getTo() {
        return To_Date;
    }

    public void setTo(Date to) {
        To_Date = to;
    }

    public Date getEnd_To_Life() {
        return End_To_Life;
    }

    public void setEnd_To_Life(Date end_To_Life) {
        End_To_Life = end_To_Life;
    }
}
