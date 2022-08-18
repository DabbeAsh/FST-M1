package livePackage;

import org.testng.Assert;

public class AlchemyJobs extends BaseClass{
    String title;
    String actualTitle ="Alchemy Jobs – Job Board Application";
    String actualHeading = "Welcome to Alchemy Jobs";

    public void verifyPageTtitle(){
      String title = driver.getTitle();
        Assert.assertEquals(actualTitle,title);
    }
    public void verifyPageHeading(){
        
    }
}
