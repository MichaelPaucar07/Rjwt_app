package com.aliencode.backend.application.usercases;

import com.aliencode.backend.domain.models.AdditionalTaskInfo;
import com.aliencode.backend.domain.ports.in.GetAdditionalTaskInfoUserCase;
import com.aliencode.backend.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUserCase{

    private final ExternalServicePort externalServicePort;
    
    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }

}