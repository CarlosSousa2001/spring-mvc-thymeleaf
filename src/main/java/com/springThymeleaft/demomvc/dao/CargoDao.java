package com.springThymeleaft.demomvc.dao;

import com.springThymeleaft.demomvc.entities.Cargo;

import java.util.List;

public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
