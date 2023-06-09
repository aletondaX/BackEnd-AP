package com.Porfolio.BackEnd.Repository;

import com.Porfolio.BackEnd.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RProyectos extends JpaRepository<Proyectos, Integer>{
    Optional<Proyectos> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
