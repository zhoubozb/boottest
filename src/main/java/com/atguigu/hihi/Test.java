package com.atguigu.shshu;

import java.io.InputStream;
import java.util.Properties;

public class Test {
    private static Properties pro ;
    public static void  main(String [] args){
        Test.readprop();
        String port = pro.getProperty("servmmmmmmmmmer.port");
        System.out.println("qmmmmmmmmmmmq"+port);
    }

    public static void readprop(){
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("dev/application-dev.properties");

        try {
            pro = new Properties();
            pro.load(inputStream);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
