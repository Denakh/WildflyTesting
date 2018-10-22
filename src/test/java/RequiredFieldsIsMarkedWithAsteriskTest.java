import data.NamesOfFields;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log;

@Epic("Verify that required fields is marked with asterisk")
@Feature("Verifying by checking that required fields label texts contain asterisk")
public class RequiredFieldsIsMarkedWithAsteriskTest extends BaseTestStat {

    @Test(priority = 2, description = "Verify that name field is marked with asterisk")
    @Severity(SeverityLevel.NORMAL)
    public void testNameFieldMarkedWithAsterisk() {
        String actualAddHotelNameLabelText = newHotelPage.getAddHotelNameLabelText();
        Log.LOG.debug("Checking that actual result ('" + actualAddHotelNameLabelText + "') " +
                "contains ('" + "*" + "')");
        Assert.assertTrue(actualAddHotelNameLabelText.contains("*"),
                "Name field of Data section of Register new Hotel page doesn't marked with asterisk");
    }

    @Test(priority = 2, description = "Verify that date of construction field is marked with asterisk")
    @Severity(SeverityLevel.NORMAL)
    public void testDateOfConstructionFieldMarkedWithAsterisk() {
        String actualAddHotelDateOfConstructionLabelText = newHotelPage.getAddHotelDateOfConstructionLabelText();
        Log.LOG.debug("Checking that actual result ('" + actualAddHotelDateOfConstructionLabelText + "') " +
                "contains ('" + "*" + "')");
        Assert.assertTrue(actualAddHotelDateOfConstructionLabelText.contains("*"),
                "Date of construction field of Data section of Register new Hotel page doesn't marked with asterisk");
    }

    @Test(priority = 2, description = "Verify that country field is marked with asterisk")
    @Severity(SeverityLevel.NORMAL)
    public void testCountryFieldMarkedWithAsterisk() {
        String actualAddHotelCountryLabelText = newHotelPage.getAddHotelCountryLabelText();
        Log.LOG.debug("Checking that actual result ('" + actualAddHotelCountryLabelText + "') " +
                "contains ('" + "*" + "')");
        Assert.assertTrue(actualAddHotelCountryLabelText.contains("*"),
                "Country field of Data section of Register new Hotel page doesn't marked with asterisk");
    }

    @Test(priority = 2, description = "Verify that city field is marked with asterisk")
    @Severity(SeverityLevel.NORMAL)
    public void testCityFieldMarkedWithAsterisk() {
        String actualAddHotelCityLabelText = newHotelPage.getAddHotelCityLabelText();
        Log.LOG.debug("Checking that actual result ('" + actualAddHotelCityLabelText + "') " +
                "contains ('" + "*" + "')");
        Assert.assertTrue(actualAddHotelCityLabelText.contains("*"),
                "City field of Data section of Register new Hotel page doesn't marked with asterisk");
    }

    @Test(priority = 2, description = "Verify that short description field is marked with asterisk")
    @Severity(SeverityLevel.NORMAL)
    public void testShortDescriptionFieldMarkedWithAsterisk() {
        String actualAddHotelShortDescriptionLabelText = newHotelPage.getAddHotelShortDescriptionLabelText();
        Log.LOG.debug("Checking that actual result ('" + actualAddHotelShortDescriptionLabelText + "') " +
                "contains ('" + "*" + "')");
        Assert.assertTrue(actualAddHotelShortDescriptionLabelText.contains("*"),
                "Short description field of Data section of Register new Hotel page doesn't marked with asterisk");
    }

    @Test(priority = 2, description = "Verify that description field is marked with asterisk")
    @Severity(SeverityLevel.NORMAL)
    public void testDescriptionFieldMarkedWithAsterisk() {
        String actualAddHotelDescriptionLabelText = newHotelPage.getAddHotelDescriptionLabelText();
        Log.LOG.debug("Checking that actual result ('" + actualAddHotelDescriptionLabelText + "') " +
                "contains ('" + "*" + "')");
        Assert.assertTrue(actualAddHotelDescriptionLabelText.contains("*"),
                "Description field of Data section of Register new Hotel page doesn't marked with asterisk");
    }


}
