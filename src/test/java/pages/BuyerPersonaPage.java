package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyerPersonaPage extends BasePage{
	@FindBy(css= ".c-answer-container.v-horizontal.v-grid-4 div:nth-child(2)")	
	private WebElement customerlooklikeBtn ;
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement theirnameFild ;
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement howoldaretheyFild ;
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement WhodotheylookuptoFild ;
	@FindBy(css= ".c-answer-container.v-horizontal.v-grid-6>div:nth-child(4)")	
	private WebElement socialnetworksBtn;
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement problemFild ;
	@FindBy(css= ".c-image-answer.answer-behaviour.square:nth-child(1)")	
	private WebElement mostlikelytoclickBtn ;
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement mostlikelytoclickFild ;
	@FindBy(css= ".c-image-answer.answer-behaviour.square:nth-child(1)")	
	private WebElement buyingfromyouBtn ;
	@FindBy(css= ".e-freetxt-answer:nth-child(1)")	
	private WebElement reporttoFild ;
	@FindBy(css= ".c-free-txt-answer-container.content-item.is-snappable:nth-child(2) input")	
	private WebElement jobtitleFild ;
	@FindBy(css= ".e-freetxt-answer:nth-child(1)")	
	private WebElement objectiveFild ;
	@FindBy(css= ".c-free-txt-answer-container.content-item.is-snappable:nth-child(2) div:nth-child(3) input")	
	private WebElement successmeasuredFild ;
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement workchallengeFild ;
	@FindBy(css= ".c-answer.answer-behaviour.btn.btn-secondary:nth-child(1)")	
	private WebElement personallifeBtn ;
	@FindBy(css= ".input-label.firstName-label>input")	
	private WebElement firsnameFild ;
	@FindBy(css= ".e-lastName")	
	private WebElement lastnameFild ;
	@FindBy(css= ".e-email")	
	private WebElement  emailFild;
	@FindBy(css= ".component-needs-validation.form-checkbox.form-group input")	
	private WebElement iagreeBtn;
	@FindBy(css= ".c-headline-container.content-item h1>span:nth-child(1)")	
	private WebElement idealMsg;

	public BuyerPersonaPage(WebDriver driver) {
		super(driver);
		
	}
	public void customerlooklike() {
		waiting(500);
		click(customerlooklikeBtn);
	}
	public void theirname(String name) {
		waitForElementToBeVisible(theirnameFild);
		fillText(theirnameFild, name);
	}
	public void howoldarethey(String age) {
		waiting(1000);
		fillText(howoldaretheyFild, age);
	}
	public void whodotheylookupto(String name) {
		waiting(1000);
		fillText(WhodotheylookuptoFild, name);
	}
	public void socialnetworks() {
		waiting(1000);
		click(socialnetworksBtn);
	}
	public void problemwouldyourcompanysolve (String text) {
		waiting(1000);
		fillText(problemFild, text);
	}
	public void mostlikelytoclick() {
		waiting(1000);
		click(mostlikelytoclickBtn);
	}
	public void tipsandtricks(String text) {
		waitForElementToBeVisible(mostlikelytoclickFild);
		fillText(mostlikelytoclickFild, text);
	}
	public void buyingfromyou() {
		waiting(1000);
		click(buyingfromyouBtn);
	}
	public void fillform(String title, String name ) {
		waitForElementToBeInVisible(jobtitleFild);
		fillText(jobtitleFild, title);
		fillText(reporttoFild, name);
		
	}
	public void objective(String text) {
		waiting(1000);
		fillText(objectiveFild, text);
	}
	public void successmeasured(String text) {;
		waiting(1000);
		fillText(successmeasuredFild, text);
	}
	public void workchallenge(String text) {
		waiting(1000);
		fillText(workchallengeFild, text);
	}
	public void personallife() {
		waiting(1000);
		click(personallifeBtn);
	}
	public void personaform(String name, String lastname, String email) {
		waitForElementToBeVisible(firsnameFild);
		fillText(firsnameFild, name);
		fillText(lastnameFild, lastname);
		fillText(emailFild, email);
		
	}
	public void iagree() {
		waiting(1000);
		click(iagreeBtn);
	}
	public String idealMsg() {
		waitForElementToBeInVisible(idealMsg);
		return getText(idealMsg);
	}

}
