package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBarclays {
    public static void main(String[] args) {
        String baseurl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        String title = driver.getTitle();
        System.out.println(title);

        boolean verifyTitle = title.equals("Personal banking | Barclays");
        boolean verityTitleContain = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verityTitleContain);
        System.out.println(title.length());

    }
}
