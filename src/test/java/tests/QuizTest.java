package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.BuyerPersonaPage;
import pages.GlassesPage;
import pages.HowIntrovertedAreYouPage;
import pages.LoginPage;
import pages.MainPage;
import pages.QuizPage;
public class QuizTest extends BaseTest{	

	@Test
	public void tc01_Templats() {
		LoginPage lp = new LoginPage(driver);
		lp.login("roic0123@gmail.com","0123456789Rc");		
		MainPage mp = new MainPage(driver);
		mp.recommend();
		mp.templates();		
	}
	@Test
	public void tc02_GlassesRecommendation() {				
		MainPage mp = new MainPage(driver);
		mp.templates();	
		QuizPage qz = new  QuizPage (driver);
		qz.close();
		qz.choosequiz("Quiz");
		qz.choosequiz("Glasses Recommendation Quiz");
		qz.scratchglasses("Glasses Recommendation Quiz");
		qz.preview();
		qz.close();
		qz.takequiz();		
		GlassesPage gp = new GlassesPage(driver);
		gp.classic();
		gp.next();
		gp.allday();
		gp.next();
		gp.faceshape();
		gp.next();
		gp.firstname("Roi");
		gp.lastname("Cohen");
		gp.email("roic0123@gmail.com");
		gp.subscrid();
		gp.show();
		String expected = "Timeless & Classic";
		String actual = qz.idealMsg();
		assertEquals(actual, expected);
		mp.toclose();
	}
	@Test
	public void tc03_BuyerPersona() {		
		MainPage mp = new MainPage(driver);		
		mp.close();
		mp.templates();
		mp.close();
		mp.Categories("Quiz");				
		mp.scratchfild("Buyer Persona Generator");
		mp.preview();
		mp.close();
		mp.next();
		BuyerPersonaPage bp = new BuyerPersonaPage(driver);
		bp.customerlooklike();
		bp.theirname("Automators");
		mp.next();
		bp.howoldarethey("20-50");
		mp.next();
		bp.whodotheylookupto("Steve Jobs");
		mp.next();
		bp.socialnetworks();
		mp.next();
		bp.problemwouldyourcompanysolve("Improve automation tests and find bugs");
		mp.next();
		bp.mostlikelytoclick();
		bp.tipsandtricks("Worked with TestNGand Selenium");
		mp.next();
		bp.buyingfromyou();
		bp.fillform("Roi", "QA engineer");
		mp.next();
		bp.objective("Help the company succeed");
		bp.successmeasured("Success is measured by persistence");
		mp.next();
		bp.workchallenge("find good elements");
		mp.next();
		bp.personallife();
		bp.personaform("Roi", "Cohen", "roic0123@gmail.com");
		bp.iagree();
		mp.next();
		String expected = "Your ideal customer is {{ Automators }}";
		String actual = bp.idealMsg();
		assertEquals(actual, expected);
		mp.toclose();
	}
	@Test
	public void tc04_HowIntrovertedAreYou() {	
//		LoginPage lp = new LoginPage(driver);
//		lp.login("roic0123@gmail.com","0123456789Rc");	
		MainPage mp = new MainPage(driver);	
		mp.templates();
		mp.close();
		mp.Categories("Quiz");				
		mp.scratchfild("What Mattress Is Best For You?");
		mp.preview();
		mp.close();
		mp.next();
		HowIntrovertedAreYouPage hi = new HowIntrovertedAreYouPage(driver);
		hi.fillform("Roi", "roic0123@gmail.com", "85", "180");
		mp.next();
		hi.whatposition();
		hi.anyissues();
		hi.howfirm();
		hi.whoissleeping();
		hi.formpartner("Mali", "72", "170");
		mp.next();
		hi.whatposition2();
		hi.anyissues();
		hi.howfirm();
		hi.select();
		hi.size();
		mp.next();
		String expected = "Cloud 1 Deluxe Is Your Dream Mattress";
		String actual = hi.dreamMsg();
		assertEquals(actual, expected);	
		mp.toclose();
	}
}
