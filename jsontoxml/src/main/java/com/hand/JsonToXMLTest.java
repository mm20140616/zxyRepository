package com.hand;

import com.alibaba.fastjson.JSON;
import org.json.JSONObject;
import org.json.XML;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName jsontoxml
 * @ClassName JsonToXMLTest
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/8 13:33
 * @Version 1.0
 **/
public class JsonToXMLTest {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        //json串
        String jsonStr = JSON.toJSONString(map);
        System.out.println("source json : " + jsonStr);

        //json转xml
        String xml = jsonToXML(jsonStr);
        System.out.println("xml  :  " + xml);
        //xml转json
        String targetJson = xmlToJson(xml);
        System.out.println("target json : " + targetJson);
    }
    /**
     * 功能描述 json to xml
     * @Author zhaoxiaoyu
     * @Date 2018/8/8 13:33
     * @Param
     * @return
     **/
    public static String jsonToXML(String json) {
        JSONObject jsonObject = new JSONObject(json);
        return "<xml>" + XML.toString(jsonObject) + "</xml>";
    }
    public static String xmlToJson(String xml) {
        JSONObject xmlJSONObj = XML.toJSONObject(xml.replace("<xml>", "").replace("</xml>", ""));
        return xmlJSONObj.toString();
    }

}
