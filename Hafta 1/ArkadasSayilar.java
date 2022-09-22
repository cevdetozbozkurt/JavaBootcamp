public class ArkadasSayilar {
    public static void main(String[] args) {
        int sayi_1 = 220;
        int sayi_2 = 284;
        int toplam_1 = 0;
        int toplam_2 = 0;

        for (int i = 1; i < sayi_1; i++) {
            if(sayi_1 % i == 0){
                toplam_1 += i;
            }
        }

        for (int i = 1; i < sayi_2; i++) {
            if(sayi_2 % i == 0){
                toplam_2 += i;
            }
        }

        if(toplam_1 == toplam_2){
            System.out.println("bu sayilar arkadaştır.");
        }else {
            System.out.println("Bu sayilar arkadaş değildir.");
        }
    }
}
