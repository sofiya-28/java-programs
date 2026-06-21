
import java.util.Scanner;

public class CompositeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=2;i<=n-1;i++){
            if(n%2==0)
                System.out.println("Composite number");

            else 
                System.out.println("Prime Number");
            break;
        }
        
    }
    
}
