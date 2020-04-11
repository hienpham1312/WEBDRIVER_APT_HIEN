import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buoi03_LocateByXpath2 {
    public static void main (String[] args){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get browser
        driver.get("https://facebook.com");

        //Tim element button Dang ky theo xpath (Khong co thuoc tinh)
        WebElement btnRegister = driver.findElement(By.xpath("//button[text()='Đăng ký']"));

        //Click
        btnRegister.click();

        //Close browser
        //driver.close();

    }
}
