class maxInArray{

    public static int maxInArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int cmax = maxInArray(arr, idx+1);
        if(cmax>arr[idx]){
            return cmax;
        }else{
            return arr[idx];
        }
    }

    public static void main(String[] args){
        int [] arr = {22,2,33,14,18,29,3};

        int max  = maxInArray(arr,0);
        System.out.println(max);
    }
}