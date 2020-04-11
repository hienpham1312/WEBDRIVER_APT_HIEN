import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buoi03_LocateByClassName {
    public static void main (String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get browser
        driver.get("https://facebook.com");

        //Tim element theo classname
        WebElement eleWellcome = driver.findElement(By.className("_5iyx"));

        //Get text ele
        String textvalue = eleWellcome.getText();

        //in kq ra console
        System.out.println(textvalue);


        /*WebElement eleRegister = driver.findElement(By.className("_52lr fsm fwn fcg"));
        String valueRegister = eleRegister.getText();
        System.out.println(valueRegister);*/


        //Close browser
        driver.close();

    }
}
