package com.SiphindileTradClothing.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.SiphindileTradClothing.model.AddToCart;

public interface AddToCartRepo extends JpaRepository<AddToCart, Long> {

}
