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
@Table(name="costcenters")
public class CostCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_costcentes")
    private Long Id_costcenters;
    @Column(name="Csts_empl_id")
    private Long Csts_empl_id;
    @Column(name="Cstc_Delete_flag")
    private Boolean Cstc_Delete_flag;

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
