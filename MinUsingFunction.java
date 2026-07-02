public class MinUsingFunction {
    public static void min(int a,int b,int c){
        if(a>=b && c>=b)  System.out.println(b);
        else if(b>=a && c>=a) System.out.println(a);
        else System.out.println(c);

    }
    public static void main(String[] args){
        min(10,2,8);
    }
    
}
