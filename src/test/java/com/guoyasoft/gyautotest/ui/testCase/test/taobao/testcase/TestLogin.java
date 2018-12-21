package com.guoyasoft.gyautotest.ui.testCase.test.taobao.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.pages.taobao.Login;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoHome;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-18 14:47
 **/
public class TestLogin extends BaseUI {
  @Test
  public void testLogin(){
    driver.get("https://www.taobao.com/");
    TaoBaoHome taoBaoHome = PageFactory.initElements(driver,TaoBaoHome.class);
    taoBaoHome.clickLoginLink();
//    sleep(1);//这个是强制等待
//下面是显示等待
    (new WebDriverWait(driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@id='J_Quick2Static']")));
    TaoBaoLogin taoBaoLogin=PageFactory.initElements(driver,TaoBaoLogin.class);
    taoBaoLogin.clickLoginIcon();
    taoBaoLogin.inputUserName("12345678");
    taoBaoLogin.inputPassword("7655343");
    taoBaoLogin.clickLoginButton();
//    Login login=PageFactory.initElements(driver,Login.class);
//    login.login();
    boolean actual =driver.getPageSource().contains("我的淘宝");
    Assert.assertEquals(actual,true);//断言
    sleep(3);
  }


}
