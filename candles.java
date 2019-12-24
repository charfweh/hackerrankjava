import java.util.*;

class candles{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int candnumber = scan.nextInt();
        int arr[] = new int[candnumber];
        for(int i =  0 ; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int large = arr[arr.length-1];
        int count = 0;
        for(int k = 0 ; k < arr.length ; k++){
            if(arr[k] == large) count++;
        }
        System.out.println(count);

    }
}