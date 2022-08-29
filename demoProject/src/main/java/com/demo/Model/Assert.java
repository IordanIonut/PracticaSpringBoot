package com.demo.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Blob;
import java.text.DateFormat;
import java.util.Arrays;

@Entity
@Table(name = "assert")
public class Assert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assert" , nullable = false)
    private long Id_Employee;
    @NotNull
    @Column(name = "name", unique=true , nullable = false)
    private String Name;
    @NotNull
    @Column(name = "description", nullable = false)
    private long Description;
    @NotNull
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id_cos_center")
    private CosCenter Coscenter;
    @NotNull
    @Column(name = "image",  nullable = false, columnDefinition="BLOB")
    private byte[] Image;
    @NotNull
    @Column(name = "input_date", nullable = false)
    private DateFormat Date_Input;

    public Assert(long id_Employee, String name, long description, CosCenter coscenter, @NotNull byte[] image, DateFormat date_Input) {
        Id_Employee = id_Employee;
        Name = name;
        Description = description;
        Coscenter = coscenter;
        Image = image;
        Date_Input = date_Input;
    }

    public Assert(String name, long description, CosCenter coscenter, @NotNull byte[] image, DateFormat date_Input) {
        Name = name;
        Description = description;
        Coscenter = coscenter;
        Image = image;
        Date_Input = date_Input;
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

    public long getDescription() {
        return Description;
    }

    public void setDescription(long description) {
        Description = description;
    }

    public CosCenter getCoscenter() {
        return Coscenter;
    }

    public void setCoscenter(CosCenter coscenter) {
        Coscenter = coscenter;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] image) {
        Image = image;
    }

    public DateFormat getDate_Input() {
        return Date_Input;
    }

    public void setDate_Input(DateFormat date_Input) {
        Date_Input = date_Input;
    }

    @Override
    public String toString() {
        return "Assert{" +
                "Id_Employee=" + Id_Employee +
                ", Name='" + Name + '\'' +
                ", Description=" + Description +
                ", Coscenter=" + Coscenter +
                ", Image=" + Arrays.toString(Image) +
                ", Date_Input=" + Date_Input +
                '}';
    }

    public Assert() {

    }
}
