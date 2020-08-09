class targetSum{

    public static void targetSum(int[] arr, int idx, int tar, String set, int sum){
        if(idx == arr.length){
            if(sum == tar){
                System.out.println(set + " .");
            }
                return;
        }


        targetSum(arr, idx+1, tar, set + arr[idx] + ", ", sum + arr[idx]);
        targetSum(arr, idx+1, tar, set, sum);

    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        targetSum(arr, 0, 70, "", 0);
    }
}