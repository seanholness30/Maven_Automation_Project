package Day7_051522;

import ReusableLibraries.Reusable_Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_MortgageCalc {
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

        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        //Select start month from dropdown
        //WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        //define select command
        //Select startDateDropdown = new Select(startMonth);

        //Select by visible text
        //startDateDropdown.selectByVisibleText("Jun");

        //clicking on dropdown and its value if the dropdown tag is not under select tag
        //startMonth.click();
/*
        //click on the value of the start month
        driver.findElement(By.xpath("//*[text()='Jun']")).click();

        //select Loan Type from the dropdown
        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));

        //define select command
        Select loanTypeDropdown = new Select(loanType);

        //select by visible text
        loanTypeDropdown.selectByVisibleText("FHA");
*/

        Reusable_Actions.selectbytextAction(driver, "//*[@name='param[start_month]']", "Jun", "Start Month");

    }//end of main method

}//end of java class
