package com.SiphindileTradClothing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SiphindileTradClothing.model.Products;

public interface ProductRepo extends JpaRepository<Products, Long>{

}
