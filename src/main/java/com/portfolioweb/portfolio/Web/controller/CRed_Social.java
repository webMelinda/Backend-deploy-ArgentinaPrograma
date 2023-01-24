
package com.portfolioweb.portfolio.Web.controller;

import com.portfolioweb.portfolio.Web.entity.Red_Social;
import com.portfolioweb.portfolio.Web.service.SRed_Social;
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
@RequestMapping("red")
@CrossOrigin(origins = "http://localhost:4200")
public class CRed_Social {
    @Autowired
    SRed_Social redsocServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Red_Social> verRed_Socials(){
        return redsocServ.verRed_Socials();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Red_Social verRed_Social(@PathVariable int id){
        return redsocServ.buscarRed_Social(id);
    }
    
    @PostMapping ("/crear")
    public String agregarRed_Social (@RequestBody Red_Social red) {
        redsocServ.crearRed_Social(red);
        return "La red social fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarRed_Social(@PathVariable int id){
        redsocServ.borrarRed_Social(id);
        return "La red social fue eliminada correctamente";
    }
    
    @PutMapping("/editar")
    public void updateRed_Social(@RequestBody Red_Social red){
        redsocServ.editarRed_Social(red);
    }
}
