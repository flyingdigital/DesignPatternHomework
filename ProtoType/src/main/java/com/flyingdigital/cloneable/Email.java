package com.flyingdigital.cloneable;

public class Email implements Cloneable{
    private Attachment attachment;

    public void display(){
        System.out.println("展示Email");
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Object clone(){
        Email copy = null;

        try {
            copy = (Email) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }

        return copy;
    }
}
