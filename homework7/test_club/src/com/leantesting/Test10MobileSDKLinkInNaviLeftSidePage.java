package com.leantesting;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test10MobileSDKLinkInNaviLeftSidePage {
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
    public void testMobileSDKLinkInNaviLeftSidePage() throws Exception {
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
        driver.findElement(By.linkText("TestProject")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.sprite-sidebar.sprite-sidebar-sdk")).click();
        Thread.sleep(3000);
        try {
            assertEquals("Lean Testing SDK", driver.findElement(By.cssSelector("h2")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Mobile SDK | Lean Testing", driver.getTitle());
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
