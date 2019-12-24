import java.util.Scanner;
import java.lang.*;

class plusminus{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int arr[] = new int[input];
        for(int j = 0 ; j < arr.length ; j++){
            arr[j] = scan.nextInt();
        }
        int pos = 0;  int neg = 0; int zero = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < 0) neg++;
            if(arr[i] > 0) pos++;
            if(arr[i] == 0) zero++;
        }
       double posresult = (float)pos / arr.length;
       double negresult= (float)neg / arr.length;
       double zeroresult = (float)zero / arr.length;
       System.out.printf("%.6f%n",posresult);
       System.out.printf("%.6f%n",negresult);
       System.out.printf("%.6f%n",zeroresult);
        
    }
} 