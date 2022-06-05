package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElement_MortgageCalc {
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

        //navigate to mortgage calculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        //Thread.sleep(3000);

        //click, clear and enter new value on Home value field
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.click();
        homeValue.clear();
        //Thread.sleep(1000);
        homeValue.sendKeys("450000");

        //click on % radio button
        //driver.findElement(By.xpath("//*[@value='percent']")).click();

        //click, clear and enter new data from down payment field
        WebElement downpayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
        downpayment.click();
        downpayment.clear();
        downpayment.sendKeys("50000");

        // click, clear enter new data from Interest rate
        WebElement interestrate = driver.findElement(By.xpath("//*[@id='intrstsrate']"));
        interestrate.click();
        interestrate.clear();
        interestrate.sendKeys("4.5");


    }//end of main method

}//end of java class
