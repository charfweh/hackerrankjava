import java.util.*;
class scantest{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        String fake= scan.nextLine();
        String s = scan.next();
        System.out.println(s);
        System.out.println(d);
        scan.close();
    }
}