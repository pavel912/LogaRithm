package com.pavel.lobanov.LogaRithm.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class OrderItemDto {
    private Long id;
    private Long orderId;
    private Long itemId;
    private int quantity;
}

