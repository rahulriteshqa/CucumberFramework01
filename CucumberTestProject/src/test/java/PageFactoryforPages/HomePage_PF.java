package PageFactoryforPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage_PF {
	
	WebDriver driver;
	
	public HomePage_PF(WebDriver driver)
	{
		this.driver=driver;
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
		PageFactory.initElements(factory, this);
		
		// the above code will wait for max 30 secs untill the elements specified by annotations are loaded if the element is not found in the given time interval, it will throw noSuchElementException
	}
	
	@FindBy(id="logout")
	@CacheLookup
	WebElement btn_logout;

	
	@FindBy(partialLinkText = "rahul")
	List<WebElement> myLinks;
	
	
	@FindBy(how = How.ID,using="name")
	WebElement abc;
	
	
	
	public void checkLogoutBtnIsDisplayed() {
		btn_logout.isDisplayed();
	}
	
	
}

// @CacheLookUp - can be used to instruct the InitElements() to cache the element once it is located and so the it will not be searched over again and again whenever calling it from any method

// this works very well with the basic web App but not recommended for AJAX App where DOM changes on user actions

// Also in case you get Stale Element Exceptions avoid using this...



// In AJAX Applications to handle loading time for element and to avoid no Element Exception we can use 

// AjaxElementLocatorFactory Class - timeout for webElement can be assigned to the Object Page class with the help of this class



// with PageFactory we can also locate the list of WebElements 
//@FindBy(partialLinkText = "rahul")
//List<WebElement> myLinks;



