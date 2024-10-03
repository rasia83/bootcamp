package com.bootcamp.conta.dto.pix;

import com.bootcamp.conta.model.Pix;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class PixResponseDTO {

    private LocalDateTime createdAt = LocalDateTime.now();
    private String message;
    private Pix pix;
}
