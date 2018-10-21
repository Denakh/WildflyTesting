import data.NamesOfFields;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NewHotelPage;

public class RequiredFieldsIsMarkedWithAsteriskTest extends BaseTest {

    @BeforeClass
    @Override
    public void setUpGeneral() throws Exception {
        super.setUpGeneral();
        navigatePage.moveCursorToArticleMenu().
                moveCursorToNewMenu().
                clickOnHotelMenu();
        newHotelPage = new NewHotelPage(driver);
    }

    @BeforeMethod
    @Override
    public void setUp() throws Exception {
    }

    @Test
    public void testNameFieldMarkedWithAsterisk() {
        String actualAddHotelNameLabelText = newHotelPage.getAddHotelNameLabelText();
        Assert.assertTrue(actualAddHotelNameLabelText.contains("*"),
                "Name field of Data section of Register new Hotel page doesn't marked with asterisk");
    }

    @Test
    public void testDateOfConstructionFieldMarkedWithAsterisk() {
        String actualAddHotelDateOfConstructionLabelText = newHotelPage.getAddHotelDateOfConstructionLabelText();
        Assert.assertTrue(actualAddHotelDateOfConstructionLabelText.contains("*"),
                "Date of construction field of Data section of Register new Hotel page doesn't marked with asterisk");
    }

    @Test
    public void testCountryFieldMarkedWithAsterisk() {
        String actualAddHotelCountryLabelText = newHotelPage.getAddHotelCountryLabelText();
        Assert.assertTrue(actualAddHotelCountryLabelText.contains("*"),
                "Country field of Data section of Register new Hotel page doesn't marked with asterisk");
    }

    @Test
    public void testCityFieldMarkedWithAsterisk() {
        String actualAddHotelCityLabelText = newHotelPage.getAddHotelCityLabelText();
        Assert.assertTrue(actualAddHotelCityLabelText.contains("*"),
                "City field of Data section of Register new Hotel page doesn't marked with asterisk");
    }

    @Test
    public void testShortDescriptionFieldMarkedWithAsterisk() {
        String actualAddHotelShortDescriptionLabelText = newHotelPage.getAddHotelShortDescriptionLabelText();
        Assert.assertTrue(actualAddHotelShortDescriptionLabelText.contains("*"),
                "Short description field of Data section of Register new Hotel page doesn't marked with asterisk");
    }

    @Test
    public void testDescriptionFieldMarkedWithAsterisk() {
        String actualAddHotelDescriptionLabelText = newHotelPage.getAddHotelDescriptionLabelText();
        Assert.assertTrue(actualAddHotelDescriptionLabelText.contains("*"),
                "Description field of Data section of Register new Hotel page doesn't marked with asterisk");
    }


}
