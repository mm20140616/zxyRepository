package com.hand.test;

import java.util.*;

public class MainTest2 {

    public static void main(String[] args) {
        int k = 50;
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<k;i++) {
            Random rand = new Random();
            int randomNum = rand.nextInt(100);
            list.add(randomNum);
        }
        System.out.println("随机生成50个小于100的数,分别为："+list);

        Map<Integer,Set<Integer>> map = new HashMap<>();
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();
        Set<Integer> list3 = new HashSet<>();
        Set<Integer> list4 = new HashSet<>();
        Set<Integer> list5 = new HashSet<>();
        Set<Integer> list6 = new HashSet<>();
        Set<Integer> list7 = new HashSet<>();
        Set<Integer> list8 = new HashSet<>();
        Set<Integer> list9 = new HashSet<>();
        Set<Integer> list10 = new HashSet<>();
        for (int j=0;j<list.size();j++) {
            for (int listElement:list) {
                int key = listElement/10;
                if (key == 0) {
                    list1.add(listElement);
                    map.put(key,list1);
                }
                if (key == 1) {
                    list2.add(listElement);
                    map.put(key,list2);
                }
                if (key == 2) {
                    list3.add(listElement);
                    map.put(key,list3);
                }
                if (key == 3) {
                    list4.add(listElement);
                    map.put(key,list4);
                }
                if (key == 4) {
                    list5.add(listElement);
                    map.put(key,list5);
                }
                if (key == 5) {
                    list6.add(listElement);
                    map.put(key,list6);
                }
                if (key == 6) {
                    list7.add(listElement);
                    map.put(key,list7);
                }
                if (key == 7) {
                    list8.add(listElement);
                    map.put(key,list8);
                }
                if (key == 8) {
                    list9.add(listElement);
                    map.put(key,list9);
                }
                if (key == 9) {
                    list10.add(listElement);
                    map.put(key,list10);
                }

            }
        }
        for (Map.Entry<Integer,Set<Integer>> entry : map.entrySet()) {
            System.out.println("Map中的数据为"+entry.getKey()+"=>"+entry.getValue());
        }
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        System.out.println("排序后的value值：");
        while (it.hasNext()) {
            Integer key = it.next();
            Set<Integer> val = map.get(key);
            List<Integer> sort = new ArrayList<>(val);
            Collections.sort(sort);
            System.out.println(key+""+sort);
        }
    }
}
