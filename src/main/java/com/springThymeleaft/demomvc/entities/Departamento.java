package com.springThymeleaft.demomvc.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departamentos")
public class Departamento extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = false, length = 70)
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;

    public Departamento(){};

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }
}
