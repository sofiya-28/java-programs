import java.util.Scanner;

public class AP_Series {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        //Series = 2,5,8,11,....
        for(int i=2;i<=3*n-1;i+=3){
            System.out.print(i+" ");
        }
    sc.close();
        

    }
    
}
