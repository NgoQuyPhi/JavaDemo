package Phone;

import java.util.Scanner;

public class Contact extends Method{

    private String Name,PhoneNumber;

    public String GetName() {
        return this.Name;
    }

    public void Action(int Num) {
        switch (Num) {
            case 1:
                System.out.println("Update Information User \n Please Import New Phone Number:");
                Scanner sc = new Scanner(System.in);
                String Name = sc.nextLine();
                Update(Name);
                break;
            case 2:
                Delete();
                System.out.println("This Contact Had Been Delete");
                break;
            case 3:
                SearchByName();
            
        }
    }

     public void Insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        this.Name = sc.nextLine();
        System.out.println("PhoneNumber: ");
        this.PhoneNumber = sc.nextLine();
    }   

    void Update(String Name) {
            this.Name = Name;
            System.out.println("Your Information have been Updated");
    }

    void Delete()
    {
        this.Name = null;
        this.PhoneNumber = null;
        System.out.println("Your Infomation have been deleted");
    }

    void SearchByName() {
        System.out.println("Name: " + this.Name);
        System.out.println("PhoneNumber: " + this.PhoneNumber);
    }
    
    
}
