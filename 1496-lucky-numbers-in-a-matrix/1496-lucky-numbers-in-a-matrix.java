class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList <Integer> a1=new ArrayList<>();
        int c=0;
        int rows=matrix.length;
        int column=matrix[0].length;
        int flg=0;

        for(int k=0;k<rows;k++){
            flg=0;
            int min=matrix[k][0];
            for(int i=0;i<column;i++){ 
                if(min>matrix[k][i]){
                    min=matrix[k][i];
                    c=i;
                    System.out.println(matrix[k][i]);
                }
            }
            for(int j=0;j<rows;j++){
                if(min>=matrix[j][c])
                    flg++;
            }
            if(flg==rows){
                a1.add(min);
                return a1;
            }
        }
        return a1;
    }
}