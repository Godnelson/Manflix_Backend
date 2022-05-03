package com.senai.manflix.repository;

import com.senai.manflix.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssinaturaRepository extends JpaRepository<User, Long> {
}