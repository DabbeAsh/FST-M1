package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String arg[]){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title is : " + pageTitle);
        String text = driver.findElement(By.id("about-link")).getText();
        driver.findElement(By.className("huge"));
        System.out.println("Text is : "+ text);
        WebElement webText = driver.findElement(By.id("about-link"));
        System.out.println("Text is : "+ text);
        driver.close();
    }


}
