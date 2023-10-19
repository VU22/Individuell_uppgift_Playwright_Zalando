package testrun;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Page;

import pages.Zalando_page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import testbase.TestBase;


public class Zalando_test extends TestBase {
		
	@Test
	    void OpenPage_Test() {
	       
	       Zalando_page zalando_page = new Zalando_page(page);
	       zalando_page.open_Zalando();
	       
	       assertThat(page).hasURL("https://www.zalando.se/");
	        
	        System.out.println(page.title());
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("Zalando_webbshop.png")));
            
            page.close(); 
            context.close(); 
            browser.close();                                            
            
		}
	}       

	

