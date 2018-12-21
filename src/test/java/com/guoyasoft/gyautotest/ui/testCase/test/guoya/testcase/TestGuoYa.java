package com.guoyasoft.gyautotest.ui.testCase.test.guoya.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages.GuoYaHome;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages.SearchInterview;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @Auther: xuepl
 * @Date: 2018/12/19 14:17
 * @Description:
 */
public class TestGuoYa extends BaseUI {
    @Test
    public void testSearchInterview2(){
        driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
        addScreenshot2Allure("果芽");
        GuoYaHome guoYaHome = PageFactory.initElements(driver, GuoYaHome.class);
        guoYaHome.clickSearchInterviewLink();
        guoYaHome.switchToIframe(driver);
        SearchInterview searchInterview = PageFactory.initElements(driver, SearchInterview.class);
        searchInterview.sendKeysStudentNameInput("张继成");
//        searchInterview.clickSearchButton();
        sleep(3);
    }

    @Test
    public void testSearchInterview1(){
        driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
        GuoYaHome guoYaHome = PageFactory.initElements(driver, GuoYaHome.class);
        guoYaHome.clickSearchInterviewLink();
        guoYaHome.switchToIframe(driver);
        SearchInterview searchInterview = PageFactory.initElements(driver, SearchInterview.class);
        searchInterview.sendKeysStudentNameInput("王鹏");
//        searchInterview.clickSearchButton();
        sleep(3);
    }


}
