package com.aliencode.backend.domain.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AdditionalTaskInfo {
    private final Long userId;
    private final String username;
    private final String userEmail;
}
