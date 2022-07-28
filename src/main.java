import java.util.Scanner;

public class main {


    //Patika.dev egitim kampi proje odevidir.



    /*Gelişmiş Hesap Makinesi
      Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

      Hesap makinesinin fonksiyonları :

      1- Toplama İşlemi
      2- Çıkarma İşlemi
      3- Çarpma İşlemi
      4- Bölme işlemi
      5- Üslü Sayı Hesaplama
      6- Faktoriyel Hesaplama
      7- Mod Alma
      8- Dikdörtgen Alan ve Çevre Hesabı
      0- Cikis

      Aynı projeye mod almak ve dikdörtgen alan çevre hesabını yapan metotları yazıp
      menüde işlevsel hale getiriniz.

     */




    static int toplama(int sayi1, int sayi2){

        int sonuc = sayi1 + sayi2;

        System.out.println("Toplam = "+ sonuc);

        return sonuc;

    }

    static int cikarma(int sayi1 , int sayi2){

        int sonuc = sayi1 - sayi2;

        System.out.println("Cikarma = "+sonuc);

        return sonuc;

    }

    static int carpma(int sayi1 , int sayi2){

        int sonuc = sayi1 * sayi2;

        System.out.println("Carpma = "+sonuc);

        return sonuc;
    }

    static int bolme(int sayi1, int sayi2){

        int sonuc = sayi1 / sayi2;

        System.out.println("Bolme = "+sonuc);

        return sonuc;

    }

    static int usAlma(int sayi1 , int sayi2){

        int sonuc=1;

        for(int i = 1; i<=sayi2; i++){
            sonuc*= sayi1;
        }

        System.out.println("Sonuc = "+sonuc);

        return sonuc;
    }

    static int faktoriyel(int sayi1){

        int sonuc = 1;

        for(int i=1; i<=sayi1;i++){
            sonuc = sonuc * i;
        }

        System.out.println("Sonuc = "+sonuc);

        return sonuc;

    }

    static int mod(int sayi1, int sayi2){

        int sonuc;

        sonuc = sayi1 % sayi2;

        System.out.println("Sonuc = "+sonuc);

        return sonuc;

    }

    static void alanCevre(int sayi1, int sayi2){

        int alan, cevre;

        alan = sayi1 * sayi2;

        cevre = 2 * (sayi1+sayi2);

        System.out.println("Cevre degeri = "+cevre);
        System.out.println("Alan degeri = "+alan);

    }






    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int secim;

        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesai\n"
                + "0- Cikis Yap";

        boolean cikis = true;


        while(cikis){


            System.out.println(menu);
            System.out.println("Bir islem seciniz = ");
            secim = inp.nextInt();



            switch(secim){
                case 0:{
                    System.out.println("Cikis yapiliyor");
                    cikis = false;
                    break;
                }
                case 1:{
                    System.out.println("Toplama yapmak istediginiz ilk sayiyi giriniz = ");
                    Scanner inp1 = new Scanner(System.in);
                    int a = inp1.nextInt();
                    System.out.println("Toplama yapmak istediginiz ikinci sayiyi giriniz = ");
                    Scanner inp2 = new Scanner(System.in);
                    int b = inp2.nextInt();

                    toplama(a,b);
                    break;

                }
                case 2:{
                    System.out.println("Cikarma yapmak istediginiz ilk sayiyi giriniz = ");
                    Scanner inp1 = new Scanner(System.in);
                    int a = inp1.nextInt();
                    System.out.println("Cikarma yapmak istediginiz ikinci sayiyi giriniz = ");
                    Scanner inp2 = new Scanner(System.in);
                    int b = inp2.nextInt();

                    cikarma(a,b);
                    break;

                }
                case 3:{
                    System.out.println("Carpma yapmak istediginiz ilk sayiyi giriniz = ");
                    Scanner inp1 = new Scanner(System.in);
                    int a = inp1.nextInt();
                    System.out.println("Carpma yapmak istediginiz ikinci sayiyi giriniz = ");
                    Scanner inp2 = new Scanner(System.in);
                    int b = inp2.nextInt();

                    carpma(a,b);
                    break;


                }
                case 4:{
                    System.out.println("Bolme yapmak istediginiz ilk sayiyi giriniz = ");
                    Scanner inp1 = new Scanner(System.in);
                    int a = inp1.nextInt();
                    System.out.println("Bolme yapmak istediginiz ikinci sayiyi giriniz = ");
                    Scanner inp2 = new Scanner(System.in);
                    int b = inp2.nextInt();

                    bolme(a,b);
                    break;


                }
                case 5:{
                    System.out.println("Us alinacak sayiyi giriniz = ");
                    Scanner inp1 = new Scanner(System.in);
                    int a = inp1.nextInt();
                    System.out.println("Us degerini giriniz = ");
                    Scanner inp2 = new Scanner(System.in);
                    int b = inp2.nextInt();

                    usAlma(a,b);
                    break;

                }
                case 6:{
                    System.out.println("Faktoriyel almak istediginiz sayiyi giriniz = ");
                    Scanner inp1 = new Scanner(System.in);
                    int a = inp1.nextInt();

                    faktoriyel(a);
                    break;


                }
                case 7:{
                    System.out.println("Mod almak istediginiz sayiyi giriniz = ");
                    Scanner inp1 = new Scanner(System.in);
                    int a = inp1.nextInt();
                    System.out.println("Mod degerini giriniz = ");
                    Scanner inp2 = new Scanner(System.in);
                    int b = inp2.nextInt();

                    mod(a,b);
                    break;

                }
                case 8:{
                    System.out.println("Uzun kenar uzunlugunu giriniz = ");
                    Scanner inp1 = new Scanner(System.in);
                    int a = inp1.nextInt();
                    System.out.println("Kisa kenar uzunlugunu giriniz = ");
                    Scanner inp2 = new Scanner(System.in);
                    int b = inp2.nextInt();

                    alanCevre(a,b);
                    break;

                }

                default:{
                    System.out.println("Gecersiz secim");
                    break;
                }

            }
        }



    }
}
