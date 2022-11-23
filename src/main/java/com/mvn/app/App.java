package com.mvn.app;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class App {
    final static Logger logger = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) throws InterruptedException, IOException {
        String url = "http://dantri.com.vn";
        Document document = (Document) Jsoup.connect(url).get();
//                System.out.println("The title of the page: " + document.title());
//                System.out.println("\nThe text of the page's body: ");
        try {
            Date date = new Date();//ngay hien tai
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String strDate = formatter.format(date);//tenFile
            strDate = strDate.replaceAll("/", "");
            FileWriter fw = new FileWriter(strDate + ".txt");
            fw.write(document.body().text());//ghi vao file
            fw.close();
            System.out.println("Coppy to file successfull");
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
