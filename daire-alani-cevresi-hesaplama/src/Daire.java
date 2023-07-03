import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
      /*  Dairenin Alanını ve Çevresini Hesaplayan Program
          Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

          Alan Formülü : π * r * r;

          Çevre Formülü : 2 * π * r;
      */

        int r;
        double pi=3.14;

        Scanner input=new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: " );
        r = input.nextInt();

        double alan= pi * r * r;
        double çevre= 2 * pi * r;

        System.out.println("Daire'nin Alanı: " + alan);
        System.out.println("Daire'nin Çevresi: "+ çevre);

        /*
          Ödev
          Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

          𝜋 sayısını = 3.14 alınız.

          Formül : (𝜋 * (r*r) * 𝛼) / 360
        */

        int r1;
        double a;
        double pi1 = 3.14;

        System.out.print("Yarıçapı giriniz: ");
        r1 = input.nextInt();

        System.out.print("Merkez açı ölçüsünü giriniz: ");
         a = input.nextDouble();

        System.out.print("Daire diliminin alanı: ");
        double sonuc= (pi1 * (r1*r1) * a) / 360;
        System.out.println(sonuc);

    }
}
