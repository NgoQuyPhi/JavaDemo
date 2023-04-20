package Shapes;

import java.util.Scanner;

public class Circle extends Shapes {
    public float Radius;

    public Circle(){
        Name = "Circle";
    }
    
    public void ImportRadius() {
        System.out.println("Radius= ");
        Scanner sc = new Scanner(System.in);
        Radius = sc.nextFloat();
    }

    public void PerimeterCalculate() {
        Perimeter = 2*Pi*Radius;
    }

    public void AreaCalculate() {
        Area = Pi * Radius * Radius;
    }

    public float GetArea(){
        return this.Area;
    }
    public void SetRadius(float a) {
        this.Radius = a;
    }
    
}
