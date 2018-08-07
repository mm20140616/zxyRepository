package com.hand;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CreateJson {
    public static void main(String[] args){
        JsonObject object = new JsonObject();
        object.addProperty("car","bmw");
        JsonArray array = new JsonArray();
        JsonObject color1 = new JsonObject();
        color1.addProperty("id",1);
        color1.addProperty("name","bmw1");
        color1.addProperty("color","blue");
        color1.addProperty("price",100);
        array.add(color1);

        JsonObject color2 = new JsonObject();
        color2.addProperty("id",2);
        color2.addProperty("name","bmw2");
        color2.addProperty("color","yellow");
        color2.addProperty("price",200);
        array.add(color2);

        JsonObject color3 = new JsonObject();
        color3.addProperty("id",3);
        color3.addProperty("name","bmw2");
        color3.addProperty("color","red");
        color3.addProperty("price",300);
        array.add(color3);

        object.add("color",array);

        object.addProperty("ready",true);
        System.out.println(object);
    }
}
