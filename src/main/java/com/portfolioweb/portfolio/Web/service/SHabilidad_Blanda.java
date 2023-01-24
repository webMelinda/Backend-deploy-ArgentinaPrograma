
package com.portfolioweb.portfolio.Web.service;

import com.portfolioweb.portfolio.Web.entity.Habilidad_Blanda;
import com.portfolioweb.portfolio.Web.repository.RHabilidad_Blanda;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad_Blanda {
    @Autowired
    public RHabilidad_Blanda blandaRepo;
    
    
    public List<Habilidad_Blanda> verHabilidad_Blandas() {
        List<Habilidad_Blanda> listaHabilidad_Blandas= blandaRepo.findAll();
        return listaHabilidad_Blandas;
    }
    
    public Habilidad_Blanda buscarHabilidad_Blanda(int id){
        Habilidad_Blanda blanda = blandaRepo.findById(id).orElse(null);
        return blanda;
    }
    
    
    public void crearHabilidad_Blanda(Habilidad_Blanda blanda) {
        blandaRepo.save(blanda);
    }
    
   
    public void borrarHabilidad_Blanda(int id) {
        blandaRepo.deleteById(id);
    }
    
     public void editarHabilidad_Blanda(Habilidad_Blanda blanda) {
        blandaRepo.save(blanda);
     } 
}
