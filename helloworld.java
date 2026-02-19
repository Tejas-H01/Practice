import java.util.Scanner;
public class helloworld {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String name ;

        System.out.print("Enter the Name : ");
        name=sc.next();

        System.out.println("Hello "+name);
    }
}
