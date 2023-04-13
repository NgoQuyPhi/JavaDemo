package Shapes;

import java.util.Scanner;

public class Rectangle extends Shapes{
    public float Length;
    public float Width;

    public  Rectangle() {
        Name = "Rectangle";
    }

    public void ImportLengthWidth() {
        System.out.println("Length=");
        Scanner sc = new Scanner(System.in);
        Length = sc.nextFloat();
        System.out.println("Width=");
        Width = sc.nextFloat();
    }

    public void AreaCalculate() {
        Area = Length*Width;
    }
    
    public void PerimeterCalculate() {
        Perimeter = 2 * (Length + Width);
    }

}
