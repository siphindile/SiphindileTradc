package com.SiphindileTradClothing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SiphindileTradClothing.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {

}
