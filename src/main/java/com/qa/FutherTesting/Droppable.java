package com.qa.FutherTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.*;

public class Droppable {
	


	@FindBy(id="draggableview") private WebElement dragBox;
	
	@FindBy(id="droppableview") private WebElement dropBox;
	
	@FindBy(xpath="//*[@id=\"droppableview\"]/p") private WebElement dropText;
	
	public void drop(Actions action) {
		
		
		assertEquals("Drop here", dropBox.getText());
		action.dragAndDrop(dragBox, dropBox).perform();
		assertEquals("Dropped!", dropBox.getText());
		
		
	}
}
