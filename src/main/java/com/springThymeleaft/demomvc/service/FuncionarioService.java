package com.springThymeleaft.demomvc.service;

import com.springThymeleaft.demomvc.entities.Funcionario;

import java.util.List;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();
}
