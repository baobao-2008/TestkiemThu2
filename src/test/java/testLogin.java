import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLogin {
static WebDriver driver;
        @BeforeClass
    public static void setUp(){
            driver= new ChromeDriver();
            driver.manage().window().maximize();
        }
        @Test
    public void TestLogin() throws InterruptedException{
            driver.get("https://practicetestautomation.com/practice-test-login/");
            Thread.sleep(2000);
            driver.findElement(By.id("username")).sendKeys("student");
            driver.findElement(By.id("password")).sendKeys("Password123");
            driver.findElement(By.id("submit")).click();
            Thread.sleep(2000);
            Assert.assertEquals("https://practicetestautomation.com/logged-in-successfully/",driver.getCurrentUrl());
            System.out.println("Đăng nhập thành công");
        }
        @AfterClass
    public static void tearDown(){
            driver.quit();
        }
}
