package testrun;
import org.junit.jupiter.api.Test;



import pages.NavigationMenuPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;




public class NavigationMenuTest extends TestBase {
	
	@Test 
	void Menu_Gender_Navigation (){
        
        
        NavigationMenuPage navigationMenuPage = new NavigationMenuPage(page);
        navigationMenuPage.navigate();
        
        assertThat(navigationMenuPage.kvinnaButton).isEnabled();
        assertThat(navigationMenuPage.manButton).isEnabled();
        assertThat(navigationMenuPage.barnButton).isEnabled();
        
            System.out.println("Testet lyckades! Knappar klickades.");
        }
	}

	
	
