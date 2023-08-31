package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class PaymentformPage extends BasePage{
	@FindBy(css= "#v-app > div > div.modal-mask > div > div.modal-container.desktop > div > div .c-button-container.content-item > div > button")	
	private WebElement signBtn ;
	@FindBy(css= ".input-label.firstName-label input")	
	private WebElement nameFild ;
	@FindBy(css= ".input-label.lastName-label input")	
	private WebElement lastnameFild;
	@FindBy(css= ".input-label.email-label input")	
	private WebElement emailFild;
	@FindBy(css= ".c-answers-container.v-grid-1 > div:nth-child(1) > button")	
	private WebElement classroomBtn;
	@FindBy(css= ".standalone-project-main.vcentered.center-center > div > div.c-question-container.content-item.is-snappable > div > div.c-answers-container.v-grid-1 > div:nth-child(2) > button")	
	private WebElement studiedRenBtn;
	@FindBy(css= ".c-headline-container.content-item h1>span")	
	private WebElement idealMsg;




	public PaymentformPage(WebDriver driver) {
		super(driver);


	}
	public void signin() {		
		click(signBtn);
	}

	public void firstname(String name) {
		waiting(1000);
		fillText(nameFild, name);

	}
	public void lastname(String lastname) {		
		fillText(lastnameFild, lastname);
	}
	public void email(String email) {		
		fillText(emailFild, email);
	}
	public void classroom() {
		waiting(1000);
		click(classroomBtn);
	}
	public void studiedwithRen() {
		waiting(1000);
		click1(studiedRenBtn);
	  
	}
	public String idealMsg() {
		waitForElementToBeInVisible(idealMsg);
		return getText(idealMsg);
	}

}
