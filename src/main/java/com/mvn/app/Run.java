package com.mvn.app;

import java.util.concurrent.TimeUnit;

public class Run implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(12000);
            System.out.println("Error after 12s display");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
