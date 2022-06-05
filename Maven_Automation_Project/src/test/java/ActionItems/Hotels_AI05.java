package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hotels_AI05 {
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

        //navigate to google
        driver.navigate().to("https://www.hotels.com");
        Thread.sleep(1000);

        //type destination in search field
        try {
            WebElement searchField = driver.findElement(By.xpath("//*[@aria-label='Going to']"));
            searchField.click();
            searchField.clear();
            Thread.sleep(1000);
        } catch (Exception e) {
            //print out exception
            System.out.println("Unable to click search field " + e);
        }// end of search field exception

        //Enter in location in search field
        try {
            WebElement tripDestination = driver.findElement(By.xpath("//*[@id='location-field-destination']"));
            tripDestination.click();
            tripDestination.sendKeys("Miami");
            Thread.sleep(1000);
        } catch (Exception e) {
            //print out exception
            System.out.println("Unable to enter destination " + e);
        }//end of destination search field

        //click on first drop down link
        try {
            WebElement firstLink = driver.findElements(By.xpath("//*[@class='uitk-typeahead-result-item has-subtext' ]")).get(0);
            firstLink.click();
            Thread.sleep(1000);
        } catch (Exception e) {
            //print out exception
            System.out.println("Unable to click first drop down link " + e);
        }// end of first drop down link

        //select check-in date tab
        try {
            WebElement selectTab = driver.findElement(By.xpath("//*[@id='d1-btn']"));
            selectTab.click();
            Thread.sleep(1000);
        } catch (Exception e) {
            //print out exception
            System.out.println("Unable to select check in tab " + e);
        }//end of select check-in tab

        //select check-in date from dop down
        try {
            WebElement startDate = driver.findElement(By.xpath("//*[@aria-label='Jun 11, 2022']"));
            startDate.click();
            Thread.sleep(1000);
        } catch (Exception e) {
            //print out exception
            System.out.println("Unable to select date " + e);
        }//end of start date

        //select check-out date tab
        try {
            WebElement selectTab = driver.findElement(By.xpath("//*[@id='d2-btn']"));
            selectTab.click();
            Thread.sleep(1000);
        } catch (Exception e) {
            //print out exception
            System.out.println("Unable to select check in tab " + e);
        }//end of select check-in tab

        //select check-out date
        try {
            WebElement endDate = driver.findElement(By.xpath("//*[@aria-label='Jun 15, 2022']"));
            endDate.click();
            Thread.sleep(1000);
        } catch (Exception e) {
            //print out exception
            System.out.println("Unable to select date");
        }//end of check out date

        //




    }//end of main method

}//end of java class
