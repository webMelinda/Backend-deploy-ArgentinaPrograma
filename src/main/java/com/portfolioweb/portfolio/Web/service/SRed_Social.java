
package com.portfolioweb.portfolio.Web.service;

import com.portfolioweb.portfolio.Web.entity.Red_Social;
import com.portfolioweb.portfolio.Web.repository.RRed_Social;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRed_Social {
  @Autowired
    public RRed_Social RedsocRepo;
    
    
    public List<Red_Social> verRed_Socials() {
        List<Red_Social> listaRed_Socials= RedsocRepo.findAll();
        return listaRed_Socials;
    }
    
    public Red_Social buscarRed_Social(int id){
        Red_Social Redsoc = RedsocRepo.findById(id).orElse(null);
        return Redsoc;
    }
    
    
    public void crearRed_Social(Red_Social Redsoc) {
        RedsocRepo.save(Redsoc);
    }
    
   
    public void borrarRed_Social(int id) {
        RedsocRepo.deleteById(id);
    }
    
     public void editarRed_Social(Red_Social Redsoc) {
        RedsocRepo.save(Redsoc);
     }  
}
