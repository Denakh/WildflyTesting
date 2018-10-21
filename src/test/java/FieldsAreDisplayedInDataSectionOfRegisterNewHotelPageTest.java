import data.NamesOfFields;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.NewHotelPage;

public class FieldsAreDisplayedInDataSectionOfRegisterNewHotelPageTest extends BaseTest {


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
    public void testNameFieldIsDisplayed() {
        String actualAddHotelNameLabelText = newHotelPage.getAddHotelNameLabelText();
        Assert.assertTrue(actualAddHotelNameLabelText.equals(NamesOfFields.addHotelNameLabelText),
                "Actual text in name field of Data section of Register new Hotel page: '" +
                        actualAddHotelNameLabelText +
                        "', expected: '" + NamesOfFields.addHotelNameLabelText);
    }

    @Test
    public void testRatingFieldIsDisplayed() {
        String actualAddHotelRatingLabelText = newHotelPage.getAddHotelRatingLabelText();
        Assert.assertTrue(actualAddHotelRatingLabelText.equals(NamesOfFields.addHotelGlobalRatingLabelText),
                "Actual text in rating field of Data section of Register new Hotel page: '" +
                        actualAddHotelRatingLabelText +
                        "', expected: '" + NamesOfFields.addHotelGlobalRatingLabelText);
    }

    @Test
    public void testDateOfConstructionFieldIsDisplayed() {
        String actualAddHotelDateOfConstructionLabelText = newHotelPage.getAddHotelDateOfConstructionLabelText();
        Assert.assertTrue(actualAddHotelDateOfConstructionLabelText.equals(NamesOfFields.addHotelDateOfConstructionLabelText),
                "Actual text in date of construction field of Data section of Register new Hotel page: '" +
                        actualAddHotelDateOfConstructionLabelText +
                        "', expected: '" + NamesOfFields.addHotelDateOfConstructionLabelText);
    }

    @Test
    public void testCountryFieldIsDisplayed() {
        String actualAddHotelCountryLabelText = newHotelPage.getAddHotelCountryLabelText();
        Assert.assertTrue(actualAddHotelCountryLabelText.equals(NamesOfFields.addHotelCountryLabelText),
                "Actual text in country field of Data section of Register new Hotel page: '" +
                        actualAddHotelCountryLabelText +
                        "', expected: '" + NamesOfFields.addHotelCountryLabelText);
    }

    @Test
    public void testCityFieldIsDisplayed() {
        String actualAddHotelCityLabelText = newHotelPage.getAddHotelCityLabelText();
        Assert.assertTrue(actualAddHotelCityLabelText.equals(NamesOfFields.addHotelCityLabelText),
                "Actual text in city field of Data section of Register new Hotel page: '" +
                        actualAddHotelCityLabelText +
                        "', expected: '" + NamesOfFields.addHotelCityLabelText);
    }

    @Test
    public void testShortDescriptionFieldIsDisplayed() {
        String actualAddHotelShortDescriptionLabelText = newHotelPage.getAddHotelShortDescriptionLabelText();
        Assert.assertTrue(actualAddHotelShortDescriptionLabelText.equals(NamesOfFields.addHotelShortDescriptionLabelText),
                "Actual text in short description field of Data section of Register new Hotel page: '" +
                        actualAddHotelShortDescriptionLabelText +
                        "', expected: '" + NamesOfFields.addHotelShortDescriptionLabelText);
    }

    @Test
    public void testDescriptionFieldIsDisplayed() {
        String actualAddHotelDescriptionLabelText = newHotelPage.getAddHotelDescriptionLabelText();
        Assert.assertTrue(actualAddHotelDescriptionLabelText.equals(NamesOfFields.addHotelDescriptionLabelText),
                "Actual text in description field of Data section of Register new Hotel page: '" +
                        actualAddHotelDescriptionLabelText +
                        "', expected: '" + NamesOfFields.addHotelDescriptionLabelText);
    }

    @Test
    public void testNotesFieldIsDisplayed() {
        String actualAddHotelNotesLabelText = newHotelPage.getAddHotelNotesLabelText();
        Assert.assertTrue(actualAddHotelNotesLabelText.equals(NamesOfFields.addHotelNotesLabelText),
                "Actual text in notes field of Data section of Register new Hotel page: '" +
                        actualAddHotelNotesLabelText +
                        "', expected: '" + NamesOfFields.addHotelNotesLabelText);
    }

}
