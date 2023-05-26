package com.fluffy.universe.recordplay;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class PostTest {

    JavascriptExecutor js;
    private WebDriver driver;
    private Map<String, Object> vars;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\EduardBryzhko\\IdeaProjects\\universe-master\\src\\test\\java\\com\\fluffy\\universe\\recordplay\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void post() {
        driver.get("http://127.0.0.1:8080/");
        driver.manage().window().setSize(new Dimension(1038, 1026));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("sign-in__email")).sendKeys("beasumy+q@gmail.com");
        driver.findElement(By.id("sign-in__password")).sendKeys("82Gerko!");
        driver.findElement(By.cssSelector(".form__button")).click();
        driver.findElement(By.linkText("New post")).click();
        driver.findElement(By.cssSelector(".post-form__title")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".post-form__title"));
            js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'New Post'}", element);
        }
        driver.findElement(By.cssSelector(".post-form__description")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".post-form__description"));
            js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'Post description'}", element);
        }
        driver.findElement(By.cssSelector(".post-form__button:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".alert__button")).click();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/h2[text()='Post title']" + "")).isDisplayed();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[1]/p[text()='Post description']" + "")).isDisplayed();

    }
}
