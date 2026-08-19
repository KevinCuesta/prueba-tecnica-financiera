package com.pruebafinanciera.backend.service.repository;

import com.pruebafinanciera.backend.service.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

    boolean existsByNumeroCuenta(String numeroCuenta);

    boolean existsByClienteId(Long clienteId);

    Optional<Cuenta> findByNumeroCuenta(String numeroCuenta);
}