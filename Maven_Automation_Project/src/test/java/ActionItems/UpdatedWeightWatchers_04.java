package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdatedWeightWatchers_04 {
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

        //Navigate to weight watchers website
        driver.navigate().to("https://www.weightwatchers.com/us/");
        Thread.sleep(1000);

        //Click on Find a Workshop
        WebElement findWkshp = driver.findElement(By.xpath("//span[text() = 'Find a Workshop']"));
        findWkshp.click();








    }//end of main method

}//end of Java class

