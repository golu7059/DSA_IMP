public class primeNumber {
    public static void main(String[] args) {
        int n = 100;   // number upto you want to print prime numbers

        // print prime numbers
       for(int i=1; i<=n; i++){
        if(isPrime(i)) System.out.print(i + " ");
       }
    }

    // function to check weather the given number is prime or not
    static boolean isPrime(int n){
        if(n<2) return false;
        int i=2;
        while((i*i)<= n){
            if(n%i == 0) return false;
            i++;
        }
        return i*i > n;
    }
}
