package com.aliencode.backend.domain.ports.in;

import java.util.Optional;
import com.aliencode.backend.domain.models.Task;

public interface UpdateTaskUserCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}
