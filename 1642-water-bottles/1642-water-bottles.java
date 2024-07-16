//easy to understand code
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int mod=0, div=0;
        while(numBottles>=numExchange)
        {
            div=numBottles/numExchange;
            total+=numBottles/numExchange;
            mod=numBottles%numExchange;
            numBottles=div+mod;
        }
        return total;
    }
}