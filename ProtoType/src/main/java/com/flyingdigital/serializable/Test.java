package com.flyingdigital.serializable;

public class Test {
    public static void main(String[] args) {
        Email email,copy;

        email = new Email();

        copy = (Email) email.deepClone();
        System.out.println("123");
        System.out.println(email==copy);

        System.out.println(email.getAttachment()==copy.getAttachment());
    }
}
