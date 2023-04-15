package com.Porfolio.BackEnd.Service;

import com.Porfolio.BackEnd.Entity.Proyectos;
import com.Porfolio.BackEnd.Repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {
    @Autowired
    RProyectos rProyectos;
    
    public List<Proyectos> list() {
        return rProyectos.findAll();
    }
    
    public Optional<Proyectos> getOne (int id) {
        return rProyectos.findById(id);
    }
    
    public Optional<Proyectos> getByNombre(String nombre) {
        return rProyectos.findByNombre(nombre);
    }
    
    public void save(Proyectos proyecto) {
        rProyectos.save(proyecto);
    }
    
    public void delete(int id) {
        rProyectos.deleteById(id);
    }
    
    public boolean existsById(int id) {
        return rProyectos.existsById(id);
    }
    
    public boolean existsByNombre(String nombre) {
        return rProyectos.existsByNombre(nombre);
    }
}
