import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi va ky tu");
        String a = sc.nextLine();
        String b = sc.nextLine();
        while(a.length()>80){
        System.out.println("Nhap vao chuoi va ky tu");
         a = sc.nextLine();
         b = sc.nextLine();
        }

        int count=0;
        for( int i = 0 ; i< a.length(); i++){
            if(b.charAt(0) == a.charAt(i)) count++;
        }
        System.out.println("ki tu nhap vao xuat hien trong chuoi " + count + " lan");

    }
}
