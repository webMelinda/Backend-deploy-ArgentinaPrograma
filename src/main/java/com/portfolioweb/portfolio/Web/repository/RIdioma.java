
package com.portfolioweb.portfolio.Web.repository;

import com.portfolioweb.portfolio.Web.entity.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RIdioma extends JpaRepository <Idioma, Integer> {
    
}
