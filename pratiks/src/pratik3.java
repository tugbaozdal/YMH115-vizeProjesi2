import java.util.Scanner;
public class pratik3 {
    public static void main(String[] args) {
        //hipotenüs bulan program
        double kenar1,kenar2,hipotenus;
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen 1. kenarı giriniz");
        kenar1=input.nextDouble();
        System.out.println("lütfen 2. kenarı giriniz");
        kenar2=input.nextDouble();
        hipotenus= Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("hipotenüs uzunluğu= "+hipotenus);
        double u= (kenar1+kenar2+hipotenus)/2;
        double alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-hipotenus));
        System.out.println("üçgenin alanı= "+alan);


    }
}
