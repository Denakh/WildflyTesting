import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log;

@Epic("Verify that user can open new hotel page")
@Feature("Verifying by checking of new hotel page main headers texts")
public class OpeningNewHotelPageTest extends BaseTestStat {

    private String expectedPageHeader = "Register new Hotel";
    private String expectedDataSectionHeader = "Data:";
    private String expectedSaveButtonText = "Save";

    @Test(priority = 1, description = "Verify that register new hotel page is displayed when user selects article->new->hotel")
    @Severity(SeverityLevel.BLOCKER)
    public void testRegisterNewHotelPageIsDisplayedWhenUserSelectsArticleNewHotel() {
        String actualPageHeader = newHotelPage.getNewHotelPageHeaderText();
        Log.LOG.debug("Comparison of actual result ('" + actualPageHeader + "') " +
                "and expected ('" + expectedPageHeader + "')");
        Assert.assertTrue(actualPageHeader.equals(expectedPageHeader),
                "Error with new hotel page header text");
    }

    @Test(priority = 1, description = "Verify that data section is displayed on register new hotel page")
    @Severity(SeverityLevel.BLOCKER)
    public void testDataSectionIsDisplayedOnRegisterNewHotel() {
        String actualDataSectionHeader = newHotelPage.getDataSectionHeaderText();
        Log.LOG.debug("Comparison of actual result ('" + actualDataSectionHeader + "') " +
                "and expected ('" + expectedDataSectionHeader + "')");
        Assert.assertTrue(actualDataSectionHeader.equals(expectedDataSectionHeader),
                "Error with data section on register new hotel");
    }

    @Test(priority = 1, description = "Verify that save button is displayed on register new hotel page")
    @Severity(SeverityLevel.BLOCKER)
    public void testSaveButtonIsDisplayedOnRegisterNewHotel() {
        String actualSaveButtonText = newHotelPage.getSaveButtonText();
        Log.LOG.debug("Comparison of actual result ('" + actualSaveButtonText + "') " +
                "and expected ('" + expectedSaveButtonText + "')");
        Assert.assertTrue(actualSaveButtonText.equals(expectedSaveButtonText),
                "Error with save button on register new hotel");
    }

}
