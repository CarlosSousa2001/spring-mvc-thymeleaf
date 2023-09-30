package com.springThymeleaft.demomvc.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cargos")
public class Cargo extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = false, length = 70)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private Funcionario funcionario;

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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
