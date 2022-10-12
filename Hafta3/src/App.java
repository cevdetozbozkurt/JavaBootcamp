public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    class Customer{

        public Customer(){
            System.out.println("müsteri baslatildi");
        }

        public int Id;
        public String FirsName;
        public String LastName;
        public String City;
        public int getId() {
            return Id;
        }
        public void setId(int id) {
            Id = id;
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
        
        public String getCity() {
            return City;
        }
        public void setCity(String city) {
            City = city;
        }
        
    }

    class Person extends Customer{
        
        public String NationalIdentity;

        public String getNationalIdentity() {
            return NationalIdentity;
        }
        public void setNationalIdentity(String nationalIdentity) {
            NationalIdentity = nationalIdentity;
        }

    }


    class Company extends Customer{
        public String TaxNumber;

        public String getTaxNumber() {
            return TaxNumber;
        }

        public void setTaxNumber(String taxNumber) {
            TaxNumber = taxNumber;
        }

    }



}
