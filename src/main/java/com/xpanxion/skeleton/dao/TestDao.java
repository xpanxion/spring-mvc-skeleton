package com.xpanxion.skeleton.dao;

import java.util.List;

import com.xpanxion.skeleton.dto.entity.TestEntity;

/**
 * Interface for the Test Dao
 * 
 * @author bsmith
 *
 */
public interface TestDao {

    /**
     * Returns all of the test entities.
     * 
     * @return all of the test entities. 
     */
    List<TestEntity> getAllItems();

}