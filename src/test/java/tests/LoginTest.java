package tests;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;



public class LoginTest extends BaseTest{
	@Test
	public void tc01_login() {
		MainPage mp = new MainPage(driver);		
		LoginPage lp = new LoginPage(driver);		
		lp.login("roic0123@gmail.com","0123456789Rc");
		mp.recommend();
		mp.close();
		lp.username();
		lp.logout();
	}
		
	@Test
	public void tc02_loginFailed() {		
		LoginPage lp = new LoginPage(driver);
		lp.loginFailedemail("roic@gmail.com", "0123456789Rc");
		String expected = "These credentials do not match our records.";
		String actual = lp.errorFirstNameMsg();
		assertEquals(actual, expected);
	}
	@Test
	public void tc03_loginFailed() {
		LoginPage lp = new LoginPage(driver);
		lp.loginFailedpassword("roic0123@gmail.com", "012345Rc");
		String expected = "These credentials do not match our records.";
		String actual = lp.errorFirstNameMsg();
		assertEquals(actual, expected);
	}
	@Test
	public void tc04_forgotPassword() {
		LoginPage lp = new LoginPage(driver);		
		lp.Forgotpassword("roic0123@gmail.com");
				
	}
//	@Test
//	public void tc05_loginwithGoogle() {
//		LoginPage lp = new LoginPage(driver);
//		MainPage mp = new MainPage(driver);		
//		lp.loginwithGoogle();
//		mp.close();
//		lp.emailgoogle();
//		lp.cancelation();
//	}
}
