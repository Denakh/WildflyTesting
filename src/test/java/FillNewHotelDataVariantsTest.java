import data.AddHotelDataProvider;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import model.Hotel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FillNewHotelDataVariantsTest extends BaseTest {

    private Hotel hotel;

    @Test(dataProvider = "addHotelPositiveTestData", dataProviderClass = AddHotelDataProvider.class,
            groups = "positive tests", priority = 1, description = "Calculator positive test")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test uses data provider")
    public void testCalculatorPositive(String name, String globalRating, String dateOfConstruction, String country,
            String city, String shortDescription, String description, String notes) {
        hotel = (new Hotel.HotelBuilder()).setName(name).
                setGlobalRating(globalRating).
                setDateOfConstruction(dateOfConstruction).
                setCountry(country).
                setCity(city).

        String actualResult = AngularCalculatorPage.getCalculationResult(angularCalculatorPage, firstNumber, secondNumber, operator);
        //Log.LOG.debug("comparison of actual result ('" + actualResult + "') and expected ('" + expectedResult + "')");
        Assert.assertTrue(actualResult.equals(expectedResult), errorMessage);
    }

    @Test(dataProvider = "addHotelNegativeTestData", dataProviderClass = AddHotelDataProvider.class,
            groups = "negative tests", priority = 2, description = "calculator negative test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test uses data provider")
    public void testCalculatorNegative(String firstNumber, String secondNumber, String operator, String expectedResult,
                                       String errorMessage) {
        String actualResult = AngularCalculatorPage.getCalculationResult(angularCalculatorPage, firstNumber, secondNumber, operator);
        //Log.LOG.debug("comparison of actual result ('" + actualResult + "') and expected ('" + expectedResult + "')");
        Assert.assertTrue(actualResult.equals(expectedResult), errorMessage);
    }

}
