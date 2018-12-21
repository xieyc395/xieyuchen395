package com.guoyasoft.gyautotest.ui.testCase.test;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-13 10:17
 **/
public class TestUI<yuE> extends BaseUI {

  @Test
  public void testTextInput() {
    driver.get("https://www.taobao.com/");
    WebElement text = driver.findElement(By.xpath("//input[@id='q']"));
//    WebElement button = driver.findElement(By.xpath("//button[@class='btn-search tb-bg']"));
//    text.clear();
    text.sendKeys("洛丽塔");
//    button.click();
    sleep(2);
  }

  @Test
  public void testButton() {
    testTextInput();
    WebElement button = driver.findElement(By.xpath("//button[@class='btn-search tb-bg']"));
    click(button);
//    Actions actions=new Actions(driver);
//    actions.keyDown(Keys.SHIFT).click(button).keyUp(Keys.SHIFT).perform();
    sleep(3);
  }

  @Test
  public void testLink() {
    testButton();
    driver.get("https://www.taobao.com/");
    WebElement link = driver
        .findElement(By.xpath("//li[@class='J_Cat a-all']/a[contains(text(),'女装')]"));
//    click(link);
    Actions actions = new Actions(driver);
    actions.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).perform();
    sleep(2);
  }

  @Test
  public void testSelect() {
    driver.get("file:///C:/Users/guoya/Downloads/demo.html");
    WebElement select = driver.findElement(By.xpath("//select"));
    Select select1 = new Select(select);
    select1.selectByVisibleText("橘子");
    sleep(2);
    select1.selectByIndex(1);
    sleep(2);
    select1.selectByValue("chengzi");
    sleep(2);

  }

  @Test
  public void testDate() {
    driver.get("file:///C:/Users/guoya/Downloads/demo.html");
    String js = "var xpath = \"//input[@type='time']\";var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();element.value=\"15:30\";";
    JavascriptExecutor jss = (JavascriptExecutor) driver;
    jss.executeScript(js);
  }

  @Test
  public void navigate() {
    driver.get("https://www.taobao.com/");
    sleep(2);
    driver.get("https://www.jd.com/");
    sleep(2);
    driver.navigate().back();
    sleep(2);
    driver.navigate().forward();
    sleep(2);
    driver.navigate().refresh();
  }

  @Test
  public void testframe() {
    driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
    sleep(1);
    driver.findElement(By.xpath("//a[contains(text(),'查询面试')]")).click();
    sleep(3);
    WebElement iframe = driver.findElement(By.xpath("//iframe"));
    driver.switchTo().frame(iframe);
    //进入 iframe 内
    driver.findElement(By.xpath("//button[contains(text(),'查询')]")).click();
    sleep(3);
    driver.switchTo().defaultContent();
    // 返回iframe外
    driver.findElement(By.xpath("//a[contains(text(),'面试统计')]")).click();
    sleep(3);
  }

  @Test
  public void testFor() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = 0; i <= arr.length - 1; i++) {
      System.out.println(arr[i]);
    }
    for (int i : arr) {
      System.out.println(i);
    }


  }

  @Test
  public void testWindowSwitch() {
    driver.get("https://www.taobao.com/");
    driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'女装')]")).click();
    sleep(1);
    driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'男装')]")).click();
    sleep(1);
    driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'内衣')]")).click();
    sleep(1);
    driver.findElement(By.xpath("//li[@aria-label='查看更多']/a[contains(text(),'鞋靴')]")).click();
    sleep(1);
    //1、获取所有窗口的句柄
    Set<String> handles = driver.getWindowHandles();
    //2、使用foreach循环遍历set集合中的句柄
    for (String h : handles) {
      //3、根据句柄切换窗口
      driver.switchTo().window(h);
      sleep(2);
      //4、根据窗口标题来判断当前是哪个窗口
      if (driver.getTitle().contains("淘宝女鞋")) {
        //5、结束循环
        break;
      }
    }


  }

  @Test
  //guoya登录
  public void guoYaLogin() {
    //打开网页
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
    sleep(2);
    //定位元素
    WebElement text = driver.findElement(By.xpath("//input[@id='userName']"));
    WebElement pwdText = driver.findElement(By.xpath("//input[@id='password']"));
    WebElement check = driver.findElement(By.xpath("//input[@id='checkCode']"));
    WebElement button = driver.findElement(By.xpath("//input[@id='loginBtn']"));
    //操作
    text.clear();
    text.sendKeys("yanglei");
    sleep(1);
    pwdText.clear();
    pwdText.sendKeys("abcdefg");
    sleep(1);
    check.clear();
    check.sendKeys("12345");
    sleep(1);
    button.click();
    sleep(2);
  }

  @Test
  //guoya 注册
  public void guoYaSignUp() {
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/signUp.jsp");
    WebElement user = driver.findElement(By.xpath("//input[@id='userName']"));
    WebElement name = driver.findElement(By.xpath("//input[@id='realName']"));
    WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
    WebElement pwd2 = driver.findElement(By.xpath("//input[@id='password2']"));
    WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
    WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
    WebElement check = driver.findElement(By.xpath("//input[@id='checkCode']"));
    WebElement submit = driver.findElement(By.xpath("//input[@id='submitBtn']"));

    user.clear();
    user.sendKeys("yanglei");
    name.clear();
    name.sendKeys("杨磊");
    pwd.clear();
    pwd.sendKeys("abcdefg");
    pwd2.clear();
    pwd2.sendKeys("abcdefg");
    phone.clear();
    phone.sendKeys("18236792010");
    age.clear();
    age.sendKeys("27");
    check.clear();
    check.sendKeys("1234");
    submit.click();
    sleep(2);

    //弹框
    Alert alert = driver.switchTo().alert();
    //确定
    alert.accept();
    //取消
    /* alert.dismiss();

     alert.getText();
     alert.sendKeys();*/
    sleep(2);
  }

  @Test
  //容器
  public void testContainer() {
    //数组
    //声明
    String[] strings = {"11", "22", "333", "444"};
    //说明这个容器有四条数据
    //String[] strings1 = new String[4];
    //取用
    strings[0] = "555";
    System.out.println(strings[0]);

    //二维数组
    String[][] str2 = {{"1", "2", "3", "4"}, {"11", "22", "33", "44"},
        {"111", "222", "333", "444"}};
    //二维数组相当于有三个一维数组，一维数组里有四条数据
    //String[][]str21 = new String[3][4];

    System.out.println(str2[1][2]);//下标填值减1(这说明是二维数组的第二个数组，一维数组的第三个数据)

    //新建一个容器
    List<String> list = new ArrayList<String>();
    /* 往容器最后位置存数据 */
    list.add("111");
    list.add("222");
    list.add("333");
    //在第二条数据插入"444"（在列表中某个位置存数据）
    list.add(1, "444");

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));

    //新建一个容器
    Map<String, String> map = new HashMap<String, String>();

    map.put("姓名", "薛鹏垒");
    map.put("性别", "男");
    map.put("年龄", "22");
    System.out.println(map.get("姓名"));
      /*map.remove("姓名");
      System.out.println(map.get("姓名"));*/

    //新建一个set容器
    Set<String> set = new HashSet<>();

    set.add("1111");
    set.add("1111");
    set.add("1111");
//      set.remove("1111");
    for (String s : set) {
      System.out.println(s);
    }

  }

  @Test

  public void Mul99() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + "*" + i + "=" + i * j + "\t");
//          System.out.printf("%d*%d=%2d",j,i,i*j);
//          System.out.print("\t");
      }
      System.out.println();
    }
  }

  @Test
  public void testif() {
    int money = 10;
    if (money >= 2) {
      System.out.println("可以买币");
    } else {
      System.out.println("回家拿钱");
    }

    int yuE = 200;
    int yuEBao = 2000;
    int yinHangKa = 20000;
    int buy = 200000;
    if (yuE >= buy) {
      System.out.println("余额扣除" + buy);
    } else if (yuEBao >= buy) {
      System.out.println("余额宝扣除" + buy);
    } else if (yinHangKa >= buy) {
      System.out.println("银行卡扣除" + buy);
    } else {
      System.out.println("扣款失败");
    }
  }

  @Test

//  BubbleSort冒泡排序

  public void bubbleSort() {
    int[] arr = {6, 3, 8, 2, 9, 1};
    System.out.println("排序前数组为：");
    for(int num:arr){
System.out.print(num+" ");
}
      for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
        for (int j = 0; j < arr.length - 1 - i; j++) {//内层循环控制每一趟排序多少次
          if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
      System.out.println();
      System.out.println("排序后的数组为：");
      for (int num : arr) {
        System.out.print(num + " ");
      }

//      for(int i=arr.length-1;i>=1;i--){
//        for(int j=0;j<=i-1;j++){
//          if(arr[j]>arr[j]+1){
//            int sh =arr[j];
//            arr[j]=arr[j+1];
//            arr[j+1]=sh;
//          }
//        }
//      }
//      System.out.println();
//      System.out.println("排序后数组");
//      for(int num:arr){
//        System.out.print(num+" ");
//      }

      for(int h=arr.length-1;h>=1;h--){
        for(int k=0;k<h;k++){
          if(arr[k]<arr[k]+1){
            int ak=arr[k];
            arr[k]=arr[k+1];
            arr[k+1]=ak;
          }
        }
      }
    System.out.println();
    System.out.println("降排序后数组");
    for(int num:arr){
      System.out.print(num+" ");
    }

    }


@Test
  public void testAssert(){
  driver.get("https://www.taobao.com/");
  driver.findElement(By.xpath("//a[@class='h'and contains(text(),'请登录')]")).click();
  sleep(1);
  WebElement login =driver.findElement(By.xpath("//i[@id='J_Quick2Static']"));
  sleep(1);
  login.click();
  sleep(1);
  WebElement userName =driver.findElement(By.xpath("//input[@id='TPL_username_1']"));
  userName.clear();
  userName.sendKeys("727817801@qq.com");
  WebElement password =driver.findElement(By.xpath("//input[@id='TPL_password_1']"));
  password.clear();
  password.sendKeys("xieyc");
  driver.findElement(By.xpath("//button[@id='J_SubmitStatic']")).click();
  sleep(3);
 boolean actual =driver.getPageSource().contains("我的淘宝");
  Assert.assertEquals(actual,true);
}




  }


