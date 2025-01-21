package com.aliencode.backend.application.usercases;

import java.util.Optional;

import com.aliencode.backend.domain.models.Task;
import com.aliencode.backend.domain.ports.in.UpdateTaskUserCase;
import com.aliencode.backend.domain.ports.out.TaskRepositoryPort;

public class UpdateTaskUserCaseImpl implements UpdateTaskUserCase{
    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUserCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}