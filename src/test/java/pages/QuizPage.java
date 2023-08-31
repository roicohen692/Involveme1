package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class QuizPage extends BasePage{

	@FindBy(css= "[role='alert']>div:nth-child(1)")	
	private WebElement closeBtn;
	@FindBy(css= "[type='text']")	
	private WebElement scratchFild ;
	@FindBy(css= "#app > div:nth-child(4) > div > div > div.grid.grid-cols-1.md\\:grid-cols-12.lg\\:grid-cols-12.gap-x-6 > div.md\\:col-span-8.lg\\:col-span-8.space-y-6 > div:nth-child(2) > div > div > div > div.relative > div > a.block.py-2.text-sm.text-gray-600.bg-white.rounded.border.hover\\:border-gray-300.shadow.hover\\:text-gray-800")	
	private WebElement previewsBtn ;
	@FindBy(css= ".c-button.btn")	
	private WebElement takequizBtn ;
	@FindBy(css= ".c-headline-container.content-item h1>span")	
	private WebElement idealMsg;
	
	
	public QuizPage(WebDriver driver) {
		super(driver);

	}
	public void choosequiz(String name) {
		List<WebElement> areaList = driver.findElements(By.cssSelector(".flex.justify-between.items-center.pl-8.pr-5"));
		for (WebElement el : areaList) {
			WebElement titelEl = el.findElement(By.cssSelector(".text-gray-700"));
			if (getText(titelEl).equalsIgnoreCase(name)) {
				click(titelEl);
				break;
			}
		}
	}

	public void glassesquiz(String name) {
		List<WebElement> areaList = driver.findElements(By.cssSelector(".flex.absolute.inset-0.flex-col.justify-center.px-8.space-y-3 "));
		for (WebElement el : areaList) {
			WebElement titelEl = el.findElement(By.cssSelector(".px-3.py-3.text-sm.truncate.align-middle.text-slate-800"));
			if (getText(titelEl).equalsIgnoreCase(name)) {
				click(titelEl);
				break;
			}
		}
	}
	public void close() {
		click(closeBtn);
	}
	public void scratchglasses(String name) {
		fillText(scratchFild, name);
	}
	public void preview() {
		waiting(1000);
		click(previewsBtn);
	}	 
	public void takequiz() {
		waiting(2000);
		click(takequizBtn);
	}
	public String idealMsg() {
		waitForElementToBeInVisible(idealMsg);
		return getText(idealMsg);
	}

		
}

