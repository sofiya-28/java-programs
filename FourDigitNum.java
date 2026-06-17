import java.util.Scanner;

public class FourDigitNum {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number, Check number : ");
        int n=sc.nextInt();

        if(n>999 && n<10000)
            System.out.println("Number is 4 digit number");
        else 
            System.out.println("Number is not 4 digit number");
    sc.close();

    }
    
}
