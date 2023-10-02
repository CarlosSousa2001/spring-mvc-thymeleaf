package com.springThymeleaft.demomvc.dao;

import com.springThymeleaft.demomvc.entities.Departamento;
import com.springThymeleaft.demomvc.entities.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl  extends AbstractDao<Funcionario, Long> implements FuncionarioDao{
}
