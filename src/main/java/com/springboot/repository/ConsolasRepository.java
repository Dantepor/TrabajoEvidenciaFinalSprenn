package com.springboot.repository;

import com.springboot.models.Consolas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsolasRepository extends JpaRepository<Consolas, Long> {
    // Puedes agregar métodos personalizados si es necesario
}