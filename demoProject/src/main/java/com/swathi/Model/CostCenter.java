package com.swathi.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name="costcenters")
public class CostCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_costcentes", nullable = false)
    private Long Id_costcenters;
    @NotEmpty
    @Column(name="Csts_empl_id", nullable = false)
    private Long Csts_empl_id;
    @NotEmpty
    @Size(min=1, message = "Flag status must be 0 or 1")
    @Column(name="Cstc_Delete_flag", nullable = false)
    private Boolean Cstc_Delete_flag;
    @NotEmpty
    @Size(min=2, message = "Cost center name should have at least 2 characters.")
    @Column(name="Name", nullable = false)
    private String Name;

    public CostCenter() {
    }

    public CostCenter(Long id_costcenters, Long csts_empl_id, Boolean cstc_Delete_flag) {
        Id_costcenters = id_costcenters;
        Csts_empl_id = csts_empl_id;
        Cstc_Delete_flag = cstc_Delete_flag;
    }

    public CostCenter(Long csts_empl_id, Boolean cstc_Delete_flag) {
        Csts_empl_id = csts_empl_id;
        Cstc_Delete_flag = cstc_Delete_flag;
    }

    public Long getId_costcenters() {
        return Id_costcenters;
    }

    public void setId_costcenters(Long id_costcenters) {
        Id_costcenters = id_costcenters;
    }

    public Long getCsts_empl_id() {
        return Csts_empl_id;
    }

    public Boolean getCstc_Delete_flag() {
        return Cstc_Delete_flag;
    }

    public void setCsts_empl_id(Long csts_empl_id) {
        Csts_empl_id = csts_empl_id;
    }

    public void setCstc_Delete_flag(Boolean cstc_Delete_flag) {
        Cstc_Delete_flag = cstc_Delete_flag;
    }

    @Override
    public String toString() {
        return "CostCenter{" +
                "Id_costcenters=" + Id_costcenters +
                ", Csts_empl_id=" + Csts_empl_id +
                ", Cstc_Delete_flag=" + Cstc_Delete_flag +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CostCenter that = (CostCenter) o;
        return Objects.equals(Id_costcenters, that.Id_costcenters) && Objects.equals(Csts_empl_id, that.Csts_empl_id) && Objects.equals(Cstc_Delete_flag, that.Cstc_Delete_flag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id_costcenters, Csts_empl_id, Cstc_Delete_flag);
    }
}
