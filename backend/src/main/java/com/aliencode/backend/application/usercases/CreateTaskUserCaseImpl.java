package com.aliencode.backend.application.usercases;

import com.aliencode.backend.domain.models.Task;
import com.aliencode.backend.domain.ports.in.CreateTaskUserCase;
import com.aliencode.backend.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUserCaseImpl implements CreateTaskUserCase{
    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUserCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}