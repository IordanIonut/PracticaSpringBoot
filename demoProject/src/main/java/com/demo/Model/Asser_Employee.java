package com.demo.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.text.DateFormat;
import java.util.Arrays;

@Entity
@Table(name = "assert_employee")
public class Asser_Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assert_employee" , nullable = false)
    private long Id_Assert_Employee;
    @NotNull
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id_employee")
    private Employee Employee;
    @NotNull
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id_cos_center")
    private CosCenter CosCenter;
    @NotNull
    @Column(name = "image",  nullable = false, columnDefinition="BLOB")
    private byte[] Image;
    @NotNull
    @Column(name = "from", nullable = false)
    private DateFormat From;
    @NotNull
    @Column(name = "to", nullable = false)
    private DateFormat To;
    @NotNull
    @Column(name = "end_to_life", nullable = false)
    private DateFormat End_To_Life;

    public Asser_Employee(long id_Assert_Employee, com.demo.Model.Employee employee, com.demo.Model.CosCenter cosCenter, @NotNull byte[] image, DateFormat from, DateFormat to, DateFormat end_To_Life) {
        Id_Assert_Employee = id_Assert_Employee;
        Employee = employee;
        CosCenter = cosCenter;
        Image = image;
        From = from;
        To = to;
        End_To_Life = end_To_Life;
    }

    public Asser_Employee(com.demo.Model.Employee employee, com.demo.Model.CosCenter cosCenter, @NotNull byte[] image, DateFormat from, DateFormat to, DateFormat end_To_Life) {
        Employee = employee;
        CosCenter = cosCenter;
        Image = image;
        From = from;
        To = to;
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
                ", Image=" + Arrays.toString(Image) +
                ", From=" + From +
                ", To=" + To +
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

    public com.demo.Model.CosCenter getCosCenter() {
        return CosCenter;
    }

    public void setCosCenter(com.demo.Model.CosCenter cosCenter) {
        CosCenter = cosCenter;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] image) {
        Image = image;
    }

    public DateFormat getFrom() {
        return From;
    }

    public void setFrom(DateFormat from) {
        From = from;
    }

    public DateFormat getTo() {
        return To;
    }

    public void setTo(DateFormat to) {
        To = to;
    }

    public DateFormat getEnd_To_Life() {
        return End_To_Life;
    }

    public void setEnd_To_Life(DateFormat end_To_Life) {
        End_To_Life = end_To_Life;
    }
}
