package com.aliencode.backend.domain.ports.in;

import com.aliencode.backend.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUserCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
