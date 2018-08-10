package com.leantesting;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4CreateProject {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://leantesting.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCreateProject() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Sign in with GitHub")).click();
        driver.findElement(By.id("login_field")).clear();
        driver.findElement(By.id("login_field")).sendKeys("iv8032218@gmail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("1111");
        driver.findElement(By.name("commit")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Project_name")).clear();
        driver.findElement(By.id("Project_name")).sendKeys("TestProject");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Version_version_number")).clear();
        driver.findElement(By.id("Version_version_number")).sendKeys("v.1.0");
        driver.findElement(By.xpath(".//*[@id='form-version-create']/div[3]/div/div/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='modal-project-section']/div/div/div[3]/div/div/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Finish")).click();
        Thread.sleep(10000);
        try {
            assertEquals("TestProject", driver.findElement(By.cssSelector("h3")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("span.arrow-down")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Logout')])[2]")).click();

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
