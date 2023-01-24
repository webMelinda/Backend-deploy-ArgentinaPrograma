
package com.portfolioweb.portfolio.Web.controller;

import com.portfolioweb.portfolio.Web.entity.Banner;
import com.portfolioweb.portfolio.Web.service.SBanner;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("banner") //localhost:8080/bannna
@CrossOrigin(origins = "http://localhost:4200") // porque se cruza con Angular
public class CBanner {
    @Autowired
    SBanner bannServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Banner> verBanners(){
        return bannServ.verBanners();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Banner verBanner(@PathVariable int id){
        return bannServ.buscarBanner(id);
    }
    
    @PostMapping ("/crear")
    public String agregarBanner (@RequestBody Banner ban) {
        bannServ.crearBanner(ban);
        return "El banner fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarBanner(@PathVariable int id){
        bannServ.borrarBanner(id);
        return "El banner fue eliminado correctamente";
    }
    
    @PutMapping("/editar")
    public void updateBanner(@RequestBody Banner ban){
        bannServ.editarBanner(ban);
    }
}
