package Phone;

import java.util.Scanner;

public class MainModun {
    
   
    public static void main(String[] args) {
        int NumberOfContact;
         
        do {
        System.out.println("Number Of Contact In Phone: ");  //request user Import Number of Contact
        Scanner sc = new Scanner(System.in);
        NumberOfContact = sc.nextInt();  // input Number Of Contact
        }while(NumberOfContact <= 0);

        Contact A[] = new Contact[NumberOfContact]; //Declare Array Contact

        for(int i = 0; i < A.length; i++){
            Contact ct = new Contact();
            ct.Insert();
            A[i] = ct;
        };

        System.out.println("Import Your User Name: ");  //Import User Name 
        Scanner sc = new Scanner(System.in);
        String TempName = sc.nextLine();
        int temPosition;

        for(temPosition = 0; temPosition < A.length;temPosition++){  // CheckPosition
            if(A[temPosition].GetName().equals(TempName)){
                break;
            }
        } if(temPosition == A.length) temPosition = -1;

        if(temPosition != -1 ){
            System.out.println("Menu Action \nImport 1 to UpDateInformation \nImport 2 to DeleteInformation \nImport 3 to SearchByName ");
            int temp = sc.nextInt();        //Menu action
            A[temPosition].Action(temp);
        } else { 
            System.out.println("No Data");
        };

    }
}

    


