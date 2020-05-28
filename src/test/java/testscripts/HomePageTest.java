package testscripts;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class HomePageTest extends TestBase{
	HomePage homePage;
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialize();
		homePage = new HomePage();
		}
  @Test
  public void validateTitleTest() {
	  String pageTitle = homePage.validateTitle();
	  assertEquals(pageTitle, "Your Store");
  }
  @Test
  public void searchItemTest() {
	  homePage.searchItem(prop.getProperty("searchText"));
  }
  
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }

}
