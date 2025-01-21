package com.aliencode.backend.domain.models;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id //Pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    //Atributos
    private String title;
    private String description;
    private LocalDateTime creactionDate;
    private Boolean Completed;
}