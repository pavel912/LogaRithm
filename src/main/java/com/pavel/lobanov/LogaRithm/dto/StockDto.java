package com.pavel.lobanov.LogaRithm.dto;

import lombok.*;

import java.time.Instant;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class StockDto {
    private Long id;
    private Instant createdAt;
    private Long itemId;
    private Long warehouseId;
    private int quantity;
}

