import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Buoi05_UpdateInfo {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Time out after 10 seconds")
                .ignoring(NoSuchElementException.class);

        //Get page
        driver.get("https://profile.sendo.vn/");

        // Click link "Đã có Sendo ID"
        WebElement eleHaveSendoId = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Đã có Sendo ID']")));
        eleHaveSendoId.click();

        // Nhập textbox Email
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("0372207343");

        // Nhập text Pass
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("761311312");

        // Click button Đăng nhập
        WebElement btnLogin1 = driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-primary')]"));
        btnLogin1.click();

        //Sua ten
        driver.findElement(By.xpath("//input[@name='lastName']")).clear();
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Minhhien");

        //Sua gioi tinh
        boolean state = driver.findElement(By.xpath("//label[text()='Nam']/preceding-sibling::input")).isSelected();
        System.out.println(state);
        driver.findElement(By.xpath("//label[text()='Nam']")).click();

        // Đóng trình duyệt
        driver.close();
    }
}
