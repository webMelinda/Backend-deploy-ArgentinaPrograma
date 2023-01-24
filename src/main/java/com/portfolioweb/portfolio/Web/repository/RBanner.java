
package com.portfolioweb.portfolio.Web.repository;

import com.portfolioweb.portfolio.Web.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RBanner extends JpaRepository <Banner, Integer>{
    
}
