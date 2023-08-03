package org.parse.lamode;

import org.openqa.selenium.*;
import static org.parse.lamode.ParsePage.wb;

public class ParseItem {

    public static void ScanItem() throws InterruptedException {
        WebElement closeBtn = ParsePage.wb.findElement(By.xpath("//*[@id=\"vue-root\"]/div/div[5]/div[1]/div/div[2]"));
        closeBtn.click();
        for(int j = 1; j <= 61; ++j){
            System.out.print(j + " ");
            WebElement itemBtn = wb.findElement(By.xpath("//*[@id=\"catalog-main\"]/div[2]/div[2]/div/div["+ j +"]"));
            try {
                if( j != 13)
                    itemBtn.click();
                else
                    continue;
            }catch (StaleElementReferenceException | ElementClickInterceptedException e){
                System.out.println("{" + j + "}");
                continue;
            }
            Thread.sleep(500);
            wb.navigate().back();
        }
    }
}
