/**
 * 
 */
package com.xpanxion.skeleton.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.skeleton.service.TestService;

/**
 * @author brian
 * 
 */
@Controller
public class HomeController {

    private TestService testService;

    @RequestMapping("**/home")
    public ModelAndView getHomePage() {
        ModelAndView mAndV = new ModelAndView("home");
        mAndV.addObject("test", this.testService.getTestBeans());
        return mAndV;
    }

    @Resource
    public void setTestService(TestService service) {
        this.testService = service;
    }

}
