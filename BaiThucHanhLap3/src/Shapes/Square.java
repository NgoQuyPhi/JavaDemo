package Shapes;

import java.util.Scanner;

public class Square extends Rectangle {

    public  Square() {
        Name = "Square";
    }

    public void ImportCanh() {
        System.out.println("Canh=");
        Scanner sc = new Scanner(System.in);
        Length = Width  = sc.nextFloat();
    }

    public float GetVolume(){
        return Volume;
    }

    public void SetLength(float a) {
        this.Length = this.Width = a;
    }

}
