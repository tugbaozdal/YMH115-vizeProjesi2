import java.util.Scanner;
public class pratik4 {
    public static void main(String[] args) {
        //taksimetre hesaplayan program
        Scanner input=new Scanner(System.in);
        double taksimetre= 2.20;
        double acilis=10;
        double yol,tutar;
        System.out.println("Lütfen kaç km gideceğinizi yazınız");
        yol=input.nextDouble();
        tutar=acilis+(yol*taksimetre);
        tutar =(tutar<20)?  20 : tutar;
        System.out.println("Borcunuz: "+ tutar);





    }
}
