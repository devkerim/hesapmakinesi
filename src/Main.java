import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner intscanner = new Scanner(System.in);
       int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = intscanner.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divides();
                    break;
                case 5:
                    exp();
                    break;
                case 6:
                    fact();
                    break;
                case 7:mod();
                    break;
                case 8:rect();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
    static void plus(){
        Scanner intscanner = new Scanner(System.in);
        int t=1,num,result=0;
        do{
            System.out.println(t++ +". Sayıyı Giriniz: ");
            num = intscanner.nextInt();
            result+=num;
        }while(num!=0);
        System.out.println("Sonuç: "+result);
    }


    static void minus(){
        Scanner intscanner = new Scanner(System.in);
        System.out.println("Kaç adet Sayı gireceksiniz: ");
        int result=0,num,t = intscanner.nextInt();
        for(int i=1;i<=t;i++){
            System.out.println(i+". Sayıyı Giriniz: ");
            num = intscanner.nextInt();
            if(i==1){
                result = num;
                continue;
            }
            result-=num;
        }
        System.out.println("Sonuç: "+result);
    }


    static void times(){
        Scanner intscanner = new Scanner(System.in);
        int t=1,num=1,result=1;
        do{
            System.out.println(t++ +". Sayıyı Giriniz: ");
            num = intscanner.nextInt();
            result *=num;
        }while(num!=1);
        System.out.println("Sonuç: "+result);
    }


    static void divides(){
        Scanner intscanner = new Scanner(System.in);
        int t,num,result=1;
        System.out.println("Kaç adet Sayı Gireceksiniz: ");
        t = intscanner.nextInt();
        for(int i=1;i<=t;i++){
            System.out.println(i+". Sayıyı Giriniz: ");
            num = intscanner.nextInt();
            if(i==1){
                result = num;
                continue;
            }
            result/=num;
        }
        System.out.println("Sonuç: "+result);
    }


    static void exp(){
        Scanner intscanner = new Scanner(System.in);
        int exp,base,result=1;
        System.out.println("Üssü alınacak ifadeyi giriniz: ");
        base = intscanner.nextInt();
        System.out.println("Üs olacak ifadeyi giriniz: ");
        exp = intscanner.nextInt();
        for(int i=0;i<exp;i++){
            result*=base;
        }
        System.out.println("Sonuç: "+result);
    }


    static void fact(){
        Scanner intscanner = new Scanner(System.in);
        int num,result=1;
        System.out.println("Faktöriyeli alınacak sayıyı giriniz: ");
        num = intscanner.nextInt();
        for(int i=1;i<=num;i++){
            result*=i;
        }
        System.out.println(num+" Sayısının Faktöriyeli: "+result);
    }


    static void mod(){
        Scanner intscanner = new Scanner(System.in);
        int a,b,result;
        System.out.println("Modu alınacak Sayı: ");
        a = intscanner.nextInt();
        System.out.println("Mod alacak Sayı: ");
        b = intscanner.nextInt();
        result = a%b;
        System.out.println("Sonuç: "+result);
    }


    static void rect(){
        Scanner intscanner = new Scanner(System.in);
        int a,b,alan,cevre;
        System.out.println("Dikdörtgenin 1. Kenar Uzunluğunu giriniz: ");
        a = intscanner.nextInt();
        System.out.println("Dikdörtgenin 2. Kenar Uzunluğunu giriniz: ");
        b = intscanner.nextInt();
        alan=a*b;
        cevre = (a+b)*2;
        System.out.println("Girilen Dikdörtgenin Alanı: "+alan);
        System.out.println("Girilen dikdörtgenin Çevresi: "+cevre);

    }

}
