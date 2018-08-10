package com.leantesting;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7CreateBug {
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
    public void testCreateBug() throws Exception {
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
        try {
            assertEquals("TestProject", driver.findElement(By.cssSelector("h3")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("div.sprite-sidebar.sprite-sidebar-bug")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button.btn-report-empty")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ReportBugFormModal_title")).clear();
        driver.findElement(By.id("ReportBugFormModal_title")).sendKeys("TestBug");
        new Select(driver.findElement(By.id("ReportBugFormModal_severity"))).selectByVisibleText("Major");
        new Select(driver.findElement(By.id("ReportBugFormModal_device_type_id"))).selectByVisibleText("Windows PC");
        Thread.sleep(3000);
        new Select(driver.findElement(By.id("ReportBugFormModal_device_id"))).selectByVisibleText("Asus Generic/All");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".js-button-bug-create.btn.btn-lg.btn-lg-w-100.btn-primary-blue")).click();
        Thread.sleep(3000);
        try {
            assertEquals("TestBug", driver.findElement(By.cssSelector("div.text-col.word-break > div")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        Thread.sleep(3000);
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
