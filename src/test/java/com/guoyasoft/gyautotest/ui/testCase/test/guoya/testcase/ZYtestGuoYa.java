package com.guoyasoft.gyautotest.ui.testCase.test.guoya.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages.GuoYaHome;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages.SearchInterview;
import org.openqa.selenium.support.PageFactory;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-19 15:30
 **/
public class ZYtestGuoYa extends BaseUI {
  public void testSearchInterview(){
    GuoYaHome guoYaHome = PageFactory.initElements(driver, GuoYaHome.class);
    guoYaHome.clickSearchInterviewLink();
    guoYaHome.switchToIframe(driver);
    SearchInterview searchInterview = PageFactory.initElements(driver, SearchInterview.class);
    searchInterview.sendKeysStudentNameInput("张继成");
    searchInterview.clickSearchButton();
    sleep(3);
  }

}
