import java.util.Scanner;
public class pratik5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //vücut kütle endeksi hesaplayan program
        double vke,boy,kilo;
        System.out.println("Lütfen boyunuzu giriniz(metre cinsinden)");
        boy=input.nextDouble();
        System.out.println("lütfen kilonuzu giriniz(kg cinsinden)");
        kilo=input.nextDouble();
        vke= kilo/(boy*boy);
        System.out.println("VÜCUT KÜTLE ENDEKSİNİZ: "+ vke);


    }
}
