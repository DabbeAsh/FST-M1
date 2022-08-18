package livePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    WebDriver driver;
    @BeforeClass
    public void openBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }
    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
