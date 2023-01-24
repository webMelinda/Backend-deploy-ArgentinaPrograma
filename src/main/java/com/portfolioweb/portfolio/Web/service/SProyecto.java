
package com.portfolioweb.portfolio.Web.service;

import com.portfolioweb.portfolio.Web.entity.Proyecto;
import com.portfolioweb.portfolio.Web.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired
    public RProyecto proyectRepo;
    
    
    public List<Proyecto> verProyectos() {
        List<Proyecto> listaProyectos= proyectRepo.findAll();
        return listaProyectos;
    }
    
    public Proyecto buscarProyecto(int id){
        Proyecto proyect = proyectRepo.findById(id).orElse(null);
        return proyect;
    }
    
    
    public void crearProyecto(Proyecto proyect) {
        proyectRepo.save(proyect);
    }
    
   
    public void borrarProyecto(int id) {
        proyectRepo.deleteById(id);
    }
    
     public void editarProyecto(Proyecto proyect) {
        proyectRepo.save(proyect);
     }
}
