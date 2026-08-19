package com.pruebafinanciera.backend.service.repository;

import com.pruebafinanciera.backend.service.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}