package com.aliencode.backend.application.usercases;

import java.util.List;
import java.util.Optional;

import com.aliencode.backend.domain.models.Task;
import com.aliencode.backend.domain.ports.in.RetrieveTaskUserCase;
import com.aliencode.backend.domain.ports.out.TaskRepositoryPort;

public class RetrieveTaskUserCaseImpl implements RetrieveTaskUserCase{
    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUserCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepositoryPort.findAll();
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return taskRepositoryPort.findById(id);
    }
    
}