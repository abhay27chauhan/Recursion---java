class lastIndex{

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int lidx = lastIndex(arr, idx+1, x);
        if(lidx == -1){
            if(arr[idx] == x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return lidx;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,3,5,6,3,4,2,6,7};

        int idx = lastIndex(arr, 0, 3);
        System.out.println(idx);
    }
}