/**
 * 
 */
package com.xpanxion.reviewman.controllers;



import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author brian
 *
 */
public class HomeControllerTest {

	private HomeController testee = new HomeController();
	
	/**
	 * Test method for {@link com.xpanxion.reviewman.controllers.HomeController#getHomePage()}.
	 */
	@Test
	public void testGetHomePage() {
		ModelAndView mAndV = testee.getHomePage();
		Assert.assertEquals("home", mAndV.getViewName());
	}

}
