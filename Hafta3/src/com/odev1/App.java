package com.odev1;

public class App{
    public static void main(String[] args) throws Exception {

        Customer customer = new Customer();
        customer.Id = 1;
        customer.City = "Ankara";

        Company company = new Company();
        company.TaxNumber = "10000";

        Person person = new Person();
        person.FirsName = "Ahmet";
        person.LastName = "Ak";
        person.NationalIdentity = "Tr";
        


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

class Person extends Customer{
    
    public String FirsName;
    public String LastName;
    public String NationalIdentity;

    public String getNationalIdentity() {
        return NationalIdentity;
    }
    public void setNationalIdentity(String nationalIdentity) {
        NationalIdentity = nationalIdentity;
    }
    public String getFirsName() {
        return FirsName;
    }
    public void setFirsName(String firsName) {
        FirsName = firsName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }

}


class Company extends Customer{

    public String TaxNumber;
    public String CompanyName;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        TaxNumber = taxNumber;
    }

}
