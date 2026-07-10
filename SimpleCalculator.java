import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the operator");
        char operator =sc.next().charAt(0);
        System.out.println("enter the Second number");
        int n2=sc.nextInt();
    
        if(operator=='+')
            System.out.println(n1+n2);
        else if(operator=='-')
            System.out.println(n1-n2);
        else if(operator=='*')
            System.out.println(n1*n2);
        else if(operator=='/')
            System.out.println((double)n1/n2);
        else if(operator=='%')
            System.out.println(n1%n2);
        else 
            System.out.println("Default Value");
    sc.close();
    }
    
}
