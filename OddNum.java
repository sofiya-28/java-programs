import java.util.Scanner;

public class OddNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        //method one

       /* int i=1;
        while(i<=n){
            System.out.println(i);
            i+=2;
        }*/
       //method second
        int i=1;
        while(i<n){
            if(i%2!=0){
                System.out.println(i);
            }
        i++;
       }
    sc.close();
    }
    
}
