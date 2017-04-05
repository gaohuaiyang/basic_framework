package com.pptv.uuid.dao;

import com.pptv.common.annotation.MyBatisRepository;

@MyBatisRepository
public interface UUIDDao {
    public String get();
}
