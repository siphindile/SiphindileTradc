package com.SiphindileTradClothing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SiphindileTradClothing.model.User;

public interface UserRepository extends JpaRepository<User ,Long> {

}
