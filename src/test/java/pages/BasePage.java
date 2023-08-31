package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		actions = new Actions(driver);
	}

	public void fillText(WebElement el, String text) {
		highlightElement(el, "blue", "yellow");
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {
		highlightElement(el, "blue", "yellow");
		waiting(500);
		el.click();
	}
	public void click1(WebElement el) {		
		waiting(500);
		el.click();
	}

	public String getText(WebElement el) {
		highlightElement(el, "yellow", "orange");
		return el.getText();
	}

	public void selectByValue(WebElement el, String value) {
		highlightElement(el, "blue", "yellow");
		Select s = new Select(el);
		s.selectByValue(value);
	}
	//mouse
		public void mouseMoveToElement(WebElement el) {
	        // Move the mouse to the element
	        actions.moveToElement(el).build().perform();
		}

	// Wait
	public void waitForElementToBeClickable(WebElement el) {
		wait.until(ExpectedConditions.elementToBeClickable(el));
	}

	public void waitForElementToBeVisible(WebElement el) {
		wait.until(ExpectedConditions.elementToBeClickable(el));
	}

	public void waitForElementToBeInVisible(WebElement el) {
		wait.until(ExpectedConditions.elementToBeClickable(el));
	}

	public void waiting(long mills) {				
		try {			
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
	}
	

	/*
	 * Call this method with your element and a color like (red,green,orange etc...)
	 */
	protected void highlightElement(WebElement element, String color, String bgColor) {
		// keep the old style to change it back
		String originalStyle = element.getAttribute("style");
		String newStyle = "border: 1px solid " + color + ";background-color:" + bgColor + ";" + originalStyle;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Change the style
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ newStyle + "');},0);", element);

		// Change the style back after few miliseconds
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ originalStyle + "');},400);", element);

	}
	
}
