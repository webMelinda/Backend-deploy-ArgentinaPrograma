
package com.portfolioweb.portfolio.Web.service;

import com.portfolioweb.portfolio.Web.entity.Banner;
import com.portfolioweb.portfolio.Web.repository.RBanner;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SBanner {
    @Autowired
    public RBanner bannRepo;
    
    
    public List<Banner> verBanners() {
        List<Banner> listaBanners= bannRepo.findAll();
        return listaBanners;
    }
    
    public Banner buscarBanner(int id){
        Banner bann = bannRepo.findById(id).orElse(null);
        return bann;
    }
    
    
    public void crearBanner(Banner bann) {
        bannRepo.save(bann);
    }
    
   
    public void borrarBanner(int id) {
        bannRepo.deleteById(id);
    }
    
     public void editarBanner(Banner bann) {
        bannRepo.save(bann);
     }
}
