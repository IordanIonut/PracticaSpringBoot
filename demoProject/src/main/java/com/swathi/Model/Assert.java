package com.swathi.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.security.Timestamp;
import java.sql.Blob;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "assert")
public class Assert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Assert", nullable = false)
    private Long Id_Assert;
    @Column(name="Name")
    private String Name;
    @Column(name="Description")
    private String Description;
    @Column(name="InputDate")
    private Timestamp InputDate;
    @Column(name="Assert_Csts_Nr")
    private Long Assert_Csts_Nr;
    @Column(name="Image")
    private Blob Image;

    public Assert() {
    }

    public Assert(Long id_Assert, String name, String description, Timestamp inputDate, Long assert_Csts_Nr, Blob image) {
        Id_Assert = id_Assert;
        Name = name;
        Description = description;
        InputDate = inputDate;
        Assert_Csts_Nr = assert_Csts_Nr;
        Image = image;
    }

    public Assert(String name, String description, Timestamp inputDate, Long assert_Csts_Nr, Blob image) {
        Name = name;
        Description = description;
        InputDate = inputDate;
        Assert_Csts_Nr = assert_Csts_Nr;
        Image = image;
    }

    public Long getId_Assert() {
        return Id_Assert;
    }

    public void setId_Assert(Long id_Assert) {
        Id_Assert = id_Assert;
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

    public Timestamp getInputDate() {
        return InputDate;
    }

    public void setInputDate(Timestamp inputDate) {
        InputDate = inputDate;
    }

    public Long getAssert_Csts_Nr() {
        return Assert_Csts_Nr;
    }

    public void setAssert_Csts_Nr(Long assert_Csts_Nr) {
        Assert_Csts_Nr = assert_Csts_Nr;
    }

    public Blob getImage() {
        return Image;
    }

    public void setImage(Blob image) {
        Image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assert anAssert = (Assert) o;
        return Objects.equals(Id_Assert, anAssert.Id_Assert) && Objects.equals(Name, anAssert.Name) && Objects.equals(Description, anAssert.Description) && Objects.equals(InputDate, anAssert.InputDate) && Objects.equals(Assert_Csts_Nr, anAssert.Assert_Csts_Nr) && Objects.equals(Image, anAssert.Image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id_Assert, Name, Description, InputDate, Assert_Csts_Nr, Image);
    }

    @Override
    public String toString() {
        return "Assert{" +
                "Id_Assert=" + Id_Assert +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", InputDate=" + InputDate +
                ", Assert_Csts_Nr=" + Assert_Csts_Nr +
                ", Image=" + Image +
                '}';
    }
}

