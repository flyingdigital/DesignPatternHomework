package com.flyingdigital;

import com.flyingdigital.ConcreteTV.Haier;
import com.flyingdigital.ConcreteTV.Hisense;
import com.flyingdigital.ConcreteTVFactory.HaierFactory;
import com.flyingdigital.TV.AbstractTV;
import com.flyingdigital.TVFactory.AbstractTVFactory;
import com.flyingdigital.XMLUtil.XMLUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        AbstractTV tv;
        AbstractTVFactory abstractTVFactory = new HaierFactory();

        tv = abstractTVFactory.productTV();
        tv.play();
    }
//    public static void main(String[] args){
//        XMLUtil xmlUtil = new XMLUtil("config.xml");
//        Haier haier = (Haier) xmlUtil.getBean("haier");
//
//        haier.play();
//
//    }
}
