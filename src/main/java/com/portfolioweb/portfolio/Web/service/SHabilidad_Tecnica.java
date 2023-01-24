
package com.portfolioweb.portfolio.Web.service;

import com.portfolioweb.portfolio.Web.entity.Habilidad_Tecnica;
import com.portfolioweb.portfolio.Web.repository.RHabilidad_Tecnica;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad_Tecnica {
    @Autowired
    public RHabilidad_Tecnica tecniRepo;
    
    
    public List<Habilidad_Tecnica> verHabilidad_Tecnicas() {
        List<Habilidad_Tecnica> listaHabilidad_Tecnicas= tecniRepo.findAll();
        return listaHabilidad_Tecnicas;
    }
    
    public Habilidad_Tecnica buscarHabilidad_Tecnica(int id){
        Habilidad_Tecnica tecni = tecniRepo.findById(id).orElse(null);
        return tecni;
    }
    
    
    public void crearHabilidad_Tecnica(Habilidad_Tecnica tecni) {
        tecniRepo.save(tecni);
    }
    
   
    public void borrarHabilidad_Tecnica(int id) {
        tecniRepo.deleteById(id);
    }
    
     public void editarHabilidad_Tecnica(Habilidad_Tecnica tecni) {
        tecniRepo.save(tecni);
     }
}
