package com.example.GestionDeClientesV2.repository;

import com.example.GestionDeClientesV2.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
