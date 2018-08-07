package com.hand;

import java.io.*;

public class FileCreate {
    public static void main(String[] args) throws IOException {
//        String path = "E:\\test1\\test2\\test3\\test4\\";
//        File file = new File(path);
//        boolean status = file.mkdirs();
//        System.out.println(status);
        File file = new File("E:\\test1\\test1.txt");
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try{
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            bw.write("admin1");
        }finally {
            bw.flush();
            bw.close();
            osw.close();
            fos.close();
        }
    }
}
