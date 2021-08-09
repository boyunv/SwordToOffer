package com.crazy_java.Collection08;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapMethods {
    public static void main(String[] args) {
        HashMap<String,Integer> scores=new LinkedHashMap<>();
        scores.put("泊云妆模作样",100);
        scores.put("泊云考不上研",101);
        scores.put("泊云放弃考研",102);
        scores.put("泊云逃避考研",103);
        scores.forEach((key,value)-> System.out.println(key+"-->"+value));
    }
}
