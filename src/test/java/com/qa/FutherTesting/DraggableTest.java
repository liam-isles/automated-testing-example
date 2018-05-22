package com.qa.FutherTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class DraggableTest {

	WebDriver driver;

	Actions action;
	
	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\webdrivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");
		action = new Actions(driver);
	}
	@Ignore
	@Test
	public void dragTest() throws InterruptedException {
		Homepage landing = PageFactory.initElements(driver, Homepage.class);
		Draggable page = PageFactory.initElements(driver, Draggable.class);
		landing.draggableButton();
		page.drag(action);
		Thread.sleep(2500);
	}
	
	@Test
	public void dropTest() throws InterruptedException {
		Homepage landing = PageFactory.initElements(driver, Homepage.class);
		Droppable page = PageFactory.initElements(driver, Droppable.class);
		landing.droppableButton();
		page.drop(action);
		Thread.sleep(3000);
		
	}

	@After
	public void endTest() {
		driver.quit();
	}

}
