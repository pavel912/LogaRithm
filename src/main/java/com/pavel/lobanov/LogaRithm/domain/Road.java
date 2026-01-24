package com.pavel.lobanov.LogaRithm.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "roads")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class Road {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @ManyToOne(optional = false)
    @JoinColumn(name = "source_location_id")
    private Location source;

    @ManyToOne(optional = false)
    @JoinColumn(name = "target_location_id")
    private Location target;

    @Column(nullable = false)
    private double distance;
}

