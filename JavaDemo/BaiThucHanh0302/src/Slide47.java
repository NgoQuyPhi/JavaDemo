import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        int number,tong= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can tinh tong");
        do{
        number = sc.nextInt();
        tong += number;
        System.out.println("="+ tong );
        System.out.println("+");
        } while(tong < 100);
        System.out.println("tong la " + tong);
    }
}
