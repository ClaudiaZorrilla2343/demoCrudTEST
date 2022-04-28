package com.crud.democrud.repositories;

import com.crud.democrud.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

}