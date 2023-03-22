import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhap vao 1 so ");
            number = sc.nextInt();
        }while(number< 0);
        int giaithua=1;
        for(int i = number;i>0;i--){
            giaithua *= i;
        }
        System.out.printf("Giai thua cua %d la %d ",number, giaithua);
    }
    
}
