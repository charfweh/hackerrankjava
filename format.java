import java.util.Scanner;

public class format {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s="",ss="",sss="";
            int x=0,y=0,z=0;
                 s=sc.next();
                 x=sc.nextInt();
                 ss = sc.next();
                 y = sc.nextInt();
                 sss = sc.next();
                 z = sc.nextInt(); 
                
                //Complete this line
        
            sc.close();
            System.out.println("================================");
           
                System.out.printf("%-15s%03d%n",s,x);
                System.out.printf("%-15s%03d%n",ss,y);
                System.out.printf("%-15s%03d%n",sss,z);
          
            System.out.println("================================");

    }
}



