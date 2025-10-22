public class hafta1 {
    public static void main(String[] args) {
        
        /*bir tam sayının tek mi çift mi olduğunu bulan program */
        int sayi = 7;
        if (sayi % 2 == 0) {
            System.out.println("Sayı çifttir.");
        } else {
            System.out.println("Sayı tektir.");                 
        }

        /*Bir öğrencinin dönem sonu yüzlük notuna göre harf notunu bulan program*/
        int not = 85;
        if(not >00 && not <= 100){
            if (not >= 90) {
                System.out.println("Harf Notu: A");
            } else if (not >= 80) {
                System.out.println("Harf Notu: B");
            } else if (not >= 70) {
                System.out.println("Harf Notu: C");
            } else if (not >= 60) {
                System.out.println("Harf Notu: D");
            } else if (not >= 50) {
                System.out.println("Harf Notu: E");
            } else {
                System.out.println("Harf Notu: F");
            }
        } else {
            System.out.println("Geçersiz not girdiniz.");
        }
    }
}