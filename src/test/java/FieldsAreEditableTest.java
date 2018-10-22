import data.AddHotelDataProvider;
import data.NamesOfFields;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import model.Hotel;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Log;

@Epic("Verify that fields are editable")
@Feature("Verifying by fields probe typing and getting appropriate field value")
public class FieldsAreEditableTest extends BaseTestStat {

    private Hotel hotel;
    private String text = "editable";

    @BeforeClass
    @Override
    public void setUpGeneral() throws Exception {
        super.setUpGeneral();
        hotel = (new Hotel.HotelBuilder()).setName(text).
                setGlobalRating("3").
                setDateOfConstruction("000").
                setCountry(AddHotelDataProvider.testCountry).
                setCity(AddHotelDataProvider.testCity).
                setShortDescription(text).
                setDescription(text).
                setNotes(text).
                createHotel();
        newHotelPage.fillNewHotelData(hotel);
    }

    @Test
    public void testNameFieldIsEditable() {
        String actualAddHotelNameText = newHotelPage.getTypedNameValue();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelNameText + "') " +
                "and expected ('" + text + "')");
        Assert.assertTrue(actualAddHotelNameText.equals(text), "Name field isn't editable");
    }

    @Test
    public void testDateOfConstructionFieldIsEditable() {
        String actualAddHotelDateOfConstructionText = newHotelPage.getTypedDateOfConstructionValue();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelDateOfConstructionText + "') " +
                "and expected ('" + "000" + "')");
        Assert.assertTrue(actualAddHotelDateOfConstructionText.equals("000"), "Date of construction field isn't editable");
    }

    @Test
    public void testCountryFieldIsEditable() {
        String actualAddHotelCountryText = newHotelPage.getSelectedCountryValue();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelCountryText + "') " +
                "and expected ('" + AddHotelDataProvider.testCountry + "')");
        Assert.assertTrue(actualAddHotelCountryText.equals(AddHotelDataProvider.testCountry), "Country field isn't editable");
    }

    @Test
    public void testCityFieldIsEditable() {
        String actualAddHotelCityText = newHotelPage.getSelectedCityValue();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelCityText + "') " +
                "and expected ('" + AddHotelDataProvider.testCity + "')");
        Assert.assertTrue(actualAddHotelCityText.equals(AddHotelDataProvider.testCity), "City field isn't editable");
    }

    @Test
    public void testShortDescriptionFieldIsEditable() {
        String actualAddHotelShortDescriptionText = newHotelPage.getTypedShortDescriptionValue();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelShortDescriptionText + "') " +
                "and expected ('" + text + "')");
        Assert.assertTrue(actualAddHotelShortDescriptionText.equals(text), "Short description field isn't editable");
    }

    @Test
    public void testDescriptionFieldIsEditable() {
        String actualAddHotelDescriptionText = newHotelPage.getTypedDescriptionValue();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelDescriptionText + "') " +
                "and expected ('" + text + "')");
        Assert.assertTrue(actualAddHotelDescriptionText.equals(text), "Description field isn't editable");
    }

    @Test
    public void testNotesFieldIsEditable() {
        String actualAddHotelNotesText = newHotelPage.getTypedNotesValue();
        Log.LOG.debug("Comparison of actual result ('" + actualAddHotelNotesText + "') " +
                "and expected ('" + text + "')");
        Assert.assertTrue(actualAddHotelNotesText.equals(text), "Notes field isn't editable");
    }

}
