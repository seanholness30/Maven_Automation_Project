package Day6_051422;

import ReusableLibraries.Reusable_Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_MortgageCalc {
    public static void main(String[] args) throws InterruptedException {

        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();

        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();

        //set the condition to incognito mode
        options.addArguments("incognito");

        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");

        //setting your driver as headless(running on background)
        //options.addArguments("headless");

        //for mac use fullscreen
        //options.addArguments("start-fullscreen");

        //define the webdriver I am going to user
        WebDriver driver = new ChromeDriver(options);

        //Navigate to mortgage calculator website
        driver.navigate().to("https://www.mortgagecalculator.org");

        Reusable_Actions.scrollAction(driver,"scroll(0,550)");
/*
        //wait for webpage to load, 3 seconds
        Thread.sleep(3000);

        //declare javascriptexecutor variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //scroll to pixel 800 on mortgage calc website
        jse.executeScript("scroll(0,800)");
        //wait a bit for browser to perform scrolling
        Thread.sleep(3000);

        //declare a webelement variable that we want to scroll into
        WebElement shareButton = driver.findElement(By.xpath("//*[@id = 'share_button']"));

        //scroll into share this calculation button
        jse.executeScript("arguments[0].scrollIntoView(true);", shareButton);
        Thread.sleep(2000);

        //click on the share this calculation button
        shareButton.click();

        Thread.sleep(2000);

        //Scroll back up
        jse.executeScript("scroll(0,-800)");
        Thread.sleep(2000);

        //quit the chrome driver
        driver.quit();

 */

    }//end of main method

}//end of java class
