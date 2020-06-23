class printIncDec{

    public static void printIncDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printIncDec(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        printIncDec(5);
    }
}