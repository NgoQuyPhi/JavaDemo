import java.util.Scanner;

public class Hinhtrutron {
    float Radius, Hight;
    final float PI = 3.14f;
    void ImportInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Import radius : ");
        Radius = sc.nextFloat();
        System.out.println("Import hight : ");
        Hight = sc.nextFloat();
    }
    float SurroundingAreaCalculation(){
        return 2 * PI * Radius * Hight;
    }
    float TotalAreaCalculation(){
        return 2 * PI * Radius * (Radius + Hight);
    }
    float VolumeCalculation(){
        return PI * Radius * Radius * Hight;
    }
    void ExportInformation(){
        System.out.printf("Dien tich xung quanh = %f \n Dien tich toan phan = %f \n The tich = %f",SurroundingAreaCalculation(),TotalAreaCalculation(),VolumeCalculation());
    }
}
