package com.qa.FutherTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	@FindBy(id="menu-item-140") private WebElement dragButton;
	@FindBy(id="menu-item-141") private WebElement dropButton;
	
	public void draggableButton() {
		dragButton.click();
	}

	public void droppableButton() {
		dropButton.click();
	}
}
