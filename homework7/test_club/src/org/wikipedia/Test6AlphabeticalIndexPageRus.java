package org.wikipedia;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6AlphabeticalIndexPageRus {
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
    public void testAlphabeticalIndexPageRus() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.cssSelector("#js-link-box-ru > strong")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Указатель А — Я")).click();
        try {
            assertEquals("Википедия", driver.findElement(By.linkText("Википедия")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Обсуждение", driver.findElement(By.cssSelector("a[title=\"Обсуждение основной страницы [Alt+Shift+t]\"]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Читать", driver.findElement(By.linkText("Читать")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Просмотр кода", driver.findElement(By.linkText("Просмотр кода")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("История", driver.findElement(By.linkText("История")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.id("searchInput")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("", driver.findElement(By.id("searchButton")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Материал из Википедии — свободной энциклопедии", driver.findElement(By.id("siteSub")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Начинающим", driver.findElement(By.linkText("Начинающим")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Сообщество", driver.findElement(By.linkText("Сообщество")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Порталы", driver.findElement(By.linkText("Порталы")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Награды", driver.findElement(By.linkText("Награды")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Проекты", driver.findElement(By.linkText("Проекты")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Запросы", driver.findElement(By.linkText("Запросы")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Оценивание", driver.findElement(By.linkText("Оценивание")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Содержание Википедии", driver.findElement(By.linkText("Содержание Википедии")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Обзоры", driver.findElement(By.linkText("Обзоры")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Базовые темы", driver.findElement(By.xpath(".//*[@id='mw-content-text']/div/div[2]/p/a[2]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Порталы", driver.findElement(By.cssSelector("p > a[title=\"Портал:Обзор\"]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Избранное содержание", driver.findElement(By.linkText("Избранное содержание")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Категории", driver.findElement(By.linkText("Категории")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Алфавитный указатель", driver.findElement(By.linkText("Алфавитный указатель")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Алфавитный указатель", driver.findElement(By.cssSelector("div.mw-parser-output > p > b")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Вы также можете воспользоваться полнотекстовым поиском по Википедии.", driver.findElement(By.xpath("//div[@id='mw-content-text']/div/p[2]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.id("toc")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Категории", driver.findElement(By.cssSelector("a[title=\"Служебная:Категории\"]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Википедия:Справка", driver.findElement(By.linkText("Википедия:Справка")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Википедия:Внутренние", driver.findElement(By.linkText("Википедия:Внутренние")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Википедия:Содержание Википедии", driver.findElement(By.linkText("Википедия:Содержание Википедии")).getText());
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
