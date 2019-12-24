import java.util.*;
class missing{
    public static void main(String args[]){
        int[] arr = {1,3,2,5};
        Arrays.sort(arr);
        for(int k = 0; k < arr.length ; k++) 
        System.out.println(arr[k]);
        boolean ans = false;
        for(int i = 0 ; i < arr.length -1 ; i++){
            if(arr[i+1] - arr[i] > 1 && arr[i+1] + arr[i] != 0){ 
                
                System.out.print(++arr[i]);
                ans = true;
                break;
            }
      }
        if(ans == false) System.out.println(++arr[arr.length-1]);
    }
}