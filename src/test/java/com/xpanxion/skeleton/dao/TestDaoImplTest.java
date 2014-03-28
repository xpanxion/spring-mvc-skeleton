/**
 * 
 */
package com.xpanxion.skeleton.dao;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.xpanxion.skeleton.dao.TestDaoImpl;
import com.xpanxion.skeleton.dto.entity.TestEntity;

/**
 * @author brian
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestDaoImplTest {

    @InjectMocks
    private TestDaoImpl testee;

    @Mock
    private SessionFactory factory;

    /**
     * Test method for {@link com.xpanxion.skeleton.dao.TestDaoImpl#getAllItems()}.
     */
    @Test
    public void testGetAllItems() {
        // given
        Session session = mock(Session.class);
        Query query = mock(Query.class);

        List<TestEntity> returnList = new ArrayList<>();

        given(this.factory.getCurrentSession()).willReturn(session);
        given(session.getNamedQuery("test.getAll")).willReturn(query);
        given(query.list()).willReturn(returnList);
        // when

        List<TestEntity> output = this.testee.getAllItems();

        // then

        Assert.assertEquals(returnList, output);
    }

}
