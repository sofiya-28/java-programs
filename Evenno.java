import java.util.Scanner;

public class Evenno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente rthe number");
        int n=sc.nextInt();
        //method one
       /*int i=1;
        while(i<n){
            if(i%2==0){
                System.out.println(i);
            }
        i++;
        }*/

        //method second
        int i=2;
        while(i<n){
            System.out.println(i);
            i+=2;
        }


    }
    
}
