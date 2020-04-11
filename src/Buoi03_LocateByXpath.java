import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buoi03_LocateByXpath {
    public static void main (String[] args){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get browser
        driver.get("https://facebook.com");

        /*//Tim element email va pass theo id
        WebElement txtEmail = driver.findElement(By.id("email"));
        WebElement txtPass = driver.findElement(By.id("pass"));*/

        /*//Cach1: Tim element email va pass theo xpath @id
        WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));*/
        //Cach2: Tim element email va pass theo xpath @name
        WebElement txtEmail = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement txtPass = driver.findElement(By.xpath("//input[@name='pass']"));

        //Nhap du lieu
        txtEmail.sendKeys("abc123@gmail.com");
        txtPass.sendKeys("1234567");

        //Close browser
        //driver.close();

    }
}
