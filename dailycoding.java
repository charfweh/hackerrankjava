import java.util.*;
class dailycoding{
    //
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int[] arr1 = new int[l];
        int[] answer = new int[l];
        for(int i = 0 ; i < arr1.length ; i++){
            arr1[i] = scan.nextInt();
        }
        int j = 0;
        int insert = 1; int insert1 = 1; int right = 1; int left = 1;
        while(j < arr1.length){
            if(j == 0){
                for(int k = 1 ; k < arr1.length; k++){
                    insert  = insert * arr1[k];
                    answer[j] = insert;
                }
            }
            else if(j == arr1.length - 1){
                for(int m = arr1.length-1 ; m >0 ; m--){
                    insert1 = insert1 * arr1[m-1];
                    answer[j] = insert1;
                }
            }
            else if(j > 0 && j < arr1.length){
                for(int n = j; n < arr1.length-1; n++){
                    right = right * arr1[n+1];
                 }
                for(int b = j ; b > 0 ; b--){
                    left = left * arr1[b-1];
                }
                answer[j] = right * left;
                right  = 1; left = 1;
            }
            j++;
        }
        for(int final1 = 0 ; final1 < answer.length; final1++){
            System.out.print(answer[final1]+" ");
        }
        scan.close();
    }
}
