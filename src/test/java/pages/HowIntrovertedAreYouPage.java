package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HowIntrovertedAreYouPage extends BasePage{
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(1) input")	
	private WebElement nameFild;
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(2) input")	
	private WebElement emailFild;
	@FindBy(css= ".c-free-txt-answer-container.content-item.is-snappable div:nth-child(1) input")	
	private WebElement weightFild;
	@FindBy(css= ".c-free-txt-answer-container.content-item.is-snappable:nth-child(3) input")	
	private WebElement heightFild;
	@FindBy(css= ".c-answers-container.v-grid-1 > div:nth-child(2) > button")	
	private WebElement onmybackBtn;
	
	@FindBy(css= ".v-grid-1 > div:nth-child(1) > button")	
	private WebElement tossingandturningBtn ;
	
	@FindBy(css= ".v-grid-1 > div:nth-child(1) > button")	
	private WebElement softBtn;
	
	@FindBy(css=".v-grid-1 > div:nth-child(2) > button")
	private WebElement meandmypartnerBtn;
	
	@FindBy(css=".c-free-txt-answer-container.content-item.is-snappable:nth-child(2) input")
	private WebElement name2Fild;
	@FindBy(css=".c-free-txt-answer-container.content-item.is-snappable:nth-child(3) input")
	private WebElement weight2Fild;
	@FindBy(css=".c-free-txt-answer-container.content-item.is-snappable:nth-child(4) input")
	private WebElement height2Fild;
	
	@FindBy(css=".v-grid-1 > div:nth-child(1) > button")
	private WebElement ontheirsideBtn;
	
	@FindBy(css=".v-grid-1 > div:nth-child(1) > button")
	private WebElement tossingandturning2Btn;
	
	@FindBy(css=".v-select.vs--single.vs--searchable input")
	private WebElement selectBtn;
	
	@FindBy(css="#vs1__option-1")
	private WebElement sizeBtn;
	
	@FindBy(css=".c-headline-container.content-item h1 span")
	private WebElement dreamMsg;

	public HowIntrovertedAreYouPage(WebDriver driver) {
		super(driver);
		
	}
	public void fillform(String name, String email, String weight, String height) {
		waiting(1000);
		fillText(nameFild, name);
		waiting(1000);
		fillText(emailFild, email);
		waiting(1000);
		fillText(weightFild, weight);
		waiting(1000);
		fillText(heightFild, height);
	}
	public void whatposition() {
		waiting(1000);
		click(onmybackBtn);
	}
	public void issuessleeping() {
		waiting(1000);
		click(tossingandturningBtn);
	}
	public void howfirm() {
		waiting(1000);
		click(softBtn);
	}
	public void whoissleeping() {
		waiting(1000);
		click(meandmypartnerBtn);
	}
	public void formpartner(String name, String weight,String height) {
		waitForElementToBeVisible(name2Fild);
		fillText(name2Fild, name);
		waiting(1000);
		fillText(weight2Fild, weight);
		waiting(1000);
		fillText(height2Fild, height);
	}
	public void whatposition2() {
		waiting(1000);
		click(ontheirsideBtn);
		
	}
	public void anyissues() {
		waiting(1000);
		click(tossingandturning2Btn);
	}
	public void select() {
		waitForElementToBeClickable(selectBtn);
		click(selectBtn);
	}
	public void size() {
		waiting(1000);
		click(sizeBtn);
	}
	public String dreamMsg() {
		waitForElementToBeInVisible(dreamMsg);
		return getText(dreamMsg);
	}

}
