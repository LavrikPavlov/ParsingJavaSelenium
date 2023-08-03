package org.parse.lamode;

public class ChangePage {

    public static void main(String[] args) throws InterruptedException {
//        wb.get("https://www.lamoda.ru/c/4153/default-women/?sitelink=breadcrumbs");
//        for(int i = 1; i <= 6; i++) {
//            WebElement navCategory = wb.findElement(By.xpath("//*[@id=\"catalog-main\"]/div[1]/div/div[1]/div[" + i + "]/div/div[1]/div/div/a"));
//            navCategory.click();
//            ParsePage.ParsingPage(wb.getCurrentUrl());
//        }

        ParsePage.ParsingPage("https://www.lamoda.ru/c/4308/default-krasotawoman/");
        ParsePage.ParsingPage("https://www.lamoda.ru/c/4288/beauty_accs_ns-menbeauty/");
        ParsePage.ParsingPage("https://www.lamoda.ru/c/6815/default-uhod_za_rebenkom/");
    }
}


