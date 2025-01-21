package com.aliencode.backend.application.usercases;

import com.aliencode.backend.domain.ports.in.DeleteTaskUserCase;
import com.aliencode.backend.domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUserCaseImpl implements DeleteTaskUserCase{
    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUserCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }

}