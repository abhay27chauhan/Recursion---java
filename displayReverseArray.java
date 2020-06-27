class displayReverseArray{

    public static void displayReverseArray(int[] arr, int vidx){
        if(vidx==arr.lenght){
            return;
        }

        displayReverseArray(arr, vidx+1);
        System.out.print(arr[vidx] + " ");
    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6};

        displayReverseArray(arr, 0);
        System.out.println();
    } 
}