package com.flyingdigital.TV;

import com.flyingdigital.TV.AbstractTV.AbstractTV;
import com.flyingdigital.TV.TVFactory.TVFactory;

public class Test {
    public static void main(String[] args) {
        AbstractTV tv = TVFactory.getTV("hisense");
        if(tv==null) {
            System.out.println("暂不支持该品牌");
        }else{
            tv.play();
        }
    }
}
