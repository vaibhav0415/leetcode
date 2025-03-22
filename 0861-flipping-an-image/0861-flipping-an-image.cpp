class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        for(int i=0;i<image.size();i++){
            for(int j=0;j<image.size();j++){
                image[i][j]=image[i][j]==1?0:1;
            }
        }
        for(vector<int>& row:image){
            int i=0;
            int j=image.size()-1;
            while(i<j){
                int temp=row[i];
                row[i]=row[j];
                row[j]=temp;
                i++;
                j--;
            }
        }
        return image;
    }
};