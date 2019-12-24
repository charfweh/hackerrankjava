import java.util.*;
class grades{
    public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] grades = new int[n];
    for(int k = 0 ;  k < grades.length ; k++) grades[k] = scan.nextInt();
        for(int i = 0; i < grades.length; i++){
            if(grades[i] >= 38){
                if(grades[i] % 5 >= 3){
                    int ans = grades[i] / 5;
                    System.out.println(grades[i] = (ans + 1) * 5);
                }
                else System.out.println(grades[i] = grades[i]);
            }
            if(grades[i] < 38) System.out.println(grades[i]);
        }
    }
}