import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Buoi2_LaunchIE {
    public static void main (String[] args){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.ie.driver", projectPath + "/drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
    }
}
