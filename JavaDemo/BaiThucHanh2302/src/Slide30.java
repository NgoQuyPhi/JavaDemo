import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        int a,tong=0;
    do{
        System.out.println("Nhap vao so a");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInts();
    }while(a<=0);
    while(a>0){
        tong += a%10;
        a = a/10;
    }
    System.out.println("so nhap vao co tong cac chu so la " + tong);
    }
}
