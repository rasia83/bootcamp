package com.bootcamp.conta.dto.pix;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class PixRequestDTO {

    private String chavePixPagador;
    private String chavePixRecebedor;
    private BigDecimal valor;
    private String idempotencia;

}
