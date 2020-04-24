import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Buoi04_Waits_ImplicitWait_Gmail {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://gmail.com");

        driver.findElement(By.id("identifierId")).sendKeys("phamhien9212@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        //Thread.sleep(10000);
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.id("passwordNext")).click();
    }
}
