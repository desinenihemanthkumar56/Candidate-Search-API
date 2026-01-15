package com.candidate_search_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "candidates",
        indexes = {
                @Index(name = "idx_full_name", columnList = "full_name")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 150)
    private String fullName;

    @Column(nullable = false, length = 200)
    private String email;
}
