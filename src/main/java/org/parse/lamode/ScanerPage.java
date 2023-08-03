package org.parse.lamode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;



public class ScanerPage {
    private static StringBuilder sb = new StringBuilder();

    public void ScanPage(String url, int i, String nameCategory) {
            try {
                Document doc = Jsoup.connect(url).get();
                Elements productCards = doc.select("div.x-product-card__card");
                sb.append("Страница: ").append((i+1)).append("\n");
                for (Element card : productCards) {
                    Element data = card.selectFirst("div.x-product-card-description");
                    String brandname = data.selectFirst("div.x-product-card-description__brand-name").text();
                    String name = data.selectFirst("div.x-product-card-description__product-name").text();
                    sb.append("Наименование: ").append(name).append("\n");
                    sb.append("Бренд: ").append(brandname).append("\n");
                    Element priceSingle = data.selectFirst("span.x-product-card-description__price-single");
                    if (priceSingle != null) {
                        String priceSingleText = priceSingle.text();
                        sb.append("Цена: ").append(priceSingleText).append(" руб.\n");
                    }
                    Element priceOld = data.selectFirst("span.x-product-card-description__price-old");
                    Element priceNew = data.selectFirst("span.x-product-card-description__price-new");
                    if (priceOld != null && priceNew != null) {
                        String priceOldText = priceOld.text();
                        sb.append("Старая цена: ").append(priceOldText).append(" руб.\n");
                        String priceNewText = priceNew.text();
                        sb.append("Новая цена: ").append(priceNewText).append(" руб.\n");
                    }
                    sb.append("----------------------------\n");
                    writeFile(sb.toString(), i, nameCategory);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private static void writeFile(String text, int i, String name) {
        name = name + ".txt";
        File file = new File(name);
        try {
            if (!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            if(i == 0)
                pw.print("");
            pw.print(text);
            pw.close();
        } catch (IOException mess) {
            mess.printStackTrace();
        };
    }

}
