package testrun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pages.MouseOver_Page;
import testbase.TestBase;

public class MouseOver_test extends TestBase {

	@Test
	void ClickingClickMeIncreasesCount() {

		MouseOver_Page mouseOver_Page = new MouseOver_Page();
		mouseOver_Page.MouseOver(page);

		assertEquals(0, mouseOver_Page.getClickCount());
		mouseOver_Page.ClickMe();
		assertEquals(1, mouseOver_Page.getClickCount());
		mouseOver_Page.ClickMe();
		assertEquals(2, mouseOver_Page.getClickCount());
	}

}
