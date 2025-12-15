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
@Test
    public void testTimKiemMayBay() throws InterruptedException{
    driver.get("https://www.bambooairways.com/vn/vi");
    Thread.sleep(3000);
    driver.findElement(By.id("cookie-popup-agree")).click();
    driver.findElement(By.id("oneWayRadio")).click();
    driver.findElement(By.id("departDate")).click();
    driver.findElement(By.id("departDate")).sendKeys("20/12/2025");
    driver.findElement(By.id("passenger")).click();
    driver.findElement(By.id("plusAdult")).click();
    driver.findElement(By.cssSelector("input[type='submit'][value='Tìm chuyến bay']")).click();
    Thread.sleep(3000);
    }
}
