import java.util.Scanner;

import Shapes.Circle;
import Shapes.Cylinder;
import Shapes.Rectangle;
import Shapes.Square;

public class App {
    public static void main(String[] args) throws Exception {
        int number = 1;
        switch (number) {
            case 1:
                Circle cc = new Circle();
                cc.ImportRadius();
                cc.PerimeterCalculate();
                cc.AreaCalculate();
                cc.PrintPerimeter();
                cc.PrintArea();
                break;
            case 2:
                Cylinder cl = new Cylinder();
                cl.ImportHight();
                cl.VolumeCalculate();
                cl.PrintVolume();
                break;
            case 3:
                Rectangle foo = new Rectangle();
                foo.ImportLengthWidth();
                foo.PerimeterCalculate();
                foo.AreaCalculate();
                foo.PrintPerimeter();
                foo.PrintArea();
                break;
            case 4:
                Square fo = new Square();
                fo.ImportCanh();
                fo.PerimeterCalculate();
                fo.AreaCalculate();
                fo.PrintArea();
                fo.PrintPerimeter();
            default:
            System.out.println("deo co gi de in");
                break;
        }
    }
}
