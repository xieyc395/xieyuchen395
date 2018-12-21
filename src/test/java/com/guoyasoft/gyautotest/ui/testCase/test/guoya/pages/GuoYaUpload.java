package com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-21 13:58
 **/
public class GuoYaUpload extends BaseUI {

  @FindBy(xpath = "//input[@id='postFild']")
  private WebElement imgUpload;

  public void clickImgUpload(WebDriver driver) {
    sendKeys(imgUpload,"C:/Users/guoya/Desktop/搜狗截图20181128145549.png");


  }
}

