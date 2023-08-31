package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
	@FindBy(css= "#app > div:nth-child(4) > div > div > div.grid.grid-cols-1.md\\:grid-cols-12.lg\\:grid-cols-12.gap-x-6 > div.md\\:col-span-8.lg\\:col-span-8.space-y-6 > div:nth-child(2) > div > div > div > div.relative > div > a.block.py-2.text-sm.text-gray-600.bg-white.rounded.border.hover\\:border-gray-300.shadow.hover\\:text-gray-800")	
	private WebElement previewsBtn ;
	@FindBy(css= "[class='flex items-center md:flex-grow text-sm font-medium space-x-1.5'] a:nth-child(2)")
	private WebElement templatesBtn;
	@FindBy(css= "[role='alert']>div:nth-child(1)")	
	private WebElement closeBtn;
	@FindBy(css= "[type='text']")	
	private WebElement scratchFild ;
	@FindBy(css = ".c-button.btn")
	private WebElement nextBtn;
	@FindBy(css = "#embed-popup-close")
	private WebElement recommendBtn ;
	@FindBy(css = ".c-button-group-button.e-close")
	private WebElement tocloseBtn ;

	public MainPage(WebDriver driver) {
		super(driver);
				
	}
	public void Categories(String name) {
		List<WebElement> areaList = driver.findElements(By.cssSelector(".flex.justify-between.items-center.pl-8.pr-5"));
		for (WebElement el : areaList) {
			WebElement titelEl = el.findElement(By.cssSelector(".text-gray-700"));
			if (getText(titelEl).equalsIgnoreCase(name)) {
				click(titelEl);
				break;
			}
		}
	}
	public void scratch(String name) {
		List<WebElement> areaList = driver.findElements(By.cssSelector(".flex.absolute.inset-0.flex-col.justify-center.px-8.space-y-3"));
		for (WebElement el : areaList) {			
			WebElement titelEl = el.findElement(By.cssSelector(".px-3.py-3.text-sm.truncate.align-middle.text-slate-800"));
			if (getText(titelEl).equalsIgnoreCase(name)) {
				click(titelEl);
				break;
			}
		}
	}
	
	public void templates() {
		waiting(1000);
		click(templatesBtn);
	}
	public void preview() {
		waiting(1000);
		click(previewsBtn);
	}
	public void close() {
		click(closeBtn);
	}
	public void scratchfild(String name) {
		waiting(1000);
		fillText(scratchFild, name);
	}
	public void next() {
		click(nextBtn);
	}
	public void toclose() {
		click(tocloseBtn);
	}
	public void recommend() {
		waitForElementToBeInVisible(recommendBtn);
		click(recommendBtn);
	}		
}
