class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
           int minr=0;
           int m=matrix.size();
           int n=matrix[0].size();
           int maxr=m-1;
           int minc=0;
           int maxc=n-1;
           int tne=n*m;
           int c=0;
           vector<int> v;
           while(minr<=minc && minc<=maxc){
                //right
                for(int j=minc;j<=maxc && c<tne;j++){
                    v.push_back(matrix[minr][j]);
                    c++;
                }
                minr++;
                //down
                for(int i=minr;i<=maxr && c<tne;i++){
                    v.push_back(matrix[i][maxc]);
                    c++;
                }
                maxc--;
                //left
                for(int j=maxc;j>=minc && c<tne;j-- ){
                    v.push_back(matrix[maxr][j]);
                    c++;
                }
                maxr--;
                //up
                for(int i=maxr;i>=minr &&c<tne;i--){
                    v.push_back(matrix[i][minc]);
                    c++;
                }
                minc++;

           }
                 return v;

    }
};