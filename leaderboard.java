import java.util.*;
class leaderboard{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int players = scan.nextInt();
        int[] leader = new int[players];
        int[] ranks = new int[players];
        
        for(int i = 0 ; i < leader.length ; i++){
            leader[i] = scan.nextInt();
        }
        for(int k = 0; k < leader.length ; k++){
            if(leader[k] == leader[k+1]) ranks[k] = 1;
            else ranks[k] = 2;//pick up from here.
        }
        int aliceplays = scan.nextInt();
        int alice[] = new int[aliceplays];
        for(int j = 0; j < aliceplays; j++){
            alice[j] = scan.nextInt();
        }
        
        int main = 0;
        while(main < alice.length){
            int inner = 0;
            while(inner < leader.length){
                if(alice[main] - leader[inner] <= 10)
                
            }
            main++;
        }   
        scan.close();
    }
}