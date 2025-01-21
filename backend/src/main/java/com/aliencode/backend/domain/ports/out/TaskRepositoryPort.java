package com.aliencode.backend.domain.ports.out;

import java.util.*;
import java.util.Optional;

import com.aliencode.backend.domain.models.Task;

public interface TaskRepositoryPort {
    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);
}
