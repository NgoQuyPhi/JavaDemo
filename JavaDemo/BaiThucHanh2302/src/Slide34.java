import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args) {
        int a,b,c;
        float delta;
            System.out.println("nhap vao he so a");
            Scanner scanner= new Scanner(System.in);
            a = scanner.nextInt();
            System.out.println("nhap vao he so b");
            b = scanner.nextInt();
            System.out.println("nhap vao he so c");
            c = scanner.nextInt();
        delta = b*b - 4*a*c;
        if(delta > 0) System.out.println("co 2 nghiem");
        else if(delta ==0) System.out.println("co nghiem kep");
        else System.out.println("vo nghiem");
    }
}
