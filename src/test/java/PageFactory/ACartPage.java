package PageFactory;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class ACartPage {
	
	WebDriver driver;
	WebDriverWait wait;
	public ACartPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	@FindBy(xpath = "//span[contains(.,'Added to Cart')]")
	WebElement AddedToCart;
	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	WebElement home;
	public boolean verify_Cart() throws Throwable {
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Added to Cart')]")));
		String expectedCart="Added to Cart";
		String actualCart=this.AddedToCart.getText();
		if (actualCart.contains(expectedCart)) {
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screen, new File("./screenshot/iteration/"+"Cart.png"));
			Reporter.log("Cart Verified:: "+expectedCart,true);
			return true;
			
		} else {
			Reporter.log("Cart Verification Fail:: "+expectedCart,true);
			return false;

		}
		
	}
	public void thega() {
		this.home.click();
	}

}
