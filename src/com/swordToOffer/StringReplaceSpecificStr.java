package com.swordToOffer;

public class StringReplaceSpecificStr {
    public String replaceStr(String str){
        if(null==str||""==str){
            return str;
        }
        String  temp;
        temp=str.replaceAll(" ","菲菲");

        return temp;
    }

    public static void main(String[] args) {
        String  str="just do it !Hello Ko!!";
        StringReplaceSpecificStr a=new StringReplaceSpecificStr();
        str=a.replaceStr(str);

        System.out.println(str);
    }
}
