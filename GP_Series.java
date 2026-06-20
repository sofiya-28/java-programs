import java.util.Scanner;

public class GP_Series {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        //Series = 1,2,4,8,16,....
        int a=1, r=2;
        for(int i=2;i<=n;i++){
            System.out.print(a+" ");
            a*=r;
        }
    }
    
}
