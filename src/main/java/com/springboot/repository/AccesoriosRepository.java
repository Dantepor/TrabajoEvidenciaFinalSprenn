package com.springboot.repository;

import com.springboot.models.Accesorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccesoriosRepository extends JpaRepository<Accesorios, Long> {
    // Métodos personalizados si son necesarios
}