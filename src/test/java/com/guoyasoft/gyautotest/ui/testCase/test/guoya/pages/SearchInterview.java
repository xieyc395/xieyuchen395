package com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Auther: xuepl
 * @Date: 2018/12/19 14:14
 * @Description:
 */
public class SearchInterview extends BaseUI {

    @FindBy(xpath = "//input[@name=\"custmerName\"]")
    private WebElement studentNameInput;

    @FindBy(xpath = "//button[contains(text(),'查询')]")
    private WebElement searchButton;


    public void sendKeysStudentNameInput(String studentName){
        sendKeys(studentNameInput,studentName);
    }
    public void clickSearchButton(){
        click(searchButton);
    }
}
