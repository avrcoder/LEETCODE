class Solution {
public:
    int minimumTotal(vector<vector<int>>& a) {
        int m;
        if(a.size()==1){
            m = a[0][0];
            for(int i=1;i<a[0].size();i++) m = min(m,a[0][i]);
            return m;
        }
        int res = 0;
        for(int k=a.size()-2;k>=0;k--){
            a[k][0] = min(a[k][0] + a[k+1][0],a[k][0] + a[k+1][1]);
            for(int j=1;j<a[k].size();j++){
                a[k][j] = min(a[k][j] + a[k+1][j],a[k][j] + a[k+1][j+1]);
            }
        }
        return a[0][0];
    }
};
