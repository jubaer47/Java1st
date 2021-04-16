package bestby;

import org.openqa.selenium.By;

public class Senario {
	BaseTest testing = new BaseTest();
	void bestBuyTesting() throws InterruptedException {
		testing.openBrowser();
		testing.goToAnySite("https://www.bestbuy.com/");
		Thread.sleep(2000);
		testing.getTandU();
		Thread.sleep(2000);
		testing.getAnyElementByCss("html>body>main>div:nth-child(2)>div:nth-child(5) button");
		Thread.sleep(2000);
		testing.getAnyElementByXpath("//button[text()='Brands']");
		testing.getAnyElementByXpath("//a[text()='Microsoft']");
		testing.getAnyElementByCss("div>div>a[data-track='VisualNavigation_Surface']");
		Thread.sleep(2000);
		testing.verifyItemPresentAndMove(By.xpath("//a[text()='Surface Laptop']"));
		Thread.sleep(5000);
		//testing.getTextFromAnyElement(By.cssSelector("div>div>div>div>div>div:nth-child(2)>h2"));
		testing.getAnyTextByBoolean(By.cssSelector("div>div>div>div>div>div:nth-child(2)>h2"));
		
		testing.closeBrowser();
	}
	
	//terget testing
	void tergetTesting() throws InterruptedException {
		testing.openBrowser();
		testing.goToAnySite("https://www.target.com/");
		Thread.sleep(5000);
		testing.getAnyElementByID("search");
		Thread.sleep(5000);
		testing.typeOnElement(null, null);
	}

}

