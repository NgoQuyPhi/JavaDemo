package Phone;

import java.util.Scanner;

public class ContactByIf implements InterfaceMethod{

    String Name,PhoneNumber;

    public void Action(int a){

        switch (a) {
            case 1:
            System.out.println("Import Value:");
            Scanner sc = new Scanner(System.in);
            String temp = sc.nextLine();
            UpdateByIf(temp);
            break;
            case 2:
            DeleteByIf();
            break;
            case 3:
            SearchByNameIf();
            break;
        }
    }

    public void InsertByIf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        this.Name = sc.nextLine();
        System.out.println("Phone: ");
        this.PhoneNumber = sc.nextLine();
    }

    public void UpdateByIf(String a){
        this.PhoneNumber = a;

    }
    public void DeleteByIf(){
        this.Name = null;
        this.PhoneNumber = null;
    }
    public void SearchByNameIf(){
        System.out.println("Name: " + this.Name + "\nPhone: " + this.PhoneNumber);
    }
    
}
