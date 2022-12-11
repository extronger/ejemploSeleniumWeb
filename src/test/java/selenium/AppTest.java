package selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("Iniciando configuración...");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void searchHandBookDevopsInGoogle() {
        driver.get("https://www.google.com/");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("HandBook Devops");
        searchbox.submit();
        assertTrue(driver.getTitle().contains("HandBook Devops"));
        driver.close();
    }

    @Test
    public void searchDevopHandbookInGoogleAndRedirectToAmazon() {
        driver.get("https://www.google.com/");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("The DevOps Handbook");
        searchbox.submit();
        driver.findElement(By.xpath("//h3[contains(..,'The DevOps Handbook: How to Create World-Class Agility ...')]")).click();
        assertTrue(driver.getTitle().contains("The DevOps Handbook"));
        driver.close();
    }

    @Test
    public void searchDevopHandbookInAmazon() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("the phoenix project");
        driver.findElement(By.id("nav-search-submit-button")).click();
        assertTrue(driver.getTitle().contains("Amazon.com : the phoenix project"));
        driver.close();
    }

    @Test
    public void usingCalculatorInGoogle2Plus2(){ 
        driver.get("https://www.google.com/");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("calculadora");
        searchbox.submit();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(5) .mF5fo > .MEdqYd")).click();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector(".UUhRt")).click();
        assertEquals("4", driver.findElement(By.id("cwos")).getText());
        driver.close();
    }

    @Test
    public void usingCalculatorInGoogle2Minus2(){ 
        driver.get("https://www.google.com/");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("calculadora");
        searchbox.submit();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(4) .mF5fo > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector(".UUhRt")).click();
        assertEquals("0", driver.findElement(By.id("cwos")).getText());
        driver.close();
    }

    @Test
    public void usingCalculatorInGoogle2By2(){ 
        driver.get("https://www.google.com/");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("calculadora");
        searchbox.submit();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(3) .mF5fo > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector(".UUhRt")).click();
        assertEquals("4", driver.findElement(By.id("cwos")).getText());
        driver.close();
    }

    @Test
    public void usingCalculatorInGoogle2Divided2(){ 
        driver.get("https://www.google.com/");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("calculadora");
        searchbox.submit();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(2) .mF5fo > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector(".UUhRt")).click();
        assertEquals("1", driver.findElement(By.id("cwos")).getText());
        driver.close();
    }
}
