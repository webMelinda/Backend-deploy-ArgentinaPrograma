
package com.portfolioweb.portfolio.Web.controller;

import com.portfolioweb.portfolio.Web.entity.Educacion;
import com.portfolioweb.portfolio.Web.service.SEducacion;
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
@RequestMapping("educacion") 
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
  @Autowired
    SEducacion educaServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Educacion> verEducacions(){
        return educaServ.verEducacions();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Educacion verEducacion(@PathVariable int id){
        return educaServ.buscarEducacion(id);
    }
    
    @PostMapping ("/crear")
    public String agregarEducacion (@RequestBody Educacion educ) {
        educaServ.crearEducacion(educ);
        return "La educación fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarEducacion(@PathVariable int id){
        educaServ.borrarEducacion(id);
        return "La educación fue eliminada correctamente";
    }
    
    @PutMapping("/editar")
    public void updateEducacion(@RequestBody Educacion educ){
        educaServ.editarEducacion(educ);
    }  
}
