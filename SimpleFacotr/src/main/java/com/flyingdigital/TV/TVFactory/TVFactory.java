package com.flyingdigital.TV.TVFactory;

import com.flyingdigital.TV.AbstractTV.AbstractTV;
import com.flyingdigital.TV.ConcreteTV.Haier;
import com.flyingdigital.TV.ConcreteTV.Hisense;

public class TVFactory {
    public static AbstractTV getTV(String arg){
        if(arg.equalsIgnoreCase("haier")){
            return new Haier();
        }else if(arg.equalsIgnoreCase("hisense")){
            return new Hisense();
        }else{
            return null;
        }
    }
}
