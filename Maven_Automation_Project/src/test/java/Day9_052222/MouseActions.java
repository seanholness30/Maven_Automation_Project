package Day9_052222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();

        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();

        //set the condition to incognito mode
        options.addArguments("incognito");

        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");

        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);

        //navigate to usps home page
        driver.navigate().to("https://www.usps.com/");
        Thread.sleep(2000);

        //declare and define mouse actions
        Actions mouseActions = new Actions(driver);

        //hover to Send Tab
        WebElement sendTab = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
        mouseActions.moveToElement(sendTab).perform();

        Thread.sleep(2000);

        //click on tracking using mouse actions
        WebElement trackinng = driver.findElement(By.xpath("//*[text()='Tracking']"));
        mouseActions.moveToElement(trackinng).click().perform();

        Thread.sleep(2000);

        //Type a invalid tracking number using sendkeys with mouse actions
        WebElement trackingFeild = driver.findElement(By.xpath("//*[@id='tracking-input']"));
        mouseActions.moveToElement(trackingFeild).click().perform();
        mouseActions.moveToElement(trackingFeild).sendKeys("78195869295466").perform();

    }//end of main method

}//end of java class
