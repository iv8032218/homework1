package org.wikipedia;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test12ForumPageRus {
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
    public void testForumPageRus() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.cssSelector("#js-link-box-ru > strong")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Форум")).click();
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
        driver.findElement(By.id("searchInput")).click();
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
            assertEquals("Википедия:Форум", driver.findElement(By.id("firstHeading")).getText());
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
            assertEquals("Форум", driver.findElement(By.linkText("Форум")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Опросы", driver.findElement(By.linkText("Опросы")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Голосования", driver.findElement(By.linkText("Голосования")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Обсуждение правил", driver.findElement(By.linkText("Обсуждение правил")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Заявки на статусы", driver.findElement(By.linkText("Заявки на статусы")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Арбитражный комитет", driver.findElement(By.linkText("Арбитражный комитет")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Проверка участников", driver.findElement(By.linkText("Проверка участников")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Форум", driver.findElement(By.cssSelector("td > a.mw-selflink.selflink")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("", driver.findElement(By.cssSelector("img")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Добро пожаловать на форум участников русской Википедии. Форум состоит из нескольких разделов, указанных ниже. Ознакомьтесь с правилами обсуждений. Старые обсуждения в архивах. Подписывайте сообщения тильдами (~~~~).", driver.findElement(By.xpath("//div[@id='mw-content-text']/div/div[2]/div[3]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Общий · Новости · Вопросы · Предложения · Правила · Технический · Вниманию участников   |   Discord · Skype · IRC", driver.findElement(By.xpath("//div[@id='mw-content-text']/div/div[2]/div[4]/p")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.name("search")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.name("fulltext")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("toc-ссылки: Общий · Новости · Вопросы · Предложения · Правила · Технический · Вниманию участников", driver.findElement(By.cssSelector("div.mw-parser-output > p")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='mw-content-text']/div/div[3]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector(".wikitable.wide.plainlinks")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Другие страницы", driver.findElement(By.id("Другие_страницы")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Есть и другие страницы, на которых вы можете получить информацию по различным вопросам, связанным с Википедией.", driver.findElement(By.xpath("//div[@id='mw-content-text']/div/p[2]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector(".wikitable.wide")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Архивация", driver.findElement(By.id("Архивация")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Темы, в которых определённое время не появляются новые сообщения, переносятся в подстраницу архива форума. Для каждого форума задержка архивации настроена индивидуально; настройки конкретных форумов можно посмотреть на подстраницах /Архивация, например Википедия:Форум/Общий/Архивация.", driver.findElement(By.xpath("//div[@id='mw-content-text']/div/p[3]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Википедия:Форум/Общий/Архивация", driver.findElement(By.linkText("Википедия:Форум/Общий/Архивация")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Категория", driver.findElement(By.linkText("Категория")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Википедия:Форум", driver.findElement(By.linkText("Википедия:Форум")).getText());
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
