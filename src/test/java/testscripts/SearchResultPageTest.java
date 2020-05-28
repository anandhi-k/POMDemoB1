package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.SearchResultPage;

public class SearchResultPageTest extends TestBase{
	
	HomePage homePage;
	SearchResultPage searchResultPage;
	public SearchResultPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialize();
		homePage = new HomePage();
		searchResultPage = homePage.searchItem(prop.getProperty("searchText"));
		}
	
	@Test
	public void validateElementPresentTest() {
		System.out.println("Search Result Page title : " + driver.getTitle());
		assertTrue(searchResultPage.validateElementPresent());
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
