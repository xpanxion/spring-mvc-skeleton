package com.xpanxion.reviewman.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.reviewman.dao.TestDao;
import com.xpanxion.reviewman.dto.beans.TestBean;
import com.xpanxion.reviewman.dto.entity.TestEntity;

@Transactional
@Service
public class TestServiceImpl implements TestService {

    private TestDao testDao;

    /*
     * (non-Javadoc)
     * 
     * @see com.xpanxion.reviewman.service.TestService#getTestBeans()
     */
    @Override
    public List<TestBean> getTestBeans() {
        List<TestEntity> testItems = this.testDao.getAllItems();
        List<TestBean> output = new ArrayList<TestBean>();
        for (TestEntity entity : testItems) {
            TestBean bean = new TestBean();
            BeanUtils.copyProperties(entity, bean);
            output.add(bean);

        }
        return output;
    }

    @Resource
    public void setTestDao(TestDao dao) {
        this.testDao = dao;
    }

}
