import java.util.Scanner;

public class Employee {
    String FullName;
    int Age;
    float CoefficientsSalary;
    final float BasicSalary = 1490000f;
    void ImportInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Import Your Name: ");
        FullName = sc.nextLine();
        System.out.println("Import Your Age: ");
        Age = sc.nextInt();
        System.out.println("Import Your CoefficientsSalary: ");
        CoefficientsSalary = sc.nextFloat();
    }
    float SalaryCalculation(){
        return BasicSalary*CoefficientsSalary;
    }
    void ExportInformation(){
        System.out.printf("\nEmployee: %s",FullName);
        System.out.printf("\nAge: %d",Age);
        System.out.printf("\nCoefficients Salary: %f", CoefficientsSalary);
        System.out.printf("\nSalary: %f",SalaryCalculation());
    }
    

    
}