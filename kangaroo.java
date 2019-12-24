import java.util.*;
class kangaroo{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();
        int x1sum = x1;
        int x2sum = x2;
        int i = 0;
        while(i <= 1000){
            x1 = x1 + v1;
            x2 = x2 + v2;
            if(x1 == x2){
                System.out.println("YES"+i);
                break;
            }
        }
        if(i == 1000) System.out.println("NO");
    }
}