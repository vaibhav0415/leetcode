class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
          int minr=0;
           int maxr=n-1;
           int minc=0;
           int maxc=n-1;
           int tne=n*n;
           int c=1;
           vector<vector<int>> matrix(n, vector<int>(n)); 
           while(minr<=minc && minc<=maxc){
                //right
                for(int j=minc;j<=maxc && c<=tne;j++){
                    matrix[minr][j]=c;
                    c++;
                }
                minr++;
                //down
                for(int i=minr;i<=maxr && c<=tne;i++){
                   matrix[i][maxc]=c;
                    c++;
                }
                maxc--;
                //left
                for(int j=maxc;j>=minc && c<=tne;j-- ){
                    matrix[maxr][j]=c;
                    c++;
                }
                maxr--;
                //up
                for(int i=maxr;i>=minr &&c<=tne;i--){
                   matrix[i][minc]=c;
                    c++;
                }
                minc++;

           }
                 return matrix;

    }
};