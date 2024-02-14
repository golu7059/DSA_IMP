public class path {
    public static void main(String[] args) {
        printPath("", 3, 3);
        System.out.println("Total possible paths : "+countPath(3,3));
    }

    static void printPath(String p, int r , int c){
        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }
        if(c>1)printPath(p+'R', r, c-1);
        if(r>1)printPath(p+'D', r-1, c);
    }
    
    static int countPath(int r , int c){
        if(r==1 || c==1) return 1;
       int right = countPath(r-1, c);
       int left =  countPath(r, c-1);
       return left+right;
    }
}
