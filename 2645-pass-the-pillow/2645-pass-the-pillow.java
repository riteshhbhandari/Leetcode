class Solution {
    public int passThePillow(int n, int time) {
        //this was my first approach
        // if(time<=n-1){
        //     return time+1;//base case
        // }
        // time=time-(n-1); //calculating backward steps
        // if(n-time<=0){
        // }
        int flg=0;
        while(time>0){ //traverse until time is negative
            flg++;
            time=time-(n-1);
        }
        if(flg%2==0)//backward
            return (1-time);
        else //forward
            return n+time;
}
}