class AllIndices{

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static int[] allIndices(int[] arr, int idx, int x, int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }

        if(arr[idx] == x){
            int[] iarr = allIndices(arr, idx+1, x, fsf+1);
            iarr[fsf] = idx ;
            return iarr;
        }else{
            int[] iarr = allIndices(arr, idx+1, x, fsf);
            return iarr;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,3,5,6,3,4,3,6,7};

        int[] iarr = allIndices(arr, 0, 3, 0);
        display(iarr);
    }
}