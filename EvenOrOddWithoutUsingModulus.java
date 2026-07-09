import java.util.Scanner;

public class EvenOrOddWithoutUsingModulus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number");
        int n=sc.nextInt();
        if((n/2)*2==n)
            System.out.println("even Number");
        else
            System.out.println("Odd number");
    sc.close();

    }
    
}
