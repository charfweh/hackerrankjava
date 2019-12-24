import java.util.*;
class loops{
    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(); //number of queries
        int[] a = new int[q];
        int[] b = new int[q];
        int[] n = new int[q];

        for(int i = 0; i < q ; i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            n[i] = scan.nextInt();
        }
        int main = 0; 
        while(main < n.length){
            int counter = 0;
            int sum = 0;
            int sum1 = 0;
            while(counter < n[main]){   
                sum1 += (int)Math.pow(2,counter);
                sum = a[main] + sum1 * b[main];
                System.out.print(sum+" ");
                counter++;
            }
            System.out.printf("%n");
            main++;
        }
       scan.close();
    }
}