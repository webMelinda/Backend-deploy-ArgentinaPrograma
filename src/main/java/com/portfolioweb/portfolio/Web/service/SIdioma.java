
package com.portfolioweb.portfolio.Web.service;

import com.portfolioweb.portfolio.Web.entity.Idioma;
import com.portfolioweb.portfolio.Web.repository.RIdioma;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SIdioma {
    @Autowired
    public RIdioma idiomRepo;
    
    
    public List<Idioma> verIdiomas() {
        List<Idioma> listaIdiomas= idiomRepo.findAll();
        return listaIdiomas;
    }
    
    public Idioma buscarIdioma(int id){
        Idioma idiom = idiomRepo.findById(id).orElse(null);
        return idiom;
    }
    
    
    public void crearIdioma(Idioma idiom) {
        idiomRepo.save(idiom);
    }
    
   
    public void borrarIdioma(int id) {
        idiomRepo.deleteById(id);
    }
    
     public void editarIdioma(Idioma idiom) {
        idiomRepo.save(idiom);
     }
}
