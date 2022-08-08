import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1,n2,process;
        Scanner inp= new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        n1=inp.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        n2=inp.nextInt();
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        process=inp.nextInt();
        switch (process){
            case 1:
                System.out.print("Toplam = "+(n1+n2));
                break;
            case 2:
                System.out.print("Fark = "+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpım = "+(n1*n2));
                break;
            case 4:
                float result=(n1/n2);
                System.out.print("Bölme = "+result);
            default:
                System.out.print("Hatalı seçim yaptınız");
        }
    }
}
