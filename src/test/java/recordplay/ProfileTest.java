package recordplay;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class ProfileTest {
    JavascriptExecutor js;
    private WebDriver driver;
    private Map<String, Object> vars;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\EduardBryzhko\\IdeaProjects\\universe-master\\src\\test\\java\\recordplay\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void profile() {
        driver.get("http://127.0.0.1:8080/");
        driver.manage().window().setSize(new Dimension(1500, 1200));
        driver.findElement(By.linkText("Sign in")).click();
         driver.findElement(By.id("sign-in__email")).sendKeys("beasumy+q@gmail.com");
        driver.findElement(By.id("sign-in__password")).sendKeys("82Gerko!");
        driver.findElement(By.cssSelector(".form__button")).click();
        driver.findElement(By.cssSelector(".logo__img")).click();
        driver.findElement(By.cssSelector(".dropdown__icon")).click();
        driver.findElement(By.linkText("My profile")).click();
        driver.findElement(By.id("account__first-name")).click();
        driver.findElement(By.id("account__first-name")).sendKeys("Ed");
        driver.findElement(By.id("account__last-name")).click();
        driver.findElement(By.id("account__last-name")).click();
        driver.findElement(By.id("account__last-name")).sendKeys("Gecko");
        driver.findElement(By.id("account__gender")).click();
        {
            WebElement dropdown = driver.findElement(By.id("account__gender"));
            dropdown.findElement(By.xpath("//option[. = 'Female']")).click();
        }
        driver.findElement(By.id("account__birthday")).click();
        driver.findElement(By.id("account__birthday")).sendKeys("2001-03-22");
        driver.findElement(By.id("account__address")).click();
        driver.findElement(By.id("account__address")).sendKeys("Shevchenko sq");
        driver.findElement(By.id("account__website")).click();
        driver.findElement(By.id("account__website")).sendKeys("https://fkjsflsjkle");
        driver.findElement(By.cssSelector(".account-form")).click();
        driver.findElement(By.cssSelector(".button--fluid")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert__button")).isDisplayed());
    }
}
