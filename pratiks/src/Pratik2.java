
import java.util.Scanner;
public class Pratik2 {
    public static void main(String[] args) {
        //KDV hesaplatan program
        double fiyat, KDVlifiyat, KDV1=0.18, KDV2=0.8 , KDVtutari;
        Scanner input= new Scanner(System.in);
        System.out.println("FİYAT GİRİNİZ");
        fiyat= input.nextDouble();

        KDVtutari= fiyat<1000 ? KDV1*fiyat : KDV2*fiyat;
        KDVlifiyat= fiyat+ KDVtutari;


        System.out.println("KDV tutari ve KDVli fiyat: "+ KDVtutari);
        System.out.println(KDVlifiyat);





    }
}
