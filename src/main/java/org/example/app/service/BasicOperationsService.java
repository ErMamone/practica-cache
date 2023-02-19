package org.example.app.service;

import org.example.app.DTO.AccountDTO;
import org.example.app.entity.Account;
import org.springframework.cache.annotation.Cacheable;

public interface BasicOperationsService {

    String maintenance(String id);

    String maintenanceHighCache(String id);
}
