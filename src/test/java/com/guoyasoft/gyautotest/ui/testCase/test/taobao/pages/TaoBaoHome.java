package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-18 14:33
 **/
public class TaoBaoHome extends BaseUI {
  @FindBy(xpath="//a[@class='h'and contains(text(),'请登录')]")//请登录按钮
  private WebElement loginLink;
  @FindBy(xpath="//input[@id='q']")//输入框
  private WebElement searchInput;
  @FindBy(xpath="//button[@class='btn-search tb-bg']")//搜索按钮
  private WebElement searchButton;

  public void clickLoginLink(){
    click(loginLink);
  }
  public void testSearchInput(String text){
    sendKeys(searchInput,text);
  }
  public void clickSearchButton(){
    click(searchButton);
  }
}
