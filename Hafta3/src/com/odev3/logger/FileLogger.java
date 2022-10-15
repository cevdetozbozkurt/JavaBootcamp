package com.odev3.logger;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veri dosyaya loglandi");
    }
}
