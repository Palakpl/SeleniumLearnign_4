package Dropdown_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Dropdown_Class {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\SoftwareDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");;
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/ul/li[1]/a")).click();
        WebElement Sortby = driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
        Select select = new Select(Sortby);
        select.selectByValue("10");
        WebElement display = driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
        Select select1 = new Select(display);
        select1.selectByValue("6");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        driver.close();


    }
}
