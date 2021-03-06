import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Buoi05_UpdateShippingAddress {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Fluent Wait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(1))
                .withMessage("Time out after 12 seconds")
                .ignoring(NoSuchElementException.class);

        // Vào trang sendo.vn
        driver.get("https://sendo.vn");

        // Tắt popup "Ở nhà là nhất - 10K
        List<WebElement> btnClose1 =
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='modal-content']/button[starts-with(@class,'close')]")));
        if (btnClose1.size()>0) {
            btnClose1.get(0).click();
        }

        // Tắt popup "Bật thông báo để không bỏ lỡ..."
        List<WebElement> btnClose2 =
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[starts-with(@class,'closeBtn')]")));
        if (btnClose2.size()>0){
            btnClose2.get(0).click();
        }

        // Click Đăng nhập
        WebElement btnLogin = driver.findElement(By.xpath("//button[@id='login']"));
        btnLogin.click();

        // Click link "Đã có SendoID"
        WebElement eleHaveSendoId = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Đã có SendoID']")));
        eleHaveSendoId.click();

        // Nhập textbox Email
        WebElement txtEmail = driver.findElement(By.xpath("//input[@name='username']"));
        txtEmail.sendKeys("0372207343");

        // Nhập text Pass
        WebElement txtPass = driver.findElement(By.xpath("//input[@name='password']"));
        txtPass.sendKeys("761311312");

        // Click button Đăng nhập
        WebElement btnLogin2 = driver.findElement(By.xpath("//button[starts-with(@class,'btnLogin')]"));
        btnLogin2.click();

        //Nhấn vào tên user
        WebElement eleMenu = driver.findElement(By.xpath("//button[@id='user_menu']"));
        eleMenu.click();

        //Nhấn vào thông tin tài khoản
        WebElement eleProfile = driver.findElement(By.xpath("//span[contains(text(),'Thông tin tài khoản')]"));
        eleProfile.click();

        //Nhấn vào menu Địa chỉ nhận hàng
        driver.findElement(By.xpath("//a[text()='Địa chỉ nhận hàng']")).click();

        //Nhấn vào icon Chỉnh sửa
        //driver.findElement(By.xpath("//div[starts-with(@class,'addressList')]//div[1]//ul[1]//li[1]//button[1]")).click();
        List<WebElement> btnEdits = driver.findElements(By.xpath("//button[contains(@class,'edit')]"));
        if (btnEdits.size()>0) {
            btnEdits.get(0).click();
        }

        //Cập nhật Họ
        WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        txtFirstName.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        txtFirstName.sendKeys("Test1");

        //Cập nhật Tên
        WebElement txtLastName = driver.findElement(By.xpath(("//input[@name='lastName']")));
        txtLastName.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        txtLastName.sendKeys("ABC");

        //Nhấn button Lưu thông tin
        driver.findElement(By.xpath(("//button[starts-with(@class,'addressSubmit')]"))).click();

        // Đóng trình duyệt
        driver.close();

    }
}
