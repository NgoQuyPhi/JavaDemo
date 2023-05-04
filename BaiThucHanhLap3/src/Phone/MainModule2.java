package Phone;

import java.util.Scanner;

public class MainModule2 {
    public static void main(String[] args) {
        int NumberOfContact;

        Scanner sc = new Scanner(System.in);
        NumberOfContact = sc.nextInt();

        ContactByIf A[] = new ContactByIf[NumberOfContact];

        for(int i = 0 ; i< A.length ; i++){
            A[i].InsertByIf();
        }

        System.out.println("Import Your User Name: ");  //Import User Name 
        Scanner sc2 = new Scanner(System.in);
        String TempName = sc2.nextLine();
        int temPosition;

        for(temPosition = 0; temPosition < A.length;temPosition++){  // CheckPosition
            if(A[temPosition].Name.equals(TempName)){
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
