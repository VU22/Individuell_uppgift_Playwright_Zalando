package testrun;
import org.junit.jupiter.api.Test;


import com.microsoft.playwright.Locator;

import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;




public class Navigation_menu_test extends TestBase {
	
	@Test 
	void Menu_Gender_Navigation (){

        Locator header = page.getByTestId("header");
        Locator kvinnaButton = header
            .getByText("kvinna") 
            .filter(new Locator.FilterOptions().setHasText("Kvinna"));
        Locator manButton = header
        		.getByText("Man")
        		.filter(new Locator.FilterOptions().setHasText("Man"));
        Locator barnButton = header
        		.getByText("Barn")
        		.filter(new Locator.FilterOptions().setHasText("Barn"));
        
       
        kvinnaButton.click();
        manButton.click();
        barnButton.click();
        
        
        assertThat(kvinnaButton).isEnabled();
        assertThat(manButton).isEnabled();
        assertThat(barnButton).isEnabled();
        
            System.out.println("Testet lyckades! Knappar klickades.");
        }
	}

	
	
