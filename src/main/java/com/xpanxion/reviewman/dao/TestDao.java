package com.xpanxion.reviewman.dao;

import java.util.List;

import com.xpanxion.reviewman.dto.entity.TestEntity;

public interface TestDao {

    List<TestEntity> getAllItems();

}