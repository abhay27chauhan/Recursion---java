class printStairPaths{

    public static void printStairPaths(int n, String path){
        if(n==0){
            System.out.print(path + " ");
            return;
        }

        if(n<0){
            return;
        }

        printStairPaths(n-1, path + "1");
        printStairPaths(n-2, path+"2");
        printStairPaths(n-3, path+"3");
    }

    public static void main(String[] args){
        printStairPaths(6, "");
        System.out.println();
    }
}