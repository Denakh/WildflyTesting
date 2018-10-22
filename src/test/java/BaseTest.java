import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.NavigatePage;
import pages.NewHotelPage;
import utils.Log;

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
        driver.get("http://localhost:8080/article/faces/welcome.xhtml");
        driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
        navigatePage = new NavigatePage(driver);
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        Log.LOG.debug("Test set up");
        navigatePage.moveCursorToArticleMenu().
                moveCursorToNewMenu().
                clickOnHotelMenu();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        Log.LOG.debug("Test tear down");
        driver.close();
    }


}
