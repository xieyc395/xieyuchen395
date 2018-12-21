package com.guoyasoft.gyautotest.ui.testCase.test.guoya.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages.GuoYaHome;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages.GuoYaUpload;
import javax.lang.model.element.Element;
import javax.xml.xpath.XPath;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-21 11:39
 **/
public class upload extends BaseUI {
  @Test
  public void upLoadGou(){
    driver.get("http://www.guoyasoft.com:8080/guoya-client/jsp/user/login.jsp");
    GuoYaHome guoYaHome = PageFactory.initElements(driver,GuoYaHome.class);
    guoYaHome.inputUserName("xieyc");
    guoYaHome.inputPassword("12005X");
    guoYaHome.clickLoginButton();
    sleep(1);
//    guoYaHome.clickHomeWorkCheck();
//    guoYaHome.switchToIframe(driver);
//    guoYaHome.clickImg194();
//    addScreenshot2Allure("上传图片");
//    sleep(1);
//    driver.switchTo().defaultContent();
    guoYaHome.clickHomeWorkUpload();
    guoYaHome.switchToIframe(driver);
    GuoYaUpload guoYaUpload = PageFactory.initElements(driver, GuoYaUpload.class);
    guoYaUpload.clickImgUpload(driver);
    sleep(3);
////    driver.findElement(By.name("userfile")).sendKeys("file:///C:/Users/guoya/Desktop/%E6%90%9C%E7%8B%97%E6%88%AA%E5%9B%BE20181128145549.png");
////    sendKeys("file:///C:/Users/guoya/Desktop/搜狗截图20181128145549.png");
//    sleep(5);
//    WebElement text = driver.findElement(By.xpath("//input[@id='postFild']"));
//    text.clear();
//    text.sendKeys("file:///C:/Users/guoya/Desktop/搜狗截图20181128145549.png");
//   sleep(5);
//    String js = "var xpath = \"//input[@id='postFild']\";var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();element.name=\"file:///C:/Users/guoya/Desktop/%E6%90%9C%E7%8B%97%E6%88%AA%E5%9B%BE20181128145549.png\";";
//    JavascriptExecutor jss = (JavascriptExecutor) driver;
//    jss.executeScript(js);
//    sleep(3);

//    WebElement ulbutton = driver.findElement(By.xpath("//input[@id='uploadFileBtn']"));
//    click(ulbutton);
//    Alert alert = driver.switchTo().alert();
//    alert.accept();
    sleep(3);
  }
}
