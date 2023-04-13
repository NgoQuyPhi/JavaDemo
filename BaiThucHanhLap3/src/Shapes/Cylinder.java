
package Shapes;

import java.util.Scanner;

public class Cylinder extends Circle{
    public float Hight;

    public  Cylinder() {
        Name = "Cylinder";
    }

    public void ImportHight() {
        ImportRadius();
        System.out.println("Hight= ");
        Scanner sc = new Scanner(System.in);
        Hight = sc.nextFloat();
    }
    public void VolumeCalculate() {
        AreaCalculate();
        Volume = Area*Hight;
    }
}
