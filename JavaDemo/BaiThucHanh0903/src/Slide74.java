import java.util.Scanner;

/**
 * Slide74
 */
public class Slide74 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhap vao kich thuoc cua mang");
            n = sc.nextInt();
        }while(n<=0);
        int arrA[]= new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.printf("arrA[%d]= ",i);
            arrA[i] = sc.nextInt();    
        }
        int tong= 0;
        for(int i = 0 ; i < n ; i++){
            if (arrA[i]%2 == 0) {
                System.out.printf("arrA[%d]+",i);
                tong += arrA[i];
            }   
        } System.out.print("= "+tong);
    }
}