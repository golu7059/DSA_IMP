import java.util.ArrayList;

public class diceTarget {
     public static void main(String[] args) {
        dice("",4);
        ArrayList<String>res = diceRet("", 6);
        System.out.println(res);
     }
     // function to print all possible combinations for target sum
     static void dice(String p , int target){   
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=6 && i<= target; i++){
            dice(p+i, target-i);
        }
     }

     // return same question in the form of arraylist
     static ArrayList<String> diceRet(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i++){
            ans.addAll(diceRet(p+i, target-i)) ;
        }
        return ans;
     }
}
