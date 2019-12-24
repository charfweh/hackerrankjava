class bigsum {
    long sum(long a){
        long tens = 100000000;
        while(a > 0){
            tens += a;
            a--;
        }
        return tens;
    }
    public static void main(String args[]){
        long answer = 5;
        long ans;
        bigsum obj = new bigsum();
        ans = obj.sum(answer);
        System.out.println(ans);
    }
}