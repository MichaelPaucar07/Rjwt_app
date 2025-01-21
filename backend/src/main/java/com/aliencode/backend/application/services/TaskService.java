package com.aliencode.backend.application.services;

import java.util.List;
import java.util.Optional;
import com.aliencode.backend.domain.models.AdditionalTaskInfo;
import com.aliencode.backend.domain.models.Task;
import com.aliencode.backend.domain.ports.in.CreateTaskUserCase;
import com.aliencode.backend.domain.ports.in.DeleteTaskUserCase;
import com.aliencode.backend.domain.ports.in.GetAdditionalTaskInfoUserCase;
import com.aliencode.backend.domain.ports.in.RetrieveTaskUserCase;
import com.aliencode.backend.domain.ports.in.UpdateTaskUserCase;

public class TaskService implements CreateTaskUserCase, DeleteTaskUserCase, GetAdditionalTaskInfoUserCase, RetrieveTaskUserCase,UpdateTaskUserCase{
    
    private final CreateTaskUserCase createTaskUserCase;
    private final DeleteTaskUserCase deleteTaskUserCase;
    private final GetAdditionalTaskInfoUserCase getAdditionalTaskInfoUserCase;
    private final RetrieveTaskUserCase retrieveTaskUserCase;
    private final UpdateTaskUserCase updateTaskUserCase;

    //Constructor
    public TaskService(
        CreateTaskUserCase createTaskUserCase,
        DeleteTaskUserCase deleteTaskUserCase,
        GetAdditionalTaskInfoUserCase getAdditionalTaskInfoUserCase,
        RetrieveTaskUserCase retrieveTaskUserCase,
        UpdateTaskUserCase updateTaskUserCase
    ){
        this.createTaskUserCase = createTaskUserCase;
        this.deleteTaskUserCase = deleteTaskUserCase;
        this.getAdditionalTaskInfoUserCase = getAdditionalTaskInfoUserCase;

        this.retrieveTaskUserCase = retrieveTaskUserCase;
        this.updateTaskUserCase = updateTaskUserCase;
    }

    @Override
    public Task createTask(Task task){
        return createTaskUserCase.createTask(task);
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id){
        return getAdditionalTaskInfoUserCase.getAdditionalTaskInfo(id);
    }
    
    @Override
    public Optional<Task> getTask(Long id){
        return retrieveTaskUserCase.getTask(id);
    }

    @Override
    public List<Task> getAllTasks(){
        return retrieveTaskUserCase.getAllTasks();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask){
        return updateTaskUserCase.updateTask(id, updateTask);
    }

    @Override
    public boolean deleteTask(Long id){
        return deleteTaskUserCase.deleteTask(id);
    }

}