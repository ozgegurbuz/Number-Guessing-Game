package sayiTahmin;
import java.util.Scanner;
import java.util.Random;
/*
 * @author ÖZGE
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Sayı tahmin oyununa hoşgeldiniz");
        System.out.println("Lütfen 1-100 arasında bir sayı giriniz..");
    //Sayaç değişkenimiz tahminimizi kaç denemede bulduğumuzu hesaplar   
        int sayac=0;
    //Kullanıcıdan sayı alınır.
        int tahmin=input.nextInt();
        sayac++;
    //Rastgele bir sayı tutarız.
        int sayi=random.nextInt(101);
        while(tahmin!=sayi){
    //geçersiz sayı girişi için tekrar sayı istenir.
            if(tahmin<0 || tahmin>100){
                System.out.println("1-100 arasında bir sayı giriniz..");
                tahmin=input.nextInt();
                sayac++;
            }
            else if(tahmin<sayi){
                System.out.println("daha büyük bir sayı giriniz");
                tahmin=input.nextInt();
                sayac++;
            }
            else{
                System.out.println("daha küçük bir sayı giriniz");
                tahmin=input.nextInt();
                sayac++;
            }
        }
    //While döngüsünden çıktığına göre tahminimiz sayımıza eşit.TEBRİKLER!!
    System.out.println("TEBRİKLER DOĞRU TAHMİN !!!");   
    System.out.println(sayac+". denemede doğru sonuca ulaştınız.");     
    }
}
