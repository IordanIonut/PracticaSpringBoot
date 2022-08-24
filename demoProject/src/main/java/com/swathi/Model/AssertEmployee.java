package com.swathi.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "assertemployee")
public class AssertEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_assert", nullable = false)
    private Long Id_assert;
    @Column(name="Empl_Id")
    private Long Empl_Id;
    @Column(name="From")
    private Timestamp From;
    @Column(name="To")
    private Timestamp To;
    @Column(name="Cstc_nr")
    private Long Cstc_nr;
    @Column(name="End_Of_Life")
    private Timestamp End_Of_Life;

    public AssertEmployee() {
    }

    public AssertEmployee(Long id_assert, Long empl_Id, Timestamp from, Timestamp to, Long cstc_nr, Timestamp end_Of_Life) {
        Id_assert = id_assert;
        Empl_Id = empl_Id;
        From = from;
        To = to;
        Cstc_nr = cstc_nr;
        End_Of_Life = end_Of_Life;
    }

    public AssertEmployee(Long empl_Id, Timestamp from, Timestamp to, Long cstc_nr, Timestamp end_Of_Life) {
        Empl_Id = empl_Id;
        From = from;
        To = to;
        Cstc_nr = cstc_nr;
        End_Of_Life = end_Of_Life;
    }

    public Long getId_assert() {
        return Id_assert;
    }

    public void setId_assert(Long id_assert) {
        Id_assert = id_assert;
    }

    public Long getEmpl_Id() {
        return Empl_Id;
    }

    public void setEmpl_Id(Long empl_Id) {
        Empl_Id = empl_Id;
    }

    public Timestamp getFrom() {
        return From;
    }

    public void setFrom(Timestamp from) {
        From = from;
    }

    public Timestamp getTo() {
        return To;
    }

    public void setTo(Timestamp to) {
        To = to;
    }

    public Long getCstc_nr() {
        return Cstc_nr;
    }

    public void setCstc_nr(Long cstc_nr) {
        Cstc_nr = cstc_nr;
    }

    public Timestamp getEnd_Of_Life() {
        return End_Of_Life;
    }

    public void setEnd_Of_Life(Timestamp end_Of_Life) {
        End_Of_Life = end_Of_Life;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssertEmployee that = (AssertEmployee) o;
        return Objects.equals(Id_assert, that.Id_assert) && Objects.equals(Empl_Id, that.Empl_Id) && Objects.equals(From, that.From) && Objects.equals(To, that.To) && Objects.equals(Cstc_nr, that.Cstc_nr) && Objects.equals(End_Of_Life, that.End_Of_Life);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id_assert, Empl_Id, From, To, Cstc_nr, End_Of_Life);
    }

    @Override
    public String toString() {
        return "AssertEmployee{" +
                "Id_assert=" + Id_assert +
                ", Empl_Id=" + Empl_Id +
                ", From=" + From +
                ", To=" + To +
                ", Cstc_nr=" + Cstc_nr +
                ", End_Of_Life=" + End_Of_Life +
                '}';
    }
}
