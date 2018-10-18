import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.NewHotelPage;

public class OpeningNewHotelPageTest extends BaseTest {

    private NewHotelPage newHotelPage;
    private String expectedPageHeader = "Register new Hotel";

    @BeforeClass
    @Override
    public void setUp() throws Exception {
        super.setUp();
        newHotelPage = new NewHotelPage(driver);
        newHotelPage.moveCursorToArticleMenu();
        newHotelPage.moveCursorToNewMenu();
        newHotelPage.clickOnHotelMenu();
    }

    @Test
    public void testRegisterNewHotelPageIsDisplayedWhenUserSelectsArticleNewHotel() {
        String actualPageHeader = newHotelPage.getNewHotelPageHeaderText();
        Assert.assertTrue(actualPageHeader.equals(expectedPageHeader), "Error with new hotel page header text");
    }

}
