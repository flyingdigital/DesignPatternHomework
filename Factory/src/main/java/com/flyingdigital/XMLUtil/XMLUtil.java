package com.flyingdigital.XMLUtil;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XMLUtil {

    List<MyBean> myBeanList = null;
    Map<String,Object> map = null;


    public XMLUtil(){}
    public XMLUtil(String file){
        map = new HashMap<>();
        this.parse(file);
        this.insertInstance();

    }
    public Object getBean(String id){
        return map.get(id);
    }
    public void parse(String file){
        SAXReader reader = new SAXReader();
        URL url = this.getClass().getClassLoader().getResource(file);
        System.out.println(url);
        try {
            Document document = reader.read(url);
            System.out.println(document.getRootElement().elements());
            XPath xPath = document.createXPath("beans/bean");

            List<Element> elementList = xPath.selectNodes(document);

            if(elementList!=null && elementList.size()>0){
                this.myBeanList = new ArrayList<>();
                for(Element element: elementList) {
                    String id = element.attributeValue("id");
                    String clazz = element.attributeValue("class");

                    MyBean mb = new MyBean(id,clazz);
                    myBeanList.add(mb);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void insertInstance() {
        if(myBeanList!=null && myBeanList.size()>0){
            for(MyBean e: myBeanList){
                String id = e.getId();
                try {
                    Object obj = Class.forName(e.getClazz()).newInstance();
                    map.put(id, obj);
                }catch (Exception a){
                    a.printStackTrace();
                }
            }
        }
    }
}

