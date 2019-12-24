import java.util.*;
class uwu {
    public static void main(String args[]){
        int marks[] = new int[5];
        Scanner scan  = new Scanner(System.in);
        for(int i = 0  ; i < marks.length ; i++){
            marks[i] = scan.nextInt();
        }
        int sum[] = new int[5];
        int temp = 0;
        for (int j = 0; j < marks.length; j++)   
        {  
            for (int k = j + 1; k < marks.length; k++)   
            {  
                if (marks[j] > marks[k])   
                {  
                    temp = marks[j];  
                    marks[j] = marks[k];  
                    marks[k] = temp;  
                }  
            }  
        }
        System.out.println("Sorted array");
        for(int l = 0; l < marks.length ; l++){
            System.out.println(marks[l]);
        }
        int maxsum = 0; int minsum = 0;
        for(int m = 1 ; m < marks.length ; m++){
            maxsum += marks[m];
        }
        for(int n = 0 ; n < marks.length - 1 ; n++){
            minsum += marks[n];
        }
        System.out.println(minsum + " " + maxsum);
    }
}