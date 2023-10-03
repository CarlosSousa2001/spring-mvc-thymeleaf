package com.springThymeleaft.demomvc.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cargos")
public class Cargo extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = false, length = 70)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionario;

    public Cargo(){}



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
}
