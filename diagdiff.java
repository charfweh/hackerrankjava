import java.util.*;
class diagdiff{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int rows = 0 ; rows < arr.length ; rows++){
            for(int cols = 0 ; cols < arr.length  ; cols++){
                arr[rows][cols] = scan.nextInt();
            }
        }
        int left=0; int right = 0;
        for(int i = 0; i < arr.length ; i++){
                left += arr[i][i];
        }
        int r = arr.length-1;
        for(int j = 0 ; j < arr.length ; j++){
            right += arr[j][r];
            r--;
        }
        System.out.println(Math.abs(left-right));
    }
}