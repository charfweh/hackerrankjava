import java.util.Scanner;

class triplets{
    
    public void  points(int[] a, int[] b){
        int answer[] = new int[2];
       for(int i = 0 ; i < a.length ; i++){
               if(a[i] > b[i]) answer[0]+= 1;
               else if(a[i] < b[i]) answer[1]+= 1;
           
       }
    System.out.println("Output");
    for(int k = 0; k < answer.length ; k++){
        System.out.print(answer[k]);
    }
    }
    public static void main(String args[]){
        triplets obj = new triplets();
        int alice[] = new int[3];
        int bob[] = new int[3];
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alice point");
        for(int i = 0 ; i< alice.length ; i++){
            alice[i] = scan.nextInt();
        }
        System.out.println("Enter Bob's point");
        for(int j = 0 ; j < bob.length ; j++){
            bob[j] = scan.nextInt();
        }
        obj.points(alice,bob);
    }
}