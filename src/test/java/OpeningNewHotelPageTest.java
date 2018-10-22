import data.NamesOfFields;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log;

@Epic("Verify that fields are displayed in data section of register new hotel page")
@Feature("Verifying by fields label text")
public class OpeningNewHotelPageTest extends BaseTestStat {

    private String expectedPageHeader = "Register new Hotel";
    private String expectedDataSectionHeader = "Data:";
    private String expectedSaveButtonText = "Save";

    @Test
    public void testRegisterNewHotelPageIsDisplayedWhenUserSelectsArticleNewHotel() {
        String actualPageHeader = newHotelPage.getNewHotelPageHeaderText();
        Log.LOG.debug("Comparison of actual result ('" + actualPageHeader + "') " +
                "and expected ('" + expectedPageHeader + "')");
        Assert.assertTrue(actualPageHeader.equals(expectedPageHeader),
                "Error with new hotel page header text");
    }

    @Test
    public void testDataSectionIsDisplayedOnRegisterNewHotel() {
        String actualDataSectionHeader = newHotelPage.getDataSectionHeaderText();
        Log.LOG.debug("Comparison of actual result ('" + actualDataSectionHeader + "') " +
                "and expected ('" + expectedDataSectionHeader + "')");
        Assert.assertTrue(actualDataSectionHeader.equals(expectedDataSectionHeader),
                "Error with data section on register new hotel");
    }

    @Test
    public void testSaveButtonIsDisplayedOnRegisterNewHotel() {
        String actualSaveButtonText = newHotelPage.getSaveButtonText();
        Log.LOG.debug("Comparison of actual result ('" + actualSaveButtonText + "') " +
                "and expected ('" + expectedSaveButtonText + "')");
        Assert.assertTrue(actualSaveButtonText.equals(expectedSaveButtonText),
                "Error with save button on register new hotel");
    }

}
