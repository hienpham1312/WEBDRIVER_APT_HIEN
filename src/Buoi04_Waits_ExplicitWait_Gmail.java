import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buoi04_Waits_ExplicitWait_Gmail {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.get("https://gmail.com");

        driver.findElement(By.id("identifierId")).sendKeys("phamhien9212@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        //Thread.sleep(10000);
        //driver.findElement(By.name("password")).sendKeys("12345678");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("12345678Ac");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("12345678Ac");
        driver.findElement(By.id("passwordNext")).click();

        //String errorMessage = driver.findElement(By.xpath("//*[@id='view_container']//div[2]/span"));
        String errorMessage = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='view_container']//div[2]/span"))).getText();
        System.out.println(errorMessage);

    }
}
