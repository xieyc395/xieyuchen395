package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-18 14:34
 **/
  public class TaoBaoLogin extends BaseUI {

  @FindBy(xpath = "//i[@id='J_Quick2Static']")
  private WebElement loginIcon;
  @FindBy(xpath = "//input[@id='TPL_username_1']")
  private WebElement loginUserName;
  @FindBy(xpath = "//input[@id='TPL_password_1']")
  private WebElement loginPassword;
  @FindBy(xpath = "//button[@id='J_SubmitStatic']")
  private WebElement loginButton;

  public void clickLoginIcon() {
    click(loginIcon);
  }

  public void inputUserName(String text) {
    sendKeys(loginUserName,text);
  }

  public void inputPassword(String text) {
    sendKeys(loginPassword, text);
  }

  public void clickLoginButton() {
    click(loginButton);
  }
}