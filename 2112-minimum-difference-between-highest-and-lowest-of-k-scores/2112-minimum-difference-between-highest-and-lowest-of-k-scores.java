class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1 || nums.length<k)
        return 0;
        else{
            ArrayList <Integer> a1=new ArrayList<>();
            for(int i=0 ;i<nums.length;i++){
                a1.add(nums[i]);
            }
            Collections.sort(a1);
            int min= a1.get(a1.size()-1);
            for(int i=0;i<=a1.size()-k;i++){
                if((a1.get(i+k-1)-a1.get(i))<min)
                    min=a1.get(i+k-1)-a1.get(i);
            }
            return min;
        }
    }
}