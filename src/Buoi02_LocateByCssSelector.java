import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buoi02_LocateByCssSelector {
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
        /*//Cach2: Tim element email va pass theo xpath @name
        WebElement txtEmail = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement txtPass = driver.findElement(By.xpath("//input[@name='pass']"));*/

        /*//Cach1: Tim element email va pass theo CssSelector id
        WebElement txtEmail = driver.findElement(By.cssSelector("input[id='email']"));
        WebElement txtPass = driver.findElement(By.cssSelector("input[id='pass']"));*/
        /*//Cach2: Tim element email va pass theo CssSelector name
        WebElement txtEmail = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement txtPass = driver.findElement(By.cssSelector("input[name='pass']"));*/
        //Cach3: Tim element email va pass theo CssSelector
        WebElement txtEmail = driver.findElement(By.cssSelector("input#email"));
        WebElement txtPass = driver.findElement(By.cssSelector("input#pass"));

        //Nhap du lieu
        txtEmail.sendKeys("abc333@gmail.com");
        txtPass.sendKeys("1234567");

        //Close browser
        //driver.close();

    }
}
