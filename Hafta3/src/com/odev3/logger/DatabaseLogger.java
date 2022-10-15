package com.odev3.logger;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veri Database e loglandi");
    }
}
