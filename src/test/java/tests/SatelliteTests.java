package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;
import utils.ScreenshotUtil;

public class SatelliteTests {
    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setup() {
        // Update the path to your ChromeDriver.exe
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Latha\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://satellitemap.space");
        homePage = new HomePage(driver);
    }

    @Test
    public void testRotateGlobe() {
        homePage.rotateGlobe();
        ScreenshotUtil.takeScreenshot(driver, "rotate.png");
    }

    @Test
    public void testZoomIn() {
        homePage.zoomIn();
        ScreenshotUtil.takeScreenshot(driver, "zoom.png");
    }

    @Test
    public void testSwitchTo2D() {
        homePage.switchTo2D();
        ScreenshotUtil.takeScreenshot(driver, "2d-view.png");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
