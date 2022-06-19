import java.util.Scanner;  // Girdileri almak için Scanner ı çekmemiz gerek

public class Manav {
    public static void main(String[] args) {

        double armut,elma,dmts,muz,ptlcn;     // Kullanıcın gireceği meyve miktarları için atayacağımız değişkenler
        double kgarmut = 2.14,kgelma = 3.67,kgdmts = 1.11,kgmuz = 0.95,kgptlcn = 5.0;    //Ürünlerin kg fiyatları
        Scanner input = new Scanner(System.in);    //input u çağırdığımız şeyleri atamada kullanacaz

        System.out.println("Ne kadar armut aldiniz? ");   //Kullanıcıya soruyu yazdırmak için
        armut = input.nextDouble();                     // armut a Scannerdaki input üzerinden değer atıyoruz

        System.out.println("Ne kadar elma aldiniz? ");
        elma = input.nextDouble();

        System.out.println("Ne kadar domates aldiniz? ");
        dmts = input.nextDouble();

        System.out.println("Ne kadar muz aldiniz? ");
        muz = input.nextDouble();

        System.out.println("Ne kadar patlıcan aldiniz? ");
        ptlcn = input.nextDouble();

       double fiyat = (armut * kgarmut) + (elma * kgelma) + (dmts * kgdmts) + (muz * kgmuz) + (ptlcn * kgptlcn);

       System.out.println("Odenecek tutar : " + fiyat +"\nLutfen odemeyi kasaya yapiniz.");


    }
}
