class displayArray{

    public static void displayArray(int [] arr, int vidx){
        if(vidx==arr.length){
            return;
        }
        
        System.out.print(arr[vidx] + " ");
        displayArray(arr, vidx + 1);
    }

    public static void main(String[] args){

        int [] arr = {1,2,3,4,5,6};

        displayArray(arr,0);
        System.out.println();
    }
}