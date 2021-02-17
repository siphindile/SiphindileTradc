package com.SiphindileTradClothing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SiphindileTradClothing.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
