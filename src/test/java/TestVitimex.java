import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVitimex {
  static WebDriver driver;
@BeforeClass
    public static void setUp(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}
@Test
public void test() throws InterruptedException {
    driver.get("https://vitimex.com.vn/products/akn2031");
    Thread.sleep(3000);
    driver.findElement(By.className("menu-link")).click();
    Thread.sleep(3000);
}
@Test
    public void testgioHang() throws InterruptedException{
    driver.get("https://vitimex.com.vn/products/akn2031");
    Thread.sleep(3000);
    driver.findElement(By.className("aspect-ratio sd")).click();
    driver.findElement(By.className("btn-vtm add-cart")).click();

}
@Test
    public void testTimKiem() throws InterruptedException{
    driver.get("https://vitimex.com.vn/");
    Thread.sleep(3000);
    driver.findElement(By.className("h-search")).click();
    driver.findElement(By.id("inputSearchAuto")).sendKeys("Quần");
    driver.findElement(By.id("search-header-btn")).click();
    Thread.sleep(3000);
    }

}
