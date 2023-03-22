import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        float a,b;
        System.out.println("Nhap vao gia tri cua 2 so a va b");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        System.out.printf("Tong %f va %f la %f \n",a,b,(a+b));
        System.out.printf("Hieu cua %f va %f la %f \n",a,b,(a-b));
        System.out.printf("Tich cua %f va %f la %f \n ",a,b,(a*b));
        System.out.printf("%f/%f la %f \n",a,b,(a/b));
        System.out.printf("%f chia lay du cho %f la %f \n",a,b, (a%b));
        if(a!=b){
            System.out.printf("so lon hon giua %f va %f la %f \n" ,a,b, (a>b?a:b));
        } else System.out.printf("2 so vua nhap vao bang nhau");
    }
    
}
