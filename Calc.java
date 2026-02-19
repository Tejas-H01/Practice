
import java.util.Scanner;
public class Calc {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice , NumberOne , NumberTwo;
        choice= NumberOne=NumberTwo=0;
        Boolean EXIT = true;

        System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.EXIT");

        while(EXIT)
        {
            System.out.print("-------------------------------------------------------");
        System.out.println("\nEnter your choice : ");
        choice=sc.nextInt();
        if(choice==5){
            System.out.println("Calc Terminated !");
            break;
        }

        System.out.print("Enter the First Number : ");
        NumberOne=sc.nextInt();

        System.out.print("Enter the Second Number : ");
        NumberTwo=sc.nextInt();

        switch (choice){
            case 1 :
                System.out.println("Solution : "+(NumberOne+NumberTwo));
                break;

            case 2 :
                System.out.println("Solution : "+(NumberOne-NumberTwo));
                break;

            case 3 :
                System.out.println("Solution : "+(NumberOne*NumberTwo));
                break;

            case 4 :
                System.out.println("Solution : "+(NumberOne/NumberTwo));
                break;

            default:
                System.out.println("Invalid Input Choice");
        }

        sc.close();
    }
}
}
