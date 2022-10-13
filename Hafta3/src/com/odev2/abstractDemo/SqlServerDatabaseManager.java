package com.odev2.abstractDemo;

public class SqlServerDatabaseManager  extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi : SQl Server ...");
    }
}
