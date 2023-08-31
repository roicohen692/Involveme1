package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MainPage;
import pages.SalesQualifiedLeadScorePage;
import pages.ShoppableGymShoePage;
import pages.WhatsYourTravelTypePage;

public class WhatsYourTravelTypeTest extends BaseTest{
	@Test
	public void tc01_WhatsYourTravelType() {
		LoginPage lp = new LoginPage(driver);
		lp.login("roic0123@gmail.com","0123456789Rc");
		MainPage mp = new MainPage(driver);
		mp.recommend();
		mp.close();
		mp.templates();
		mp.close();
		mp.Categories("Personality test");				
		mp.scratchfild("What's Your Travel Type?");
		mp.preview();
		mp.close();
		mp.next();
		WhatsYourTravelTypePage wt = new WhatsYourTravelTypePage(driver);
		wt.Philippines();
		wt.hammock();
		wt.snorkelandmask();
		String expected = "Romantic Traveler";
		String actual =wt.travelerMsg();
		assertEquals(actual, expected);
		mp.toclose();
	}
	@Test
	public void tc02_salesqualifiedlead(){		
		MainPage mp = new MainPage(driver);		
		mp.close();
		mp.templates();
		mp.close();
		mp.Categories("Survey");				
		mp.scratchfild("Sales Qualified Lead Score Calculator");
		mp.preview();
		mp.close();
		SalesQualifiedLeadScorePage sql = new SalesQualifiedLeadScorePage(driver);
		sql.fillemail("roic0123@gmail.com");
		mp.next();
		sql.salesfunnel();
		mp.next();
		sql.salesprocess();
		mp.next();
		sql.processisautomated();
		mp.next();
		sql.definedandstandardized();
		mp.next();
		sql.basedontheirneeds();
		mp.next();
		sql.objectives();
		mp.next();
		sql.evaluationmeetings();
		mp.next();
		sql.memberisonboarded();
		mp.next();
		String expected = "Your Sales Score";
		String actual = sql.salesMsg();
		assertEquals(actual, expected);
		mp.toclose();
  }
	@Test
	public void tc03_gymshoe(){		
		MainPage mp = new MainPage(driver);		
		mp.close();
		mp.templates();
		mp.close();
		mp.Categories("Make Online Sales");				
		mp.scratchfild("Shoppable Gym Shoe Configurator");
		mp.preview();
		mp.close();
		mp.next();
		ShoppableGymShoePage sg = new ShoppableGymShoePage(driver);
		sg.gym();
		sg.runmiles();
		sg.fitness();
		sg.feeltheground();
		sg.fast();
		sg.mens();
		String expected = "Comfy but durable.";
		String actual = sg.resultsMsg();
		assertEquals(actual, expected);
	}
}
