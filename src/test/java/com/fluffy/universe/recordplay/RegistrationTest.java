package com.fluffy.universe.recordplay;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class RegistrationTest {
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
    public void registration() {
        driver.get("http://127.0.0.1:8080/");
        driver.manage().window().setSize(new Dimension(1200, 1050));
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.id("sign-up__first-name")).click();
        driver.findElement(By.id("sign-up__first-name")).sendKeys("ed");
        driver.findElement(By.id("sign-up__last-name")).sendKeys("bryzhko");
        driver.findElement(By.id("sign-up__email")).click();
        driver.findElement(By.id("sign-up__email")).sendKeys("beasumy+q@gmail.com");
        driver.findElement(By.id("sign-up__password")).click();
        driver.findElement(By.id("sign-up__confirm-password")).sendKeys("82Gerko!");
        driver.findElement(By.id("sign-up__password")).sendKeys("82Gerko!");
        driver.findElement(By.id("sign-up__confirm-password")).click();
        driver.findElement(By.cssSelector(".form__button")).click();
        driver.findElement(By.cssSelector(".alert__button")).isDisplayed();
        driver.findElement(By.cssSelector(".alert__button")).click();
        driver.findElement(By.cssSelector(".dropdown__link:nth-child(2)")).isDisplayed();
        driver.close();
    }

    @Test
    public void registrationFailed() {
        driver.get("http://127.0.0.1:8080/");
        driver.manage().window().setSize(new Dimension(1200, 1050));
        driver.findElement(By.cssSelector(".hero")).click();
        driver.findElement(By.cssSelector(".hero__button")).click();
        driver.findElement(By.id("sign-up__first-name")).click();
        driver.findElement(By.cssSelector(".form__button")).click();
        driver.findElement(By.cssSelector(".form__feedback")).isDisplayed();
    }
}
