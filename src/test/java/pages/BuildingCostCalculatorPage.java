package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildingCostCalculatorPage extends BasePage{
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement  Remodelling;
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement arrowBtn;
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement severalmetersFild;
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement fittingoutFild;
	@FindBy(css= ".e-freetxt-answer")	
	private WebElement extensionsFild;
	@FindBy(css= "#vs1__option-1")	
	private WebElement levelofspecBtn;
	@FindBy(css= ".vs__dropdown-toggle:nth-child(1) input")	
	private WebElement selectFild;
	@FindBy(css= "#vs2__option-2")	
	private WebElement complexityBtn;
	@FindBy(css= "#vs3__option-1")	
	private WebElement thebuilderBtn;
	@FindBy(css= ".c-free-txt-answer-container.content-item.is-snappable input")	
	private WebElement whereFild;
	@FindBy(css= ".component-needs-validation.form-checkbox.form-group input")	
	private WebElement architectBtn;
	@FindBy(css= ".input-label.firstName-label input")	
	private WebElement nameFild;
	@FindBy(css= ".component-needs-validation.form-personal-data div:nth-child(2) input")	
	private WebElement lastnameFild;
	@FindBy(css= ".input-label.email-label input")	
	private WebElement emailFild;
	@FindBy(css= ".component-needs-validation.form-checkbox.form-group input")	
	private WebElement iagreeBtn;
	@FindBy(css= ".c-calculator-container.content-item span:nth-child(1)")	
	private WebElement CostMsg;
	
	public BuildingCostCalculatorPage(WebDriver driver) {
		super(driver);
		
	}
	public void mts() {
		click( Remodelling);
	}
	public void Upanddownarrow() {
		actions.doubleClick(arrowBtn);
		
	}
	public void severalmeters(String meter) {
		fillText(severalmetersFild, meter);
	}
	public void fittingout(String nam) {
		fillText(fittingoutFild, nam);
	}
	public void extensions(String nam) {
		fillText(extensionsFild, nam);
	}
	public void select() {
		waiting(1000);
		click(selectFild);
	}
	public void levelofspec() {
		waiting(1000);
		click(levelofspecBtn);
	}
	public void complexity() {
		click(complexityBtn);
		
	}
	public void thebuilder() {
		click(thebuilderBtn);
	}
	public void where(String name) {
		waiting(1000);
		fillText(whereFild, name);
	}
	public void architect() {
		click(architectBtn);
	}
	public void personaldetails(String name ,String lastname ,String email) {
		waiting(1000);
		fillText(nameFild, name);
		waiting(1000);
		fillText(lastnameFild, lastname);
		waiting(1000);
		fillText(emailFild, email);
	}
	public void iagree() {
		click(iagreeBtn);
	}
	public String costMsg() {
		waiting(1000);
		return getText(CostMsg);
	}		
}
