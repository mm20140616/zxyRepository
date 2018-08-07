package com.hand;

import java.io.File;

public class FileReadTest {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\test1");
        showDir(1,file);
    }

    static void showDir(int tab,File file){
        for (int i=0;i<=tab;i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            int length = files.length;
            for (int j=0;j<length;j++) {
                showDir(tab+2,files[j]);
            }

        }
    }
}
