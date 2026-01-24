package com.pavel.lobanov.LogaRithm.dto;

import lombok.*;

import java.time.Instant;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class WarehouseDto {
    private Long id;
    private Instant createdAt;
    private Long locationId;
}

