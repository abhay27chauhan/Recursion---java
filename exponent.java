class exponent{

    public static int pon(int n, int x){
        if(x==0){
            return 1;
        }
        
        int faith = pon(n, x-1);
        int ans = n*faith;

        return ans;
    }

    public static void main(String[] args){
        System.out.println(pon(2, 5));
    }
}