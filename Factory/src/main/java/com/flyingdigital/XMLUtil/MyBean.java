package com.flyingdigital.XMLUtil;

public class MyBean {
    String id;
    String clazz;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public MyBean(String id, String clazz) {
        this.id = id;
        this.clazz = clazz;
    }
}
