package com.aliencode.backend.domain.ports.out;

import com.aliencode.backend.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
