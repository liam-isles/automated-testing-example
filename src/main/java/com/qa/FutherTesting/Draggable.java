package com.qa.FutherTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Draggable {

	@FindBy(id="draggable") private WebElement dragIt;
	
	
	public void drag(Actions action) {
		action.moveToElement(dragIt).clickAndHold().moveByOffset(600, 500).perform();
	}
	
}
