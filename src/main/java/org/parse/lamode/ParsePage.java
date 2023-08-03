package org.parse.lamode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;


public class ParsePage {

    public static WebDriver wb = new ChromeDriver();
    private static ScanerPage sp = new ScanerPage();
    public static void ParsingPage(String url) throws InterruptedException{
        wb.get(url);
        int i = 0;
        WebElement name = wb.findElement(By.xpath("//*[@id=\"vue-root\"]/div/main/div/div[2]/div/div[1]/div/div/h1"));
        while(true){
            ++i;
            System.out.println("Страница " + i);
            System.out.println(wb.getCurrentUrl());
            sp.ScanPage(wb.getCurrentUrl(), i, name.getText());
            WebElement navigationBtn;
            try {
                if( i == 1)
                    navigationBtn = wb.findElement(By.xpath("//*[@id=\"catalog-main\"]/div[2]/div[3]/div[1]/div[6]/a"));
                else
                    navigationBtn = wb.findElement(By.xpath("//*[@id=\"catalog-main\"]/div[2]/div[3]/div[1]/div[7]/a"));
                Thread.sleep(500);
                navigationBtn.click();
            }
            catch (NoSuchElementException e){
                break;
            }
        }
    }
}