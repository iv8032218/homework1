package org.wikipedia;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test20PermanentLinkPageRus {
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
    public void testPermanentLinkPageRus() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.cssSelector("#js-link-box-ru > strong")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Постоянная ссылка")).click();
        try {
            assertEquals("Заглавная", driver.findElement(By.linkText("Заглавная")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Обсуждение", driver.findElement(By.cssSelector("a[title=\"Обсуждение основной страницы [Alt+Shift+t]\"]")).getText());
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
            assertTrue(isElementPresent(By.id("searchButton")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Добро пожаловать в Википедию,", driver.findElement(By.id("Добро_пожаловать_в_Википедию,")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("p.main-top-articleCount")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Порталы", driver.findElement(By.cssSelector("a[title=\"Портал:Обзор\"] > span.mw-ui-button.mw-ui-quiet")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Справка", driver.findElement(By.cssSelector("span.mw-ui-button.mw-ui-quiet")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Создать статью", driver.findElement(By.cssSelector("a[title=\"Википедия:Мастер статей\"] > span.mw-ui-button")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Избранная статья", driver.findElement(By.cssSelector("div.main-box-subtitle")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Из новых материалов", driver.findElement(By.cssSelector("#main-dyk > div.main-box-subtitle")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Читать", driver.findElement(By.cssSelector("div.main-footer-actions.main-plainlist > ul > li > a > span.mw-ui-button")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("a[title=\"Википедия:Избранные статьи\"] > span.mw-ui-button.mw-ui-quiet")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("img[alt=\"Доп. действия\"]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("a[title=\"Обсуждение шаблона:Знаете ли вы\"] > span.mw-ui-button")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("(//img[@alt='Доп. действия'])[5]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Хорошая статья", driver.findElement(By.cssSelector("#main-tga > div.main-box-subtitle")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Текущие события", driver.findElement(By.id("Текущие_события")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Читать", driver.findElement(By.cssSelector("#main-tga > div.main-footer > div.main-footer-actions.main-plainlist > ul > li > a > span.mw-ui-button")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("a[title=\"Википедия:Хорошие статьи\"] > span.mw-ui-button.mw-ui-quiet")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("(//img[@alt='Доп. действия'])[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Другие текущие события", driver.findElement(By.cssSelector("a[title=\"Портал:Текущие события\"] > span.mw-ui-button")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("(//img[@alt='Доп. действия'])[6]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Последний избранный список", driver.findElement(By.cssSelector("span.main-featuredLists-subtitle")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Предыдущий избранный список", driver.findElement(By.xpath("//div[@id='main-tfl']/div/ul/li[2]/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Другие избранные списки", driver.findElement(By.cssSelector("a[title=\"Википедия:Избранные списки и порталы\"] > span.mw-ui-button")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("(//img[@alt='Доп. действия'])[3]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("В этот день", driver.findElement(By.cssSelector("#main-itd > div.main-box-subtitle")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Читать", driver.findElement(By.cssSelector("#main-itd > div.main-footer > div.main-footer-actions.main-plainlist > ul > li > a > span.mw-ui-button")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("(//img[@alt='Доп. действия'])[7]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Изображение дня", driver.findElement(By.id("Изображение_дня")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Совместная работа недели", driver.findElement(By.id("Совместная_работа_недели")).getText());
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
