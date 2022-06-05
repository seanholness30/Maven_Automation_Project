package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI03Substring {
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
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Anime");
        hobbies.add("Soccer");
        hobbies.add("Football");
        hobbies.add("Read Manga");
        hobbies.add("Video Games");
        for(int i = 0; i < hobbies.size(); i++) {

            //go to Bing home page
            driver.navigate().to("https://www.bing.com");

            Thread.sleep(3000);

            //maximize the driver
            //driver.manage().window().maximize(); //for mac use window().fullScreen();

            //locate element for search field and type keyword 'hobbies'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobbies.get(i));

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
            System.out.println("My search result for " + hobbies.get(i) + " is " + arrayResult[0]);

        }//end of for loop

        //quit the driver
        driver.quit();

    }//end of main method
}//end of java class
