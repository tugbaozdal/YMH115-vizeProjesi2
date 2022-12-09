import java.util.Scanner;
public class pratik1 {
    public static void main(String[] args) {
        // ortalama hesaplatan program(başarılı-başarısız)
        double a,b,c,d,e,f;
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen matematik notunuzu giriniz: ");
        a= input.nextDouble();
        System.out.println("Lütfen fizik notunuzu giriniz: ");
         b= input.nextDouble();
        System.out.println("kimya notunuzu giriniz: ");
        c= input.nextDouble();
        System.out.println("türkçe notunuzu giriniz");
        d= input.nextDouble();
        System.out.println("tarih notunuzu giriniz");
        e= input.nextDouble();
        System.out.println("müzik notunuzu giriniz");
        f= input.nextDouble();
        double ort= (a+b+c+d+e+f)/6;
        boolean sonuc1=(ort>60);
        String str= (sonuc1) ? "BAŞARILI" : "BAŞARISIZ";
        System.out.println(" ortalamaniz"+ ort);
        System.out.println(str);
    }
}
