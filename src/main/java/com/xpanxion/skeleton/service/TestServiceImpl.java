package com.xpanxion.skeleton.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.skeleton.dao.TestDao;
import com.xpanxion.skeleton.dto.beans.TestBean;
import com.xpanxion.skeleton.dto.entity.TestEntity;

/**
 * Implementation of the test service interface. 
 * 
 * @author bsmith
 *
 */
@Transactional
@Service
public class TestServiceImpl implements TestService {

    private TestDao testDao;

    /* (non-Javadoc)
     * @see com.xpanxion.skeleton.service.TestService#getTestBeans()
     */
    @Override
    public List<TestBean> getTestBeans() {
        List<TestEntity> testItems = this.testDao.getAllItems();
        List<TestBean> output = new ArrayList<TestBean>();
        for (TestEntity entity : testItems) {
            TestBean bean = new TestBean();
            BeanUtils.copyProperties(entity, bean);
            bean.setText(entity.getValue());
            output.add(bean);

        }
        return output;
    }

    /**
     * Sets the TestDao for this service to use
     * 
     * @param dao the dao for this service to use. 
     */
    @Resource
    public void setTestDao(TestDao dao) {
        this.testDao = dao;
    }

}
