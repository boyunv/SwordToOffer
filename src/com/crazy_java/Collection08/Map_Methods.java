package com.crazy_java.Collection08;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods {
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<String, Integer>();
        //put key-value对
        map.put("泊云好帅",100);
        map.put("泊云好丑",10);
        map.put("泊云好堕落",101);
        map.put("泊云好妆模作样",103);
        //返回原来的数据,但被覆盖value会更新但不会输出
        System.out.println( map.put("泊云好丑",99));
        System.out.println("-------------------------------------");
        System.out.println(map);
        System.out.println("-------------------------------------");
        //judge contains the key?
        System.out.println(map.containsKey("泊云好丑"));
        System.out.println("---------------------------------------");
        //judge contains the value?
        System.out.println(map.containsValue(99));
        //get collection of all map of key
        for (String s : map.keySet()) {
            //by get(key) to take the value of the key
            System.out.println(map.get(s));
        }
        System.out.println("primitive size=="+map.size());
        System.out.println( map.remove("泊云好帅",100));
        //output size
        System.out.println("size=="+map.size());
        //oldval stand by primitive value,if value=null,oldval==param
       map.merge("泊云好堕落",44,(oldVal,param)->(Integer)oldVal+(Integer)param);
        System.out.println(map.get("泊云好堕落"));

    }

}
