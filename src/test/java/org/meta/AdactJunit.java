
package org.meta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactJunit {
	BaseClass1 baseClass= new BaseClass1();
static WebDriver driver;
@BeforeClass
public static void beforeClass() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
}

@Before
public void beforeMethod() {
	long start = System.currentTimeMillis();
	System.out.println(start);
}

@Test
public void login() {
	//WebElement user = baseClass.findElementById("username");
	WebElement user = driver.findElement(By.id("username"));
	baseClass.type(user, "Kishoreakash");
	WebElement pass = driver.findElement(By.id("password"));
	//WebElement pass = baseClass.findElementById("password");
	baseClass.type(pass, "U85K65");
	WebElement log = driver.findElement(By.id("login"));
	baseClass.click(log);
}

@After
public void afterMethod() {
	long end = System.currentTimeMillis();
	System.out.println(end);
}

@AfterClass
public static void afterClass() {
driver.quit();
}
}