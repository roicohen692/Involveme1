package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlassesPage extends BasePage {
	@FindBy(css = ".c-button.btn")
	private WebElement nextBtn;
	@FindBy(css = ".c-image-answer.answer-behaviour:nth-child(1)")
	private WebElement classicBtn;
	@FindBy(css = ".c-answer.answer-behaviour.btn.btn:nth-child(1)")
	private WebElement allday;
	@FindBy(css = ".c-answer.answer-behaviour.btn.btn-secondary:nth-child(1)")
	private WebElement roundBtn;
	@FindBy(css = ".input-label.firstName-label>input")
	private WebElement firsNameFild;
	@FindBy(css = ".e-lastName")
	private WebElement lastNameFild ;
	@FindBy(css = ".e-email")
	private WebElement emailFild;
	@FindBy(css = "[type='checkbox']:nth-child(1)")
	private WebElement subscribeBtn;
	@FindBy(css = ".c-button.btn")
	private WebElement showBtn;
	

	public GlassesPage(WebDriver driver) {
		super(driver);
	}

	public void chooseglasses(String name) {
		List<WebElement> areaList = driver.findElements(By.cssSelector(".c-image-answer.answer-behaviour"));
		for (WebElement el : areaList) {
			WebElement titelEl = el.findElement(By.cssSelector("[class='c-image-answer-title']"));
			if (getText(titelEl).equalsIgnoreCase(name)) {
				click(titelEl);
				break;
			}
		}
	}

	public void classic() {		
		waitForElementToBeClickable(classicBtn);
		click(classicBtn);
	}

	public void next() {
		click(nextBtn);
	}
	public void allday() {
		waitForElementToBeClickable(allday);
		click(allday);
	}
	public void faceshape() {
		waitForElementToBeClickable(roundBtn);
		click(roundBtn);
	}
	public void firstname(String name) {
		waiting(1000);
		fillText(firsNameFild, name);
	}
	public void lastname(String lastname) {
		waiting(1000);
		fillText(lastNameFild, lastname);
	}
	public void email(String email) {
		waiting(1000);
		fillText(emailFild, email);
	}
	public void subscrid() {
		waiting(1000);
		click(subscribeBtn);
	}
	public void show() {
		click(showBtn);
	}
}
