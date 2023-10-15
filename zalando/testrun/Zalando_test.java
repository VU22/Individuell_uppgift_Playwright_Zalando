package testrun;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import testbase.TestBase;


public class Zalando_test extends TestBase {
		
	@Test
	    void OpenPage_Test() {
	        
		  
	       Locator mainLogo =page.getByTestId("logo-main");
	       
	       mainLogo.click();
	       
	       
	       
	       assertThat(page).hasURL("https://www.zalando.se/");
	        
	        System.out.println(page.title());
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("Zalando_webbshop.png")));
            
            page.close(); 
            context.close(); 
            browser.close();                                            
            
		}
	}       

	

