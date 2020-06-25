class displayReverseArray{

    public static void displayReverseArray(int[] arr, int n){
        if(n==-1){
            return;
        }

        System.out.print(arr[n] + " ");
        displayReverseArray(arr, n-1);
    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6};

        displayReverseArray(arr, 5);
        System.out.println();
    } 
}