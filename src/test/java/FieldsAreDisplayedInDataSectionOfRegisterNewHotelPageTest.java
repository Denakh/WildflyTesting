import data.NamesOfFields;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log;

@Epic("Verify that fields are displayed in data section of register new hotel page")
@Feature("Verifying by fields label text")
public class FieldsAreDisplayedInDataSectionOfRegisterNewHotelPageTest extends BaseTestStat {

    @Test
    public void testNameFieldIsDisplayed() {
        String actualAddHotelNameLabelText = newHotelPage.getAddHotelNameLabelText();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelNameLabelText + "') " +
                "and expected ('" + NamesOfFields.addHotelNameLabelText + "')");
        Assert.assertTrue(actualAddHotelNameLabelText.equals(NamesOfFields.addHotelNameLabelText),
                "Actual text in name field of Data section of Register new Hotel page: '" +
                        actualAddHotelNameLabelText +
                        "', expected: '" + NamesOfFields.addHotelNameLabelText);
    }

    @Test
    public void testRatingFieldIsDisplayed() {
        String actualAddHotelRatingLabelText = newHotelPage.getAddHotelRatingLabelText();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelRatingLabelText + "') " +
                "and expected ('" + NamesOfFields.addHotelGlobalRatingLabelText + "')");
        Assert.assertTrue(actualAddHotelRatingLabelText.equals(NamesOfFields.addHotelGlobalRatingLabelText),
                "Actual text in rating field of Data section of Register new Hotel page: '" +
                        actualAddHotelRatingLabelText +
                        "', expected: '" + NamesOfFields.addHotelGlobalRatingLabelText);
    }

    @Test
    public void testDateOfConstructionFieldIsDisplayed() {
        String actualAddHotelDateOfConstructionLabelText = newHotelPage.getAddHotelDateOfConstructionLabelText();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelDateOfConstructionLabelText + "') " +
                "and expected ('" + NamesOfFields.addHotelDateOfConstructionLabelText + "')");
        Assert.assertTrue(actualAddHotelDateOfConstructionLabelText.equals(NamesOfFields.addHotelDateOfConstructionLabelText),
                "Actual text in date of construction field of Data section of Register new Hotel page: '" +
                        actualAddHotelDateOfConstructionLabelText +
                        "', expected: '" + NamesOfFields.addHotelDateOfConstructionLabelText);
    }

    @Test
    public void testCountryFieldIsDisplayed() {
        String actualAddHotelCountryLabelText = newHotelPage.getAddHotelCountryLabelText();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelCountryLabelText + "') " +
                "and expected ('" + NamesOfFields.addHotelCountryLabelText + "')");
        Assert.assertTrue(actualAddHotelCountryLabelText.equals(NamesOfFields.addHotelCountryLabelText),
                "Actual text in country field of Data section of Register new Hotel page: '" +
                        actualAddHotelCountryLabelText +
                        "', expected: '" + NamesOfFields.addHotelCountryLabelText);
    }

    @Test
    public void testCityFieldIsDisplayed() {
        String actualAddHotelCityLabelText = newHotelPage.getAddHotelCityLabelText();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelCityLabelText + "') " +
                "and expected ('" + NamesOfFields.addHotelCityLabelText + "')");
        Assert.assertTrue(actualAddHotelCityLabelText.equals(NamesOfFields.addHotelCityLabelText),
                "Actual text in city field of Data section of Register new Hotel page: '" +
                        actualAddHotelCityLabelText +
                        "', expected: '" + NamesOfFields.addHotelCityLabelText);
    }

    @Test
    public void testShortDescriptionFieldIsDisplayed() {
        String actualAddHotelShortDescriptionLabelText = newHotelPage.getAddHotelShortDescriptionLabelText();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelShortDescriptionLabelText + "') " +
                "and expected ('" + NamesOfFields.addHotelShortDescriptionLabelText + "')");
        Assert.assertTrue(actualAddHotelShortDescriptionLabelText.equals(NamesOfFields.addHotelShortDescriptionLabelText),
                "Actual text in short description field of Data section of Register new Hotel page: '" +
                        actualAddHotelShortDescriptionLabelText +
                        "', expected: '" + NamesOfFields.addHotelShortDescriptionLabelText);
    }

    @Test
    public void testDescriptionFieldIsDisplayed() {
        String actualAddHotelDescriptionLabelText = newHotelPage.getAddHotelDescriptionLabelText();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelDescriptionLabelText + "') " +
                "and expected ('" + NamesOfFields.addHotelDescriptionLabelText + "')");
        Assert.assertTrue(actualAddHotelDescriptionLabelText.equals(NamesOfFields.addHotelDescriptionLabelText),
                "Actual text in description field of Data section of Register new Hotel page: '" +
                        actualAddHotelDescriptionLabelText +
                        "', expected: '" + NamesOfFields.addHotelDescriptionLabelText);
    }

    @Test
    public void testNotesFieldIsDisplayed() {
        String actualAddHotelNotesLabelText = newHotelPage.getAddHotelNotesLabelText();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelNotesLabelText + "') " +
                "and expected ('" + NamesOfFields.addHotelNotesLabelText + "')");
        Assert.assertTrue(actualAddHotelNotesLabelText.equals(NamesOfFields.addHotelNotesLabelText),
                "Actual text in notes field of Data section of Register new Hotel page: '" +
                        actualAddHotelNotesLabelText +
                        "', expected: '" + NamesOfFields.addHotelNotesLabelText);
    }

}
