package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFour {
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        Thread.sleep(50000);
        driver.manage().window().maximize();

    }
    @Test
    public void getTitleFromPage() throws InterruptedException {

    driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']")).sendKeys("SQL");
    Thread.sleep(8000);
    Select select2=new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']")));
    select2.selectByValue("junit");
//    Select select3=new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']")));
//    select3.selectByValue("JQuery");
    driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']")).sendKeys("JQuery");

    driver.findElement(By.xpath("//input[@value='option-1']")).click();
    driver.findElement(By.xpath("//input[@value='option-4']")).click();
    driver.findElement(By.xpath("//input[@value='option-3']")).click(); //to remove
    driver.findElement(By.xpath("//input[@value='purple']")).click();

    }
}
