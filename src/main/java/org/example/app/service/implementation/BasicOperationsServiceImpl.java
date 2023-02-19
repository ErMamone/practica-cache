package org.example.app.service.implementation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.app.repo.BasicOperationsRepo;
import org.example.app.service.BasicOperationsService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Service
@Slf4j
@RequiredArgsConstructor
public class BasicOperationsServiceImpl implements BasicOperationsService {

    private final BasicOperationsRepo basicOperationsRepo;

    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");


    @Override
    @Cacheable(value = "lowCache")
    public String maintenance(String id) {
		Date date = new Date(System.currentTimeMillis());
		Date datePost = new Date(System.currentTimeMillis() + 5000L);
		String currently = formatter.format(date);
		String postCache = formatter.format(datePost);
        return id + " maintenance BAJO\n start at: "+currently + "\nfinish at: "+postCache;
    }

    @Override
    @Cacheable(value = "highCache")
    public String maintenanceHighCache(String id) {
		Date date = new Date(System.currentTimeMillis());
		Date datePost = new Date(System.currentTimeMillis() + 10000L);
		String currently = formatter.format(date);
		String postCache = formatter.format(datePost);
		return id + " maintenance BAJO\n start at: "+currently + "\nfinish at: "+postCache;
    }
}
