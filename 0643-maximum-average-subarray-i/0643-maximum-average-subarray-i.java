class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int arr[]=new int[nums.length];
        double max=Integer.MIN_VALUE;
        int c=0;
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
        }
        for(int i=k-1;i<arr.length;i++){
            // if(i==arr.length-1){
                // System.out.println(c);
            // }
            if(i!=k-1){
                c=arr[i]-arr[i-k];
            }

            else
            c=arr[i];
            if((double)(c)>=max){
                // System.out.print((double)c/k+" "+max);
                max=(double)c;
            }
            if(i==arr.length-1){
                System.out.println(c);
            }
        }
        return max/k;
    }
}
// [1, 13, 8, 2, 52, 55 ]