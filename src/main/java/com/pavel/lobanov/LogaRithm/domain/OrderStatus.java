package com.pavel.lobanov.LogaRithm.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "order_statuses")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;
}

