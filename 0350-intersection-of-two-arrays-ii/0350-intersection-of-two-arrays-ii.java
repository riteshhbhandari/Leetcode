class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
                ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        
        //inserting all the values of nums1 in hashmap and counting frequency
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i]))
                map.put(nums1[i],1);
            else
                map.put(nums1[i],map.get(nums1[i])+1);
        } 
        //inserting values of nums2 in hashmap
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])) //check if the solution is
                {   
                    map.put(nums2[i],map.get(nums2[i])+1);
                    if(map.get(nums2[i])>1)
                    {
                    arr.add(nums2[i]);
                    map.put(nums2[i],map.get(nums2[i])-2);
                    if(map.get(nums2[i])==0)
                    {
                        map.remove(nums2[i]);
                    }
                    }
                }
                
        }
        //storing the arrayList in An array
        int a[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]=arr.get(i);
        }
        return a;
    }
}
