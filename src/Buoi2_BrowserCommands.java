import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buoi2_BrowserCommands {
    public static void main (String[] args){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //get browser
        driver.get("https://google.com");

        //get Title
        String title = driver.getTitle();
        System.out.println(title);

        //get currentURL
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        //get PageSource
        String pagesource = driver.getPageSource();
        //System.out.println(pagesource);

        //to url
        driver.navigate().to("https://facebook.com");
        driver.navigate().to("https://abcnews.go.com");

        //back to previous url
        driver.navigate().back();

        //Refresh browser
        //driver.navigate().refresh();

        //Forward
        driver.navigate().forward();

        //maximize
        driver.manage().window().maximize();

        //Close browser
        //driver.close();

        //Close all browser
        //driver.quit();

    }
}
