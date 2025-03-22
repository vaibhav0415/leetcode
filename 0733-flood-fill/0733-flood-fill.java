class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
         dfs(image,sr,sc,image[sr][sc],color);
         return image;
    }
    // the below function will do the dfs from currRow currCol to it's neighbours containing initial color
     void dfs(int[][] image,int currRow,int currCol,int initialColor,int newColor){
        int n=image.length;
        int m=image[0].length;
        if(currRow<0 || currCol<0 || currRow>=n ||currCol>=m) return ;//outside the grid
        if(image[currRow][currCol]!=initialColor) return ;//if the cell you landed not of initial color
        image[currRow][currCol]=newColor;
        dfs(image,currRow+1,currCol,initialColor,newColor);//down
        dfs(image,currRow,currCol-1,initialColor,newColor);//left
        dfs(image,currRow-1,currCol,initialColor,newColor);//up
        dfs(image,currRow,currCol+1,initialColor,newColor);//right
     }
}