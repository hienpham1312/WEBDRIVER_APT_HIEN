import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buoi03_LocateByName {
    public static void main (String[] args){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get browser
        driver.get("https://facebook.com/");

        //Tim element email va pass theo name
        WebElement txtEmail = driver.findElement(By.name("email"));
        WebElement txtPass = driver.findElement(By.name("pass"));

        //Nhap du lieu
        txtEmail.sendKeys("abc222@gmail.com");
        txtPass.sendKeys("1234567");

        //Close browser
        //driver.close();

    }
}
