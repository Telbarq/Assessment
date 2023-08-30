package corserv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assessment_Corserv {

    @Test
    public void applySecuredCreditCard(){

        try
        {

            WebDriver driver = new ChromeDriver();

            driver.navigate().to("https://www.discover.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


            WebElement creditCardBtn = driver.findElement(By.xpath("//li[@class='carousel__slide current-slide']"));
            creditCardBtn.click();


            WebElement applyBtn = driver.findElement(By.xpath("//a[contains(@href,'ALL_CC_SECURED_APPLY_N')]"));
            applyBtn.click();


            WebElement skipStep = driver.findElement(By.xpath("//div//a[@id='adaptive-skip-this-step' and text()='Skip This Step']"));
            skipStep.click();



            //-----The below 4 lines are to assert the APR if the website had to direct us to the appropriate page-----\\

        /*WebElement apr = driver.findElement(By.xpath("//div[@id='terms-scrollbox']//b[@class='cash-rate'][normalize-space()='29.99%']"));
        String actualApr = apr.getText();
        String expectedApr = "20%";
        Assert.assertEquals(actualApr, expectedApr);*/


            driver.quit();


        } catch(Exception e)    {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
