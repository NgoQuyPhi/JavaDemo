import java.util.Scanner;

import javax.print.StreamPrintService;

public class Bai8 {
    public static void main(String[] args) {
        int number;
        int solanlap,tong=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("day so gom co bao nhieu so:");
        solanlap = sc.nextInt();
        for(int i = 0 ; i < solanlap ; i++ ){
            System.out.println("nhap so :");
            number = sc.nextInt();
            tong += number;
        }
        System.out.println("trung binh cong cac so vua nhap la " + ((float)tong/solanlap));
    }
}
