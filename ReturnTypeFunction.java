public class ReturnTypeFunction {
    public static int tum(){
        System.out.println("Sofiya");
        System.out.println("Malik");
        return 5; // function khatam.

    }
    public static void main(String[] args){
        int x= tum();
        System.out.println(3+x); // return value me 3 add karega or tum() ko print karega 
        System.out.println(tum()); // return value ko bhe print karega or tum()
        tum(); // Stand alone call lage h bss (return value print print nhi hogi)

    }
}
