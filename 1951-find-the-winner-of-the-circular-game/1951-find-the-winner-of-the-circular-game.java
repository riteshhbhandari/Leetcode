class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList <Integer> arr=new ArrayList<Integer>();
        for(int a=0;a<n;a++){
            arr.add(a+1);
        }
        int flg=1;
        int rem=0;
        while(arr.size()!=1){
            if(flg!=k){
                rem= arr.remove(0);
                arr.add(rem);
                flg++;
            }
            else
            {   arr.remove(0);
                flg=1;
            }
        }
        return arr.get(0);
    }
}