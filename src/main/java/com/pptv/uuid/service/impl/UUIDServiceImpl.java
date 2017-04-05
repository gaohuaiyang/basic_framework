package com.pptv.uuid.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pptv.uuid.dao.UUIDDao;
import com.pptv.uuid.service.UUIDService;

@Service
public class UUIDServiceImpl implements UUIDService{
    
    @Autowired
    private UUIDDao dao;
    public String get() {
        return dao.get();
    }

}
