package testbase;

import org.junit.jupiter.api.*;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;



public class TestBase {
	  
	  protected static Playwright playwright;
	  protected static Browser browser;

	 
	  protected BrowserContext context;
	  protected Page page;

	  @BeforeAll
	  static void launchBrowser() {
	    playwright = Playwright.create();
	    browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
	  }

	  @AfterAll
	  static void closeBrowser() {
	    playwright.close();
	  }

	  @BeforeEach
	  void createContextAndPage() {
	    context = browser.newContext();
	    page = context.newPage();
	    
		
		 Locator acceptCookies = page.getByRole(AriaRole.BUTTON,
	                new Page.GetByRoleOptions().setName("Det är OK"));

	        if (acceptCookies.isVisible()) {
	            acceptCookies.click();
	        }
	  } 

	  @AfterEach
	  void closeContext() {
	    context.close();
	  }
}