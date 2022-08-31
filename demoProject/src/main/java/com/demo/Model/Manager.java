package com.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
@JsonIgnoreProperties
@Entity(name = "manager")
@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@Table(name="manager")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_manager" , nullable = false)
    private long Id_Manager;

    @Column(name = "name" , nullable = false)
    private String Name;

    @Transient
    private Employee employee;

    public Manager() {

    }

}
