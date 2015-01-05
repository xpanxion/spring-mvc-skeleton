/**
 * 
 */
package com.xpanxion.skeleton.controllers;

import com.xpanxion.skeleton.dto.beans.TestBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.skeleton.controllers.HomeController;
import com.xpanxion.skeleton.service.TestService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;

/**
 * @author brian
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class HomeControllerTest {

    @InjectMocks
    private HomeController testee;
    @Mock
    private TestService testService;

    /**
     * Test method for {@link com.xpanxion.skeleton.controllers.HomeController#getHomePage()}.
     */
    @Test
    public void testGetHomePage() {
        // given
        TestBean bean1 = new TestBean();
        bean1.setId(1);
        bean1.setText("Text1");

        TestBean bean2 = new TestBean();
        bean2.setId(2);
        bean2.setText("Text2");

        List<TestBean> beanList = new ArrayList<>();
        beanList.add(bean1);
        beanList.add(bean2);
        given(testService.getTestBeans()).willReturn(beanList);

        // when
        ModelAndView mAndV = this.testee.getHomePage();

        // then
        Assert.assertEquals("home", mAndV.getViewName());
        Assert.assertEquals(beanList,mAndV.getModel().get("test"));
    }

}
