package com.codingdestination;

public class MainJava {
    public static String shout(String message) {
        return message == null ? "" : message.toUpperCase() + "!";
    }
}