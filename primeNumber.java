public class primeNumber {
    public static void main(String[] args) {
        int n = 100;
        for(int j=1; j<=n ; j++){
            for (int i=2; i< Math.pow(j, 0.5); i++){
                if(j%i != 0) System.out.println(j);
            }
        }
    }
}
