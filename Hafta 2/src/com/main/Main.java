package com.main;

public class Main {
    public static void main(String[] args) {
        //Metotlar için olan kısım
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(3,4);
        System.out.println(sonuc);

        //Classlar için olan kısım

        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        customer.age = 23;
        customer.id = 1;
        customer.firsName = "Eren";
        customer.lastName = "Özbozkurt";
        customer.email = "info@kodlama.io";
        employee.age = 23;
        employee.id = 1;
        employee.firsName = "Eren";
        employee.lastName = "Özbozkurt";
        employee.salary = 5500;
        /*--------------------------------------*/
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();
        /*-------------------------------------*/
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(ogretmenKrediManager);
        //veya baseKrediManager extends edildiği için diğer türlerdeki krediManagerları da kullanabiliriz parametre olarak
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());


    }

}
