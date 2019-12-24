    import java.util.*;
    class timeconversion{
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            String format = scan.next();
            String time = format.substring(8,10);
            String hrs = format.substring(0,2);
            int realhrs = Integer.parseInt(hrs);
            //System.out.println(time+ " " +realhrs);
            int[] inputhrs = {1,2,3,4,5,6,7,8,9,10,11,12};
            int[] pmtime = {13,14,15,16,17,18,19,20,21,22,23,24};
            int i = 0;
            if(time.equals("AM")) System.out.println(format.substring(0, 8));
            if(realhrs == 12 && time.equals("AM")) System.out.println("00"+""+format.substring(2,8));
            if(realhrs == 12 && time.equals("PM")) System.out.println(12+""+format.substring(2,8));   
            if(time.equals("PM")){
            for(; i < inputhrs.length ; i++){
                    if(realhrs == inputhrs[i]){
                        System.out.println(pmtime[i]+""+format.substring(2, 8));
                    }
                }
            }
        }
    }