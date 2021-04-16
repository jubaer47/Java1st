package bestby;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	//calling chrome driver globally
		ChromeDriver driver;
		
		//opening the browser
		void openBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/jubaerhosen/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		
		//closing the browser
		void closeBrowser()throws InterruptedException {
			System.out.println("Browser will close in 10 sec.");
			Thread.sleep(10000);
			driver.quit();
		}
		
		//go to any website
		void goToAnySite(String urlString) {
			driver.get(urlString);
		}

		//get any element by xpath clicking
		void getAnyElementByXpath(String by) {
			driver.findElement(By.xpath(by)).click();
			
		}
		
		//get any element by CSS clicking
		void getAnyElementByCss(String cssString) {
			driver.findElement(By.cssSelector(cssString)).click();
		}
		
		
		//type on any element
		void typeOnElement(By string, String writeString) {
			driver.findElement(string).sendKeys(writeString);
		}
		
		//type on element by using only xpat
		void typeOnElementByUsingXpath(String typeString, String writeString) {
			driver.findElement(By.xpath(typeString)).sendKeys(writeString);
		}
		
		//click on any element
		void clickOnAnyElement(By clickBy) {
			driver.findElement(clickBy).click();
		}
		
		
		
		//verify the element's present by using the boolean
		void verifyItem(By itemBy) {
			boolean bOOlean = driver.findElement(itemBy).isDisplayed();
			System.out.println("The item is DISPLAYED"+""+bOOlean);
		}
		
		
		//verify element's present and move on
		void verifyItemPresentAndMove(By itemBy) {
			boolean bOOlean = driver.findElement(itemBy).isDisplayed();
			System.out.println(bOOlean+""+"The element is DISPLAYED");
			
			if (bOOlean) {
				System.out.println("The element will be clicked soon");
				driver.findElement(itemBy).click();
			} else {
				System.out.println("The element is not DISPLAYED, Check Again" +itemBy);
				

			}
		}
		
		
		//get text from any element by using the boolean
		void getAnyTextByBoolean(By getTextBy) {
			boolean bOOlean = driver.findElement(getTextBy).isDisplayed();
			if (bOOlean) {
				String text = driver.findElement(getTextBy).getText();
				System.out.println(text);
				//System.out.println(driver.findElement(getTextBy).getText());
			} else {
				System.out.println("Do something else");
			}
		}
		
		//get any element's attributes 
		void getAnyAttributes(By getAnyAttributesBy) {
			driver.findElement(getAnyAttributesBy).getAttribute("textContent");
		}
		
		//get url and title from the page
		void getTandU() {
			System.out.println(driver.getCurrentUrl()+""+driver.getTitle());
		}
		
		//get element by using ID
		void getAnyElementByID(String byID) {
			driver.findElement(By.id(byID)).click();
			
			}
		
      
         }


