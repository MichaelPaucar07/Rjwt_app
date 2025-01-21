package com.aliencode.backend.domain.ports.in;

import java.util.List;
import java.util.Optional;
import com.aliencode.backend.domain.models.Task;

public interface RetrieveTaskUserCase {
    Optional<Task> getTask (Long id);
    List<Task> getAllTasks();
}
