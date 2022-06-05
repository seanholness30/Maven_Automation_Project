package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Automation_AI04 {
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

        //Create a Arraylist with 3 different zipCode
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11210");
        zipCode.add("07204");
        zipCode.add("10017");

        for (int i = 0; i < zipCode.size(); i++) {

            //Navigate to weight watchers website
            driver.navigate().to("https://www.weightwatchers.com/us/");
            Thread.sleep(3000);

            //Handle exception for Attend Dropdown
            try {
                // click on Attend
                driver.findElement(By.xpath("//*[@data-e2e-name='attend']")).click();
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate attend button" + e);
            }//end of exception for clicking attend

            //Handle exception for Unlimited Workshop
            try {
                //click on Unlimited Workshop
                driver.findElement(By.xpath("//*[@data-e2e-name='unlimited_workshops']")).click();
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate Unlimited Workshop" + e);
            }//end of exception for clicking on Unlimited Workshop

            //Handle exception for Studio
            try {
                //click on Studio & clear field to enter in zipcodes
                driver.findElements(By.xpath("//*[@class='buttonText-3DCCO']")).get(1).click();
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to click & clear Studio search bar" + e);
            }//end of exception for clicking & Clearing Studio search Bar

            //Handle exception for clearing & entering zipcode //Click on Search Arrow
            try {
                //clear & entering zipcode &
                WebElement zipcode = driver.findElement(By.xpath("//*[@id='location-search']"));
                zipcode.clear();
                zipcode.click();
                zipcode.sendKeys(zipCode.get(i));
                driver.findElement(By.xpath("//*[@id='location-search-cta']")).submit();
                Thread.sleep(2000);
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to clear & enter zip codes" + e);
            }// end of exception

            // Click on the specific link for the studios & Capture Address
            try {
                WebElement studiolinks = driver.findElements(By.xpath("//*[@class='linkUnderline-1_h4g']")).get(i);
                //Conditions for each iteration
                if (i == 0) {
                    studiolinks.click();
                    Thread.sleep(2000);
                    String Address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                    System.out.println("For zipcode 11210 the address for this studio is \n\n" + Address);

                } else if (i == 1) {
                    studiolinks.click();
                    Thread.sleep(2000);
                    String Address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                    System.out.println("For zipcode 07204 the address for this studio is \n\n" + Address);
                } else {
                    studiolinks.click();
                    Thread.sleep(2000);
                    String Address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                    System.out.println("For zipcode 33028 the address for this studio is \n\n" + Address);
                }//end of condition

            } catch (Exception e) {
                System.out.println("Conditions did not return address" + e);
            }//end of conditions

            //Use JavascriptExecutor to scroll & capture entire table
            try {
                //declare a webelement variable that we want to scroll into
                Thread.sleep(2000);
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("scroll(0,500)");
                Thread.sleep(2000);
                System.out.println("Workshops schedule is  \n");
                System.out.println(driver.findElement(By.xpath("//*[@class='workshopSchedule-2foP8']")).getText());
            } catch (Exception e) {
                System.out.println("Unable to capture Workshop Schedule " + e);

            }//End of capturing workshop schedule

        }//end of for loop

        //Quit the driver
        driver.quit();


    }//end of main method

}//end of  java class
