import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhap vao so phan tu cua mang");
            n = sc.nextInt();
        }while(n<=0);
        int A[] = new int[n];
        for(int i = 0 ;i < n ; i++ ){
            System.out.println("Nhap phan tu thu " + (i+1));
            A[i] = sc.nextInt();
        }
        for(int i = 0 ;i < n ; i++ ){
            System.out.printf("%d ",A[i]);
        }
        for(int i = 0 ;i < n-1 ; i++ ){
            for(int j = i+1 ;j <n ; j++ ){
                if(A[i]>A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println("");
        for(int i = 0 ;i < n ; i++ ){
            System.out.printf("%d ",A[i]);
        }
    }
}
