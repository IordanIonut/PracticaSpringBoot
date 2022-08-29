package com.demo.Model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_manager" , nullable = false)
    private long Id_Manager;
    @Column(name = "name" , unique=true , nullable = false)
    private String Name;

    public Manager(long id_manager, String name) {
        this.Id_Manager = id_manager;
        this.Name = name;
    }

    public Manager(String name) {
        this.Name = name;
    }

    public Manager() {
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id_manager=" + Id_Manager +
                ", name='" + Name + '\'' +
                '}';
    }

    public long getId_manager() {
        return Id_Manager;
    }

    public void setId_manager(long id_manager) {
        this.Id_Manager = id_manager;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
