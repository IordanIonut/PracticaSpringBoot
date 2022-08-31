package com.demo.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.text.DateFormat;
import java.util.Date;

@Entity(name = "assert")
@Table(name = "assert")
public class Assert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assert" , nullable = false)
    private long Id_Asser;
    @Column( unique=true , nullable = false)
    private String Name;
    @Column( nullable = false)
    private String Description;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id_cos_center")
    private CosCenter Coscenter;
    @Column( nullable = false)
    private Date Date_Input;

    public Assert(long id_Employee, String name, String description, CosCenter coscenter, Date date_Input) {
        Id_Asser = id_Employee;
        Name = name;
        Description = description;
        Coscenter = coscenter;
        Date_Input = date_Input;
    }

    public Assert(String name, String description, CosCenter coscenter, Date date_Input) {
        Name = name;
        Description = description;
        Coscenter = coscenter;
        Date_Input = date_Input;
    }

    public long getId_Asser() {
        return Id_Asser;
    }

    public void setId_Asser(long id_Employee) {
        Id_Asser = id_Employee;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public CosCenter getCoscenter() {
        return Coscenter;
    }

    public void setCoscenter(CosCenter coscenter) {
        Coscenter = coscenter;
    }


    public Date getDate_Input() {
        return Date_Input;
    }

    public void setDate_Input(Date date_Input) {
        Date_Input = date_Input;
    }

    @Override
    public String toString() {
        return "Assert{" +
                "Id_Employee=" + Id_Asser +
                ", Name='" + Name + '\'' +
                ", Description=" + Description +
                ", Coscenter=" + Coscenter +
                ", Date_Input=" + Date_Input +
                '}';
    }

    public Assert() {

    }
}
