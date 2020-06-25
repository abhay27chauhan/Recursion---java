class displayArray{

    public static void displayArray(int [] arr, int n){
        if(n==-1){
            return;
        }
        
        displayArray(arr, n-1);
        System.out.print(arr[n] + " ");
    }

    public static void main(String[] args){

        int [] arr = {1,2,3,4,5,6};

        displayArray(arr,5);
        System.out.println();
    }
}