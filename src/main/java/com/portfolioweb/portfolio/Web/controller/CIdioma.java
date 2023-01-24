
package com.portfolioweb.portfolio.Web.controller;

import com.portfolioweb.portfolio.Web.entity.Idioma;
import com.portfolioweb.portfolio.Web.service.SIdioma;
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
@RequestMapping("idioma")
@CrossOrigin(origins = "http://localhost:4200")
public class CIdioma {
     @Autowired
    SIdioma idiomServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Idioma> verIdiomas(){
        return idiomServ.verIdiomas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Idioma verIdioma(@PathVariable int id){
        return idiomServ.buscarIdioma(id);
    }
    
    @PostMapping ("/crear")
    public String agregarIdioma (@RequestBody Idioma idi) {
        idiomServ.crearIdioma(idi);
        return "El idioma fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarIdioma(@PathVariable int id){
        idiomServ.borrarIdioma(id);
        return "El idioma fue eliminado correctamente";
    }
    
    @PutMapping("/editar")
    public void updateIdioma(@RequestBody Idioma idi){
        idiomServ.editarIdioma(idi);
    }
}
