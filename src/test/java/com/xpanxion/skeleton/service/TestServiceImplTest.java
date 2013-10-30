/**
 * 
 */
package com.xpanxion.skeleton.service;

import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.xpanxion.skeleton.dao.TestDao;
import com.xpanxion.skeleton.dto.beans.TestBean;
import com.xpanxion.skeleton.dto.entity.TestEntity;
import com.xpanxion.skeleton.service.TestServiceImpl;

/**
 * @author brian
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestServiceImplTest {

    @InjectMocks
    private TestServiceImpl testee;

    @Mock
    private TestDao testDao;

    /**
     * Test method for {@link com.xpanxion.skeleton.service.TestServiceImpl#getTestBeans()}.
     */
    @Test
    public void testGetTestBeans() {
        // given
        TestEntity entityOne = new TestEntity();
        entityOne.setId(1);
        entityOne.setValue("Entity One");

        TestEntity entityTwo = new TestEntity();
        entityTwo.setId(2);
        entityTwo.setValue("Entity Two");

        List<TestEntity> entityList = new ArrayList<>();
        entityList.add(entityOne);
        entityList.add(entityTwo);

        given(this.testDao.getAllItems()).willReturn(entityList);
        // when

        List<TestBean> output = this.testee.getTestBeans();

        // then
        Assert.assertEquals(entityList.size(), output.size());

        for (int i = 0; i < output.size(); i++) {
            Assert.assertEquals(entityList.get(i).getId(), output.get(i).getId());
            Assert.assertEquals(entityList.get(i).getValue(), output.get(i).getText());
        }

    }

}
