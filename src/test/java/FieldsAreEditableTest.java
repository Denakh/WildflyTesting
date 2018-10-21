import data.AddHotelDataProvider;
import data.NamesOfFields;
import model.Hotel;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.NewHotelPage;

public class FieldsAreEditableTest extends BaseTest {

    private Hotel hotel;
    private NewHotelPage newHotelPage;
    private String text = "editable";

    @BeforeClass
    @Override
    public void setUpGeneral() throws Exception {
        super.setUpGeneral();
        navigatePage.moveCursorToArticleMenu().
                moveCursorToNewMenu().
                clickOnHotelMenu();
        newHotelPage = new NewHotelPage(driver);
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

    @BeforeMethod
    @Override
    public void setUp() throws Exception {
    }

    @Test
    public void testNameFieldIsEditable() {
        String actualAddHotelNameText = newHotelPage.getTypedNameValue();
        Assert.assertTrue(actualAddHotelNameText.equals(text), "Name field isn't editable");
    }

    @Test
    public void testDateOfConstructionFieldIsEditable() {
        String actualAddHotelDateOfConstructionText = newHotelPage.getTypedDateOfConstructionValue();
        Assert.assertTrue(actualAddHotelDateOfConstructionText.equals("000"), "Date of construction field isn't editable");
    }

    @Test
    public void testCountryFieldIsEditable() {
        String actualAddHotelCountryText = newHotelPage.getSelectedCountryValue();
        Assert.assertTrue(actualAddHotelCountryText.equals(AddHotelDataProvider.testCountry), "Country field isn't editable");
    }

    @Test
    public void testCityFieldIsEditable() {
        String actualAddHotelCityText = newHotelPage.getSelectedCityValue();
        Assert.assertTrue(actualAddHotelCityText.equals(AddHotelDataProvider.testCity), "City field isn't editable");
    }

    @Test
    public void testShortDescriptionFieldIsEditable() {
        String actualAddHotelShortDescriptionText = newHotelPage.getTypedShortDescriptionValue();
        Assert.assertTrue(actualAddHotelShortDescriptionText.equals(text), "Short description field isn't editable");
    }

    @Test
    public void testDescriptionFieldIsEditable() {
        String actualAddHotelDescriptionText = newHotelPage.getTypedDescriptionValue();
        Assert.assertTrue(actualAddHotelDescriptionText.equals(text), "Description field isn't editable");
    }

    @Test
    public void testNotesFieldIsEditable() {
        String actualAddHotelNotesText = newHotelPage.getTypedNotesValue();
        Assert.assertTrue(actualAddHotelNotesText.equals(text), "Notes field isn't editable");
    }

}
