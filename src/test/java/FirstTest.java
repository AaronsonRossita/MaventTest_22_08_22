import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver","res\\chromedriver.exe");
    }

    @Test
    public static void testOne(){
        WebDriver driver = new ChromeDriver();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }

    @Test
    public static void testTwo(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }

}
