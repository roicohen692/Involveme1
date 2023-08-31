package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShoppingOrderPage extends BasePage{
	@FindBy(css= ".c-button.btn")	
	private WebElement shopnowBtn ;
	@FindBy(css= ".answer-radio.image-answer.is-single:nth-child(2)")	
	private WebElement lookBtn ;	
	@FindBy(css= ".e-btn-next:nth-child(3)")	
	private WebElement nextto ;
	@FindBy(css= ".e-firstName")	
	private WebElement yournameFild ;
	@FindBy(css= ".c-button.btn")	
	private WebElement ContinueBtn ;
	@FindBy(css= ".e-lastName")	
	private WebElement yourlastnameFild;
	@FindBy(css= ".e-email")	
	private WebElement youremailFild ;
	@FindBy(css= ".c-answer.answer-behaviour.btn.btn-secondary.is-left-align.shadow-custom:nth-child(1)")	
	private WebElement shippingBtn;		
	@FindBy(css= ".e-streetAddress")
	private WebElement streetFild;
	@FindBy(css= ".e-zipCode")
	private WebElement zipFild;	
	@FindBy(css= ".e-city")
	private WebElement cityFild;	
	@FindBy(css= ".e-state")	
	private WebElement stateFild;	
	@FindBy(css= ".vs__selected-options:nth-child(1)>input")
	private WebElement selectBtn;	
	@FindBy(css= "#vs1__option-3")
	private WebElement sizeL;
	@FindBy(css= "#vs2__option-104")
	private WebElement israelS;
	@FindBy(css= ".arrow-down")
	private WebElement arrowBtn;
	@FindBy(css= ".c-calculator-container.content-item span:nth-child(1)")
	private WebElement orderMsg;

	public ShoppingOrderPage(WebDriver driver) {
		super(driver);
		
	}
	public void shopnow() {
		click(shopnowBtn);
	}
	public void Categories(String name) {
		List<WebElement> areaList = driver.findElements(By.cssSelector(".flex.justify-between.items-center.pl-8.pr-5"));
		for (WebElement el : areaList) {			
			WebElement titelEl = el.findElement(By.cssSelector(".text-gray-700"));
			if (getText(titelEl).equalsIgnoreCase(name)) {				
				click(titelEl);
				break;
			}
		}
	}
	public void sizemenu(String name) {
		List<WebElement> areaList = driver.findElements(By.cssSelector(".c-dropdown"));
		for (WebElement el : areaList) {			
			WebElement titelEl = el.findElement(By.cssSelector(".vs__selected-options"));
			if (getText(titelEl).equalsIgnoreCase(name)) {				
				click(titelEl);
				break;
			}
		}
	}
	
					
	public void look() {
		waiting(1000);
		click1(lookBtn);
	}
	public void selectsize() {
		waitForElementToBeClickable(selectBtn);
		click(selectBtn);
	}
	public void sizeL() {
		waitForElementToBeClickable(sizeL);
		click(sizeL);
	}
	public void nextto() {
		click(nextto);
	}
	public void yourname(String name) {
		waiting(1000);
		fillText(yournameFild, name);
	}
	public void Continue() {
		click(ContinueBtn);
	}
	public void israel() {
		waitForElementToBeClickable(israelS);
		click(israelS);
	}
	public void yourlastname(String lastname) {	
		waiting(500);
		fillText(yourlastnameFild, lastname);
	}
	public void youremali(String email) {
		waiting(500);
		fillText(youremailFild, email);
	}
	public void shipping() {
		waiting(1000);
		click(shippingBtn);
	}
	public void shippformstreet(String Streetaddrs) {
		waitForElementToBeVisible(streetFild);
		fillText(streetFild, Streetaddrs);
	}
	public void shippformpostal(String zip) {
		waiting(500);
		fillText(zipFild, zip);
	}
	public void shippformcity(String city) {
		waiting(500);
		fillText(cityFild, city);		
	}
	public void shippformstate(String state) {
		waiting(500);
		fillText(stateFild, state);
	}
	
	public void arrow() {
		click(arrowBtn);
	}
	public String orderMsg() {
		waitForElementToBeVisible(orderMsg);
		return getText(orderMsg);
	}
}
