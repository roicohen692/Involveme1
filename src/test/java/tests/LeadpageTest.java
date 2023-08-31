package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.BuildingCostCalculatorPage;
import pages.FacebookAdLeadPage;
import pages.FreeCouponGiveawayPage;
import pages.LoginPage;
import pages.MainPage;
import pages.ValentinesDaySalePage;
import pages.WhatDietIsPage;

public class LeadpageTest extends BaseTest{
	@Test
	public void tc01_WhatdietIs() {
		LoginPage lp = new LoginPage(driver);
		lp.login("roic0123@gmail.com","0123456789Rc");
		MainPage mp = new MainPage(driver);		
		mp.templates();
		mp.close();
		mp.Categories("Lead Page");				
		mp.scratchfild("What Diet Is Best For You?");
		mp.preview();
		mp.close();
		WhatDietIsPage wi = new WhatDietIsPage(driver);
		mp.next();
		wi.livelonglife();
		wi.unprocessed();
		wi.nomeat();
		wi.fiilform("Roi", "Cohen", "roic0123@gmail.com");
		mp.next();
		String expected = "Low-Carb Is The Way";
		String actual = wi.fooddietMsg();
		assertEquals(actual, expected);
		mp.toclose();
	}
	@Test
	public void tc02_BuyerPersona() {		
		MainPage mp = new MainPage(driver);
		mp.close();
		mp.templates();
		mp.close();
		mp.Categories("Lead page");				
		mp.scratchfild("Remodeling Project Price Calculator");
		mp.preview();
		mp.close();
		BuildingCostCalculatorPage bc = new BuildingCostCalculatorPage(driver);
		bc.mts();
		bc.Upanddownarrow();
		bc.severalmeters("10");
		mp.next();
		bc.mts();
		bc.Upanddownarrow();
		bc.fittingout("5");
		mp.next();
		bc.mts();
		bc.Upanddownarrow();
		bc.extensions("8");
		mp.next();
		bc.select();
		bc.levelofspec();
		mp.next();
		bc.select();
		bc.complexity();
		mp.next();
		bc.select();
		bc.thebuilder();
		mp.next();
		bc.where("Israel");
		bc.architect();
		mp.next();
		bc.personaldetails("Roi", "Cohen", "roic0123@gmail.com");
		bc.iagree();
		mp.next();
		String expected = "Projected Estimated Cost: $";
		String actual = bc.costMsg();
		assertEquals(actual, expected);
		mp.toclose();
	}
	@Test
	public void tc03_ValentinesDaySale() {		
		MainPage mp = new MainPage(driver);			
		mp.close();
		mp.templates();
		mp.close();
		mp.Categories("Lead page");				
		mp.scratchfild("Valentine's Day Sale");
		mp.preview();
		mp.close();
		ValentinesDaySalePage vd = new ValentinesDaySalePage(driver);
		mp.next();
		vd.donuts();
		vd.email("roic0123@gmail.com");
		vd.iagree();
		mp.next();
//		vd.socialmedia();
		mp.next();
		String expected = "Your discount code is below";
		String actual = vd.discountMsg();
		assertEquals(actual, expected);
		mp.toclose();
	}
	@Test
	public void tc04_facebookadlead() {		
		MainPage mp = new MainPage(driver);
		mp.close();
		mp.templates();
		mp.close();
		mp.Categories("Lead page");				
		mp.scratchfild("Facebook Ad Lead Page");
		mp.preview();
		mp.close();
		FacebookAdLeadPage fa = new FacebookAdLeadPage(driver);
		mp.next();
		fa.fiilform("Roi", "Cohen", "roic0123@gmail.com");
		fa.getweeklyindustryupdates();
		mp.next();
		String expected = "Welcome on board, {{ Roi }}";
		String actual = fa.welcomeonboardMsg();
		assertEquals(actual, expected);
		mp.toclose();
	}
	@Test
	public void tc05_FreeCouponGiveaway() {
		MainPage mp = new MainPage(driver);		
		mp.templates();
		mp.close();
		mp.Categories("Lead page");				
		mp.scratchfild("Free $100 Coupon Giveaway");
		mp.preview();
		mp.close();
		FreeCouponGiveawayPage fg = new FreeCouponGiveawayPage(driver);
		mp.next();
		fg.whatdoyouusuallybuyonline();
		fg.rateyourshoppingexperience();
		fg.notesforus("Wishing you a happy birthday, lots of happiness, health and success");
		mp.next();	
		fg.fiilform("Roi", "Cohen", "roic0123@gmail.com");
		fg.subscribetonewsletter();
		mp.next();
		String expected = "Thank you for entering the giveaway, {{ roi }}!";
		String actual = fg.Msg();
		assertEquals(actual, expected);
				
	}
}
