import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Slide35 {
    public static void main(String[] args) {
        System.out.println("nhap vao 2 so a va b");
        int a,b,max;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        max = a>b?a:b;
        System.out.println("so lon nhat la " + max);
    }
}
