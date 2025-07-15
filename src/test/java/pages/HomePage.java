package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Rotate the Earth globe from left to right
    public void rotateGlobe() {
        Actions actions = new Actions(driver);
        WebElement globe = driver.findElement(By.tagName("canvas")); // May vary, adjust if needed
        actions.dragAndDropBy(globe, 300, 0).perform();
    }

    // Zoom into the globe (3 times)
    public void zoomIn() {
        WebElement zoomButton = driver.findElement(By.xpath("//button[@aria-label='Zoom in']"));
        for (int i = 0; i < 3; i++) {
            zoomButton.click();
        }
    }

    // Switch the view from 3D to 2D
    public void switchTo2D() {
        WebElement view2DButton = driver.findElement(By.xpath("//button[contains(text(), '2D')]"));
        view2DButton.click();
    }

    // TODO: Add more methods for satellite orbit and pass projections if required
}
