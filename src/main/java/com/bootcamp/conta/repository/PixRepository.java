package com.bootcamp.conta.repository;

import com.bootcamp.conta.model.Pix;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PixRepository extends JpaRepository<Pix, UUID> {
    Optional<Pix> findByIdempotencia(String idempotencia);
}