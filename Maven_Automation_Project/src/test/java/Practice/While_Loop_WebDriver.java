package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class While_Loop_WebDriver {
    public static void main(String[] args) throws InterruptedException {
        //Set up your chromedriver with webdrivermanager
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

        //define the web-driver I am going to user
        WebDriver driver = new ChromeDriver(options);


        //capture search number and print for following cities using arrayList and for loop
        String[] hobbies = new String[]{"Anime", "Soccer", "Football", "Read Manga", "Video Games"};
        int i = 0;
        while (i < hobbies.length){



            //go to Bing home page
            driver.navigate().to("https://www.bing.com");

            Thread.sleep(3000);

            //maximize the driver
            //driver.manage().window().maximize(); //for mac use window().fullScreen();

            //locate element for search field and type keyword 'hobbies'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobbies[i]);

            //submit on Bing search button
            driver.findElement(By.xpath("//*[@id= 'sb_form_go']")).submit();

            Thread.sleep(3000);

            //capture the Bing search and print it
            String searchResult = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();
            //System.out.println("Result is " + searchResult);

            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");

            //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""(no space)
            //String replaceParanth = arrayResult[3].replace("(","").replace (")","");
            System.out.println("My search result for " + hobbies[i] + " is " + arrayResult[0]);



            i++;

        }//end of for loop


        //quit the driver

    }//end of main method
}//end of java class
