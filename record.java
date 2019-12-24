import java.util.*;
class record{
    public static void main(String args[]){
        int[] score = {10,5,20,20,4,5,2,25,1};
        int high = 0, low = 0;
        //Arrays.sort(score);
        for(int ele:score) System.out.println(ele);
        for(int i = 0 ; i < score.length-1; i++){
            int h = score[i+1];
            if(score[i] > h) high++;
        }
        System.out.println("High"+high+" low "+low);
    }
}