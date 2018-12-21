package com.guoyasoft.gyautotest.ui.testCase.test.uploadimg.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-21 11:28
 **/
public class guoyaupload extends BaseUI {

  @FindBy(xpath = "//a[contains(text(),'作业检查1811A')]")
  private WebElement homeWorkCheck;
  @FindBy(xpath = "//iframe")
  private WebElement iframe;
  @FindBy(xpath = "//img[@id='194_img']")
  private WebElement img194;

  public void clickImg194(){
    click(img194);
  }

}

