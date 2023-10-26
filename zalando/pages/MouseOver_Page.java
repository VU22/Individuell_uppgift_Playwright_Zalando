package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import pagebase.PageBase;

public class MouseOver_Page extends PageBase{
	
	 Locator clickMe;
     Locator clickCount;

    public void MouseOver(Page page) {
         
    	String MouseOverUrl = ("http://uitestingplayground.com/mouseover");
        page.navigate(MouseOverUrl);

        this.page = page;
        this.clickMe = page.getByText("Click me");
        this.clickCount = page.locator("#clickCount");
               
    }


    public void ClickMe() {
        clickMe.click();
    }

    public int getClickCount() {
        String clickCount = page.locator("#clickCount").textContent();
        return Integer.parseInt(clickCount);
    }
}

