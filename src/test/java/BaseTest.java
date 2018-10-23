import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.NavigatePage;
import utils.Log;
import utils.Screenshots;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    protected NavigatePage navigatePage;
    //protected NewHotelPage newHotelPage;

    @BeforeClass(alwaysRun = true)
    public void setUpGeneral() throws Exception {
        Log.LOG.debug("Test general set up");
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8035/article/faces/welcome.xhtml");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigatePage = new NavigatePage(driver);
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        Log.LOG.debug("Test set up");
        navigatePage.moveCursorToArticleMenu().
                moveCursorToNewMenu().
                clickOnHotelMenu();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            Log.LOG.debug("Getting screenshot because of test is failed: ");
            Screenshots.getScreenShot(driver);
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDownGeneral(ITestContext iTestContext) throws Exception {
        Log.LOG.debug("Test tear down general");
        for (ITestResult testResult : iTestContext.getSkippedTests().getAllResults()) {
            if (testResult.getStatus() == ITestResult.SKIP) {
                Log.LOG.debug("Getting screenshot because of test is skipped: ");
                Screenshots.getScreenShot(driver);
                break;
            }
        }
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
