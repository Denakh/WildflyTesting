import data.AddHotelDataProvider;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import model.Hotel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.NewHotelPage;
import utils.Log;

public class FillNewHotelDataVariantsTest extends BaseTest {

    private Hotel hotel;
    private NewHotelPage newHotelPage;
    private HotelListPage hotelListPage;

    @Test(dataProvider = "addHotelPositiveTestData", dataProviderClass = AddHotelDataProvider.class,
            groups = "positive tests", priority = 1, description = "Calculator positive test")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test uses data provider")
    public void testNewHotelAddingPositive(String name, String globalRating, String dateOfConstruction, String country,
                                           String city, String shortDescription, String description, String notes) {
        String expectedResult = "List of all hotels";
        newHotelPage = new NewHotelPage(driver);
        hotelListPage = new HotelListPage(driver);
        hotel = (new Hotel.HotelBuilder()).setName(name).
                setGlobalRating(globalRating).
                setDateOfConstruction(dateOfConstruction).
                setCountry(country).
                setCity(city).
                setShortDescription(shortDescription).
                setDescription(description).
                setNotes(notes).
                createHotel();
        newHotelPage.fillAndSendNewHotelData(hotel);
        String actualResult = hotelListPage.getHotelListPageHeaderText();
        Log.LOG.debug("Comparison of actual result ('" + actualResult + "') and expected ('" + expectedResult + "')");
        Assert.assertTrue(actualResult.equals(expectedResult), "Hotel adding hasn't been success");
    }

    @Test(dataProvider = "addHotelNegativeTestData", dataProviderClass = AddHotelDataProvider.class,
            groups = "negative tests", priority = 2, description = "calculator negative test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test uses data provider")
    public void testNewHotelAddingNegative(String name, String globalRating, String dateOfConstruction, String country,
                                           String city, String shortDescription, String description, String notes,
                                           String expectedErrorMessage) {
        newHotelPage = new NewHotelPage(driver);
        hotel = (new Hotel.HotelBuilder()).setName(name).
                setGlobalRating(globalRating).
                setDateOfConstruction(dateOfConstruction).
                setCountry(country).
                setCity(city).
                setShortDescription(shortDescription).
                setDescription(description).
                setNotes(notes).
                createHotel();
        newHotelPage.fillAndSendNewHotelData(hotel);
        String actualErrorMessage = newHotelPage.getMessageErrorDetailText();
        Log.LOG.debug("Checking that actual result ('" + actualErrorMessage + "') contains ('" + expectedErrorMessage + "')");
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage), "There are problems in error message: " +
                "expected part of error message: '" + expectedErrorMessage + "', actual error message: '" + actualErrorMessage + "'");
    }

}
