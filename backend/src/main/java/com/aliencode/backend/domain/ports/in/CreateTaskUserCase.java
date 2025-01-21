package com.aliencode.backend.domain.ports.in;

import com.aliencode.backend.domain.models.Task;

public interface CreateTaskUserCase {
    Task createTask(Task task);
}
