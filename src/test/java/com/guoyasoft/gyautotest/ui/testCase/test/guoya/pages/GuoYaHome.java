package com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;

/**
 * @Auther: xuepl
 * @Date: 2018/12/19 14:04
 * @Description:
 */
public class GuoYaHome  extends BaseUI {
    @FindBy(xpath = "//input[@id='userName']")
    private WebElement loginUserName;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement loginPassword;
    @FindBy(xpath = "//input[@id='loginBtn']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[contains(text(),'课程查询')]")
    private WebElement classSearchLink;
    @FindBy(xpath = "//a[contains(text(),'面试统计')]")
    private WebElement interviewCountLink;
    @FindBy(xpath = "//a[contains(text(),'查询面试')]")
    private WebElement searchInterviewLink;
    @FindBy(xpath = "//iframe")
    private WebElement iframe;
    @FindBy(xpath = "//a[contains(text(),'作业检查1811A')]")
    private WebElement homeWorkCheck;
    @FindBy(xpath = "//img[@id='194_img']")
    private WebElement img194;
    @FindBy(xpath = "//a[contains(text(),'上传总结')]")
    private WebElement homeWorkUpload;

    public void inputUserName(String text) {
        sendKeys(loginUserName,text);
    }

    public void inputPassword(String text) {
        sendKeys(loginPassword, text);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void clickHomeWorkUpload() {
        click(homeWorkUpload);
    }

    public void clickClassSearchLink(){
        click(classSearchLink);}

    public void clickHomeWorkCheck(){
        click(homeWorkCheck);

    }


    public void clickInterviewCountLink(){
        click(interviewCountLink);

    }
    public void clickSearchInterviewLink(){
        click(searchInterviewLink);

    }
    public void clickImg194() {
       String src = img194.getAttribute("src");
       if(src.contains("cross.jpg")) {
           click(img194);
       }
    }


    //因为要用到driver，所以需要传一个driver参数
    public void switchToIframe(WebDriver driver){
        driver.switchTo().frame(iframe);
    }

}
