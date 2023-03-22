import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int tong = 0,number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so");
        while(tong < 100)
        {
            number = sc.nextInt();
            tong += number;
            System.out.println("+");
        } System.out.println("="+ tong);


    }
}
