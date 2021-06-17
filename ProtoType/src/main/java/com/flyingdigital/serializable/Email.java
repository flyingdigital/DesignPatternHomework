package com.flyingdigital.serializable;

import java.io.*;

public class Email implements Serializable {
    private Attachment attachment=null;

    public Email(){
        attachment = new Attachment();
    }
    public void display(){
        System.out.println("展示Email");
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Object deepClone(){

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return(ois.readObject());
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
