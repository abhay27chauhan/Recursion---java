class firstIndex{

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length-1){
            return -1;
        }

        if(arr[idx] == x){
            return idx;
        }else{
            int fidx = firstIndex(arr, idx+1, 3);
            return fidx;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,3,5,6,3,4,2,6,7};

        int idx = firstIndex(arr, 0, 3);
        System.out.println(idx);
    }
}