import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of column");//outer loop number of lines
        int a=sc.nextInt();
        System.out.println("enter the number of rows ");//inner loop number of stars
        int b=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
        System.out.println("\n");
        }
    
    sc.close();
    }
    
}
