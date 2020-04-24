import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Buoi04_Waits_FluentWait_sendo {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Time out after 10 seconds")
                .ignoring(NoSuchElementException.class);

        // Vào trang sendo.vn
        driver.get("https://sendo.vn");

        // Chờ 12s
        //Thread.sleep(12000);

        // Tắt popup "Ở nhà là nhất - 10K
        /*WebElement btnClose1 = driver.findElement(By.xpath("//div[@class='modal-content']/button[starts-with(@class,'close')]"));
        btnClose1.click();*/
        List<WebElement> btnClose1 = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='modal-content']/button[starts-with(@class,'close')]")));
        if (btnClose1.size() > 0) {
            btnClose1.get(0).click();
        }

        // Tắt popup "Bật thông báo để không bỏ lỡ..."
        /*WebElement btnClose2 = driver.findElement(By.xpath("//button[starts-with(@class,'closeBtn')]"));
        btnClose2.click();*/
        List<WebElement> btnClose2 = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[starts-with(@class,'closeBtn')]")));
        if (btnClose2.size() > 0) {
            btnClose2.get(0).click();
        }

        // Click Đăng nhập
        WebElement btnLogin = driver.findElement(By.xpath("//button[@id='login']"));
        btnLogin.click();

        // Chờ 1s
        Thread.sleep(1000);

        // Click link "Đã có SendoID"
        WebElement eleHaveSendoId = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Đã có SendoID']")));
        eleHaveSendoId.click();

        // Nhập textbox Email
        WebElement txtEmail = driver.findElement(By.xpath("//input[@name='username']"));
        txtEmail.sendKeys("testergm@gmail.com");

        // Nhập text Pass
        WebElement txtPass = driver.findElement(By.xpath("//input[@name='password']"));
        txtPass.sendKeys("123456");

        // Click button Đăng nhập
        WebElement btnLogin2 = driver.findElement(By.xpath("//button[starts-with(@class,'btnLogin')]"));
        btnLogin2.click();

        // Chờ 1s
        //Thread.sleep(1000);

        // Get error text
        WebElement eleErrorText = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[starts-with(@class,'error')]")));
        String errorMessage = eleErrorText.getText();
        System.out.println(errorMessage);

        // Đóng trình duyệt
        driver.close();
    }
}

