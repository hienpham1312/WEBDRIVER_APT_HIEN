import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buoi03_LocateElementLoginSendo {
    public static void main (String[] args){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get browser
        driver.get("https://sendo.vn");
        driver.manage().window().maximize();

        // button login
        WebElement btnLogin = driver.findElement(By.xpath("//button[@id='login']"));
        btnLogin.click();
        //sendo ID
        WebElement btnSendoID = driver.findElement(By.xpath("//span[contains(text(),'Đã có SendoID')]"));
        btnSendoID.click();

        //username and password
        WebElement txtusername = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement txtpassword = driver.findElement(By.xpath("//input[@name='password']"));
        //input username and password
        txtusername.sendKeys("abc541@gmail.com");
        txtpassword.sendKeys("1234567");

        //login
        driver.findElement(By.xpath("//button[@class='btnLogin_1eqO']")).click();

        //Close browser
        //driver.close();

    }
}
