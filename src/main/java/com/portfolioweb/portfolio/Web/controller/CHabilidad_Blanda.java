
package com.portfolioweb.portfolio.Web.controller;

import com.portfolioweb.portfolio.Web.entity.Habilidad_Blanda;
import com.portfolioweb.portfolio.Web.service.SHabilidad_Blanda;
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
@RequestMapping("soft") 
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad_Blanda {
     @Autowired
    SHabilidad_Blanda blandServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Habilidad_Blanda> verHabilidad_Blandas(){
        return blandServ.verHabilidad_Blandas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Habilidad_Blanda verHabilidad_Blanda(@PathVariable int id){
        return blandServ.buscarHabilidad_Blanda(id);
    }
    
    @PostMapping ("/crear")
    public String agregarHabilidad_Blanda (@RequestBody Habilidad_Blanda blan) {
        blandServ.crearHabilidad_Blanda(blan);
        return "La habilidad blanda fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarHabilidad_Blanda(@PathVariable int id){
        blandServ.borrarHabilidad_Blanda(id);
        return "La habilidad blanda fue eliminada correctamente";
    }
    
    @PutMapping("/editar")
    public void updateHabilidad_Blanda(@RequestBody Habilidad_Blanda blan){
        blandServ.editarHabilidad_Blanda(blan);
    }
}
