package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	@FindBy(css= "#button_tracking-id_login_nav-bar")
	private WebElement loginBtn;	
	@FindBy(css= "[type='email']")
	private WebElement emaillFild;
	@FindBy(css= "[aria-label='Close']")
	private WebElement cookiesBtn ;
	@FindBy(css= "[type='password']")
	private WebElement passwordFild;
	@FindBy(css= ".space-y-2 span:nth-child(2)")
	private WebElement signinBtn ;
	@FindBy(css= ".flex.items-center.justify-between a")
	private WebElement  forgotPasswordBtn;
	@FindBy(css= "[type='email']")
	private WebElement emailFild ;
	@FindBy(css= "[class='space-x-1']>span")
	private WebElement sendResetBtn ;
	@FindBy(css= "#v-app>div>div>div>div")	
	private WebElement closeBtn;
	@FindBy(css=".space-y-6 div:nth-child(3)")
	private WebElement errorFirstName;
	
	@FindBy(css="#nav-dropdown")
	private WebElement usernameBtn;
	@FindBy(css=".space-x-2 > div > ul > li:nth-child(13) > a")
	private WebElement logoutBtn;
	@FindBy(css="#container > div > div.nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb.oXtfBe-l4eHX")
	private WebElement loginwithGoogleBtn;
	
	@FindBy(css="#credentials-picker > div:nth-child(5) > div.fFW7wc-ibnC6b")
	private WebElement emailGoogleBtn;
	
	@FindBy(css="#confirm_no")
	private WebElement cancelationBtn;


	public LoginPage(WebDriver driver) {
		super(driver);
		
		
	}
	public void login(String email, String password) {
		click(loginBtn);
		fillText( emaillFild, email);
		click(cookiesBtn);
		waiting(1000);
		fillText(passwordFild, password);
		click(signinBtn);
	}
	public void loginFailedemail(String email,String password) {
		waiting(1000);
		fillText(emailFild, email);
		click(cookiesBtn);
		waiting(1000);
		fillText(passwordFild, password);
		click(signinBtn);
		
	}
	public void loginFailedpassword(String email,String password) {
		waiting(1000);
		fillText(emailFild, email);
		fillText(passwordFild, password);
		waiting(1000);
		click(signinBtn);
	}
	
	
	public void Forgotpassword(String email) {
//		click(loginBtn);
		waiting(1000);
		click(forgotPasswordBtn);
		fillText(emailFild, email);
		click(cookiesBtn);
		click(sendResetBtn);
		
		
	}
	public void username() {
		click(usernameBtn);
	}
	public void logout() {
		click(logoutBtn);
	}
	public void loginwithGoogle() {
		
		click(loginBtn);
		waiting(1000);
		click(cookiesBtn);
		waitForElementToBeClickable(loginwithGoogleBtn);
		click(loginwithGoogleBtn);
	}
	public void emailgoogle() {
		waiting(1000);
		click(emailGoogleBtn);
	}
	public void cancelation(){
		click(cancelationBtn);
	}
	public String errorFirstNameMsg() {
		waiting(1000);
		return getText(errorFirstName);
	
	}


}
