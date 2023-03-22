import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten cua ban :");
        String name = sc.nextLine();
        do{
            System.out.println("Nhap vao nam sinh  cua ban :");
        age  = 2023 - sc.nextInt();
        }while(age<0);
        if(age<16) System.out.printf("Ban %s dang o do tuoi vi thanh nien",name);
        else if(age >= 16 && age < 18) System.out.printf("Ban %s dang o do tuoi truong thanh",name);
        else System.out.printf("Ban %s da gia",name);
    }
}
