import java.util.Scanner;
public class pratik6 {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        //manav kasa programı
        final double armut=2.14;
        final double elma=3.65;
        final double domates=1.11;
        final double muz= 0.95;
        final double patlican= 5;
        System.out.println("kaç kg armut aldınız?");
        double a=giris.nextDouble();
        double armuta= a*armut;
        System.out.println("kaç kg elma aldınız");
        double b=giris.nextDouble();
        double elmab= elma*b;
        System.out.println("kaç kg domates aldınız");
        double c= giris.nextDouble();;
        double domatesc= domates*c;
        System.out.println("kaç kg muz aldınız");
        double d= giris.nextDouble();
        double muzd= muz*d;
        System.out.println("kaç kg patlıcan aldınız");
        double e= giris.nextDouble();
        double patlicane= patlican*e;
        double toplam= armuta+elmab+domatesc+muzd+patlicane;
        System.out.println("ödenecek tutarınız: "+toplam);







    }
}
