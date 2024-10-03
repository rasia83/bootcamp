package com.bootcamp.conta.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Pix {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private LocalDateTime createdAt;

    @Column
    private String chavePixPagador;

    @Column
    private String chavePixRecebedor;

    @Column(unique = true)
    private String idempotencia;

    @Column
    private BigDecimal valor;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Conta conta;

}
