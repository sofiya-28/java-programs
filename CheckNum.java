import java.util.Scanner;
public class CheckNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();

        if(num>0)
            System.out.println(num+"Given number is positive");
        else if(num<0)
            System.out.println(num+"Given number is negative");
        else
            System.out.println(num+"Given number is zero");
        sc.close();

        
    }
    
}
