
package com.portfolioweb.portfolio.Web.repository;

import com.portfolioweb.portfolio.Web.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository <Experiencia, Integer>{
    
}
