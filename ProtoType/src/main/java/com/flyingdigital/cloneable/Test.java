package com.flyingdigital.cloneable;

public class Test {
    public static void main(String[] args) {
        Email email,copy;

        email = new Email();

        copy = (Email) email.clone();

        System.out.println(email==copy);

        System.out.println(email.getAttachment()==copy.getAttachment());
    }
}
