public class Solution {
    public int uniquePathsWithObstacles(int[][] M) {
        int r = M.length;
        int c = M[0].length;
        int dp[][] = new int[r][c];
        for(int i=0;i<c;i++){
            if(M[0][i]==1){
                while(i<c){
                    dp[0][i] = 0;
                    i++;
                }
                break;
            }
            else dp[0][i] = 1;
        }
        for(int i=0;i<r;i++){
            if(M[i][0]==1){
                while(i<r){
                    dp[i][0] = 0;
                    i++;
                }
                break;
            }
            else dp[i][0] = 1;
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(M[i][j] == 0) dp[i][j] = dp[i-1][j] + dp[i][j-1];
                else dp[i][j] = 0;
            }
        }
        return dp[r-1][c-1];
    }
}
