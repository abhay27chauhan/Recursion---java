class toh{

    public static void toh(String src, String dest, String helper, int n){
        if(n==0){
            return;
        }
        toh(src, helper, dest, n-1);
        System.out.println("Move " + n +"th disc from " + src + " to " + dest);
        toh(helper, dest, src, n-1);
    }

    public static void main(String[] args){
        toh("A", "B", "C", 3);
    }
}