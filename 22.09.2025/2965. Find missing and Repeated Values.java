class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res=new int[2];
        int n=(grid.length*grid.length)+1;
        int[] freq=new int[n];
        Arrays.fill(freq,0);
         int[] ans=new int[2];
        for(int i=0;i<grid.length;i++){
         for(int j=0;j<grid.length;j++){
             freq[grid[i][j]]++;
         }
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]==0){
                ans[1]=i;
            }
            else if(freq[i]==2){
                ans[0]=i;
            }
        }
        return ans;
    }
}
