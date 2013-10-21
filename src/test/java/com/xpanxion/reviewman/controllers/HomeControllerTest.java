/**
 * 
 */
package com.xpanxion.reviewman.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.reviewman.service.TestService;

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
     * Test method for {@link com.xpanxion.reviewman.controllers.HomeController#getHomePage()}.
     */
    @Test
    public void testGetHomePage() {
        ModelAndView mAndV = this.testee.getHomePage();
        Assert.assertEquals("home", mAndV.getViewName());
    }

}
