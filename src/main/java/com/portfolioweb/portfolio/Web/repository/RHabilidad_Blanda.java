
package com.portfolioweb.portfolio.Web.repository;

import com.portfolioweb.portfolio.Web.entity.Habilidad_Blanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad_Blanda extends JpaRepository <Habilidad_Blanda, Integer> {
    
}
