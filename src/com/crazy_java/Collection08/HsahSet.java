package com.crazy_java.Collection08;

import java.util.HashSet;
import java.util.Set;

public class HsahSet {
    public static void main(String[] args) {
       /* HashSet[]  hs= new HashSet[];
        hs.add(new R(5));
        hs.add(new R(5));
        hs.add(new R(5));
        hs.add(new R(5));
        int it=hs.iterator;
        var first=(R)it.next();*/

    }
}
class R{
    int count;
    public R(int count){
        this.count=count;
    }
    public String toString(){
        return "R[count:"+count+"]";
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj!=null&&obj.getClass()==R.class){
            Object r=(R)obj;
            return this.count==count;
        }
        return false;
    }
    public int hashCode(){
        return this.count;
    }
}
