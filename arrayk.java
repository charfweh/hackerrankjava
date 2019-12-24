import java.util.*;
class arrayk{
    public static void main(String args[]){
        int[] arr = {10,15,7,3};
        int k = 17;
        boolean answer = true;
        for(int i = 0 ; i < arr.length ; i++){
            answer = Arrays.asList(arr).contains(k - arr[i]);
        }
        if(answer = true) System.out.println(answer);
        else System.out.println(!answer);
        
    }
}