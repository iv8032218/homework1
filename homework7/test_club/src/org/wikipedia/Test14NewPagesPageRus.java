package org.wikipedia;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test14NewPagesPageRus {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.wikipedia.org";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testNewPagesPageRus() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.cssSelector("#js-link-box-ru > strong")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Новые страницы")).click();
        try {
            assertEquals("Служебная страница", driver.findElement(By.linkText("Служебная страница")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.id("searchInput")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.id("searchButton")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Новые страницы", driver.findElement(By.id("firstHeading")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Для создания статьи используйте «Мастер статей».", driver.findElement(By.cssSelector("p")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='mw-content-text']/div[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Новые страницы", driver.findElement(By.cssSelector("span.oo-ui-labelElement-label")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Пространство имён:", driver.findElement(By.cssSelector("label.oo-ui-labelElement-label")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("span.oo-ui-dropdownWidget-handle > span.oo-ui-labelElement-label")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertFalse(driver.findElement(By.id("ooui-php-2")).isSelected());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Скрыть выбранное", driver.findElement(By.cssSelector("#ooui-php-8 > div.oo-ui-fieldLayout-body > span.oo-ui-fieldLayout-header > label.oo-ui-labelElement-label")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Фильтр меток:", driver.findElement(By.cssSelector("#ooui-php-9 > div.oo-ui-fieldLayout-body > span.oo-ui-fieldLayout-header > label.oo-ui-labelElement-label")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.id("ooui-php-3")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Участник:", driver.findElement(By.cssSelector("#ooui-php-10 > div.oo-ui-fieldLayout-body > span.oo-ui-fieldLayout-header > label.oo-ui-labelElement-label")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.id("ooui-php-4")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(driver.findElement(By.id("ooui-php-5")).isSelected());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Минимальный размер", driver.findElement(By.xpath("//div[@id='ooui-php-12']/div/div/div/span[2]/label")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertFalse(driver.findElement(By.id("ooui-php-6")).isSelected());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Максимальный размер:", driver.findElement(By.xpath("//div[@id='ooui-php-12']/div/div[2]/div/span[2]/label")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.name("size")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("(байт)", driver.findElement(By.xpath("//div[@id='ooui-php-12']/label")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Показать", driver.findElement(By.cssSelector("button.oo-ui-inputWidget-input.oo-ui-buttonElement-button")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
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
