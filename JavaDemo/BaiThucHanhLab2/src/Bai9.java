import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi");
        String a = sc.nextLine();
        int countso=0,countchuthuong=0, countchuhoa=0;
        for(int i = 0 ; i< a.length();i++){
            if(a.charAt(i) >= 48 && a.charAt(i) <= 57) countso++;
            else if(a.charAt(i) >= 65 && a.charAt(i) <= 90) countchuhoa++;
            else if(a.charAt(i) >= 97 && a.charAt(i) <= 122) countchuthuong++;
        }
        System.out.println("so lan xuat hien so "+ countso);
        System.out.println("so lan xuat hien chu hoa  "+ countchuhoa);
        System.out.println("so lan xuat hien chu thuong " + countchuthuong);
    }
}
