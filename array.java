class array{
    public int sum(int[] ar){
        int sum = 0;

        for(int i = 0; i < ar.length ; i++){
            sum = sum + ar[i];
        }
        return sum;

    }
    public static void main(String args[]){
        int[] ar1 = new int[]{1,2,3};
        array obj = new array();
        int answer = obj.sum(ar1);
        System.out.println(answer);

    }
}