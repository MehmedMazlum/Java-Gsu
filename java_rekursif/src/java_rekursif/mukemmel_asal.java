package java_rekursif;

public class mukemmel_asal {

    public static int fact(int n) {
        if(n == 1){
            return 1 ;
        }
        return ( n * fact(n-1)); 
    }
    public static void main(String[] args) {
        int x ;
        x = fact(9);
        System.out.println("cevabimiz"+" "+x);

    }
}