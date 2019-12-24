import java.util.*;
class triangle{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int area = scan.nextInt();
        int  height = 2 * area/base;
        System.out.println(Math.ceil(height));
    }
} //code failed.