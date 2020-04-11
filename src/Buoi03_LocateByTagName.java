import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Buoi03_LocateByTagName {
    public static void main (String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get browser
        driver.get("https://facebook.com");

        //Tim element theo tagName - tim tat ca ele la duong link tren page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        //in so luong links tren page ra man hinh console
        System.out.println(links.size());

        //Close browser
        //driver.close();
    }
}
