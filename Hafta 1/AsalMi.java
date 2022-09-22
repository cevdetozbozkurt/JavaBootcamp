public class AsalMi {
    public static void main(String[] args) {
        //bug
        int number = 1;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;






        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(number == 1){
            isPrime = false;
        }

        if(number < 1){
            System.out.println("Geçersiz Sayı Girdiniz.");
        }

        if(isPrime){
            System.out.println("Sayı Asaldır.");
        }else{
            System.out.println("Sayı Asal Değil...");
        }
    }
}
