import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.NavigatePage;
import pages.NewHotelPage;

import java.util.concurrent.TimeUnit;

public class BaseTestStat {

    protected WebDriver driver;
    protected NavigatePage navigatePage;
    protected NewHotelPage newHotelPage;

    @BeforeClass(alwaysRun = true)
    public void setUpGeneral() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/article/faces/welcome.xhtml");
        driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
        navigatePage = new NavigatePage(driver);
        navigatePage.moveCursorToArticleMenu().
                moveCursorToNewMenu().
                clickOnHotelMenu();
        newHotelPage = new NewHotelPage(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.close();
    }

}
