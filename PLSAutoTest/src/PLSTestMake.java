import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by sonamsinha on 10/14/16.
 */
public class PLSTestMake {

    WebDriver driver;

    //Setting the property for Chrome driver and creating a chrome object
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/sonamsinha/Downloads/chromedriver");
        driver = new ChromeDriver();

    }


    // Close the Chrome browser once the test is finished
    @After
    public void close() throws InterruptedException{
        Thread.sleep(6000);
        driver.close();
    }

    @Test
    public void test() throws InterruptedException{
        //Open PLS auto website
        driver.get("http://plsautowebsite.azurewebsites.net/");

        //Finding an element
        WebElement make = driver.findElement(By.xpath(".//span[contains(text(), 'MAKE')]"));

        //Click on MAKE button
        if(make != null){
            make.click();
        }

        System.out.println("Test case for \"MAKE\" has been executed");


    }
}
