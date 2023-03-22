import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        int cot,hang;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhap vao so cot");
            cot = sc.nextInt();
        }while(cot<=0);
        do{
            System.out.println("nhap vao so hang");
            hang = sc.nextInt();
        }while(hang<=0);
        float[][] A = new float[cot][hang];
        for(int i= 0;i<hang;i++){
            for(int j=0;j<cot;j++){
                System.out.printf("A[%d][%d]=",i,j);
                A[i][j] = sc.nextFloat();
            }
        }
        float max =0;
        for(int i= 0;i<hang;i++){
            for(int j=0;j<cot;j++){
                if(max < A[i][j]) max = A[i][j];
            }
        }
        System.out.printf("%.1f ",max);
    }
    
}
