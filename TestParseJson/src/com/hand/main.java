package com.hand;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;

public class main {
    public static void main(String[] args){
        try{
            //json解析器
            JsonParser parser = new JsonParser();
            //读取json文件，获取json对象
            JsonObject object = (JsonObject)parser.parse(new FileReader("src/testFile.json"));
            String car = object.get("car").getAsString();
            System.out.print("car");
            JsonArray array = object.get("msg").getAsJsonArray();
            for (int i = 0;i<array.size();i++){
                JsonObject obj = array.get(i).getAsJsonObject();
                Integer id = obj.get("id").getAsInt();
                String color = obj.get("color").getAsString();
                Integer price = obj.get("price").getAsInt();
                System.out.println("id="+id);
                System.out.println("color="+color);
                System.out.println("price="+price);
            }
            Boolean a = object.get("is ready").getAsBoolean();
            System.out.println(a);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
