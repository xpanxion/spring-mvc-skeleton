/**
 * 
 */
package com.xpanxion.skeleton.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.skeleton.controllers.HomeController;
import com.xpanxion.skeleton.service.TestService;

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
        ModelAndView mAndV = this.testee.getHomePage();
        Assert.assertEquals("home", mAndV.getViewName());
    }

}
