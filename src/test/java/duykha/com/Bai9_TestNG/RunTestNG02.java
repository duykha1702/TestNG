package duykha.com.Bai9_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RunTestNG02 {
    WebDriver driver;
    @BeforeMethod
    public void createDriver() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
    @Test
    public void testAnhTesterBlog() throws InterruptedException {
        driver.get("https://anhtester.com/");
        driver.findElement(By.xpath("//a[normalize-space()='blog']")).click();

        Thread.sleep(2000);
    }
    @Test
    public void testGoogleSearch() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("anhtester", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Selenium Java']")).click();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
