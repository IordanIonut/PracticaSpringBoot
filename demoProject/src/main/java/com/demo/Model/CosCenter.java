package com.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@JsonIgnoreProperties
@Entity(name = "cos_center")
@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@Table(name="cos_center")
public class CosCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cos_center" , nullable = false)
    private long Id_Cos_Center;

    @Column(name = "name", nullable = false)
    private String Name;

    @Column(name = "flag", nullable = false)
    private short Flag;

    @Transient
    private Employee employee;

    public CosCenter() {

    }
}
