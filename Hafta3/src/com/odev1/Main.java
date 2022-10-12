package com.odev1;

public class Main {
    public static void main(String[] args) {
        
    }
}

class Customer{

    public Customer(){
        System.out.println("müsteri baslatildi");
    }

    public int Id;
    public String City;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }        
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    
}

interface ICreditManager{
    void Calculate();
    void Save();
}

class TeacherCreaditManager extends BaseCreditManager{

    @Override
    public void Calculate() {
        System.out.println("Öğretmen kredisi hesaplandi");
        
    }    
}

class CarCreditManager extends BaseCreditManager{

    @Override
    public void Calculate() {
        System.out.println("Araba kredisi hesaplandi");
    }

}

abstract class BaseCreditManager {

    public abstract void Calculate();
    //Abstract sınıflar ortak operasyonları tutar
    public void Save(){
        System.out.println("Kaydedildi...");
    }
}



class CustomerManager{
    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
    }

    public void Save(){
        System.out.println("Müsteri kaydedildi : ");
    }

    public void Delete(){
        System.out.println("Müsteri Silindi...");
    }

    public void GiveCredit(){
        _creditManager.Calculate();
        System.out.println("Kredi verildi. ");
    }
}
