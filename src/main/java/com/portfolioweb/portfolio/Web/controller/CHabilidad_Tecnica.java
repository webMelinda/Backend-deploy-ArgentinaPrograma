
package com.portfolioweb.portfolio.Web.controller;

import com.portfolioweb.portfolio.Web.entity.Habilidad_Tecnica;
import com.portfolioweb.portfolio.Web.service.SHabilidad_Tecnica;
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
@RequestMapping("tecnica") 
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad_Tecnica {
    @Autowired
    SHabilidad_Tecnica tecniServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Habilidad_Tecnica> verHabilidad_Tecnicas(){
        return tecniServ.verHabilidad_Tecnicas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Habilidad_Tecnica verHabilidad_Tecnica(@PathVariable int id){
        return tecniServ.buscarHabilidad_Tecnica(id);
    }
    
    @PostMapping ("/crear")
    public String agregarHabilidad_Tecnica (@RequestBody Habilidad_Tecnica tec) {
        tecniServ.crearHabilidad_Tecnica(tec);
        return "La habilidad técnica fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarHabilidad_Tecnica(@PathVariable int id){
        tecniServ.borrarHabilidad_Tecnica(id);
        return "La habilidad técnica fue eliminada correctamente";
    }
    
    @PutMapping("/editar")
    public void updateHabilidad_Tecnica(@RequestBody Habilidad_Tecnica tec){
        tecniServ.editarHabilidad_Tecnica(tec);
    }
}
