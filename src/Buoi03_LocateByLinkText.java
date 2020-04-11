import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buoi03_LocateByLinkText {
    public static void main (String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get browser
        driver.get("https://facebook.com");

        //Tim element theo linktext
        WebElement eleForgetPass = driver.findElement(By.linkText("Quên tài khoản?"));

        //Click link
        eleForgetPass.click();

        //Close browser
        //driver.close();

    }
}
