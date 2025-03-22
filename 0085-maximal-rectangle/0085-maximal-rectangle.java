class Solution {
    public int maximalRectangle(char[][] matrix) {

             if (matrix == null || matrix.length == 0) return 0;

        int[] heights = new int[matrix[0].length];
        int maxArea = 0;

        for (char[] row : matrix) {
            // Update heights based on the current row
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            // Calculate maximal rectangle area based on the updated heights
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }
    public int largestRectangleArea(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int n=arr.length;
	   int[] nse= new int[n];
	   int[] pse=new int[n];
	   //calculate nse
	   stack.push(n-1);
	   nse[n-1]=n;
	   for(int i=n-2;i>=0;i--){
		   while(stack.size()>0 && arr[stack.peek()]>=arr[i]){
			   stack.pop();
		   }
		   if(stack.size()==0) nse[i]=n;
		   else if(stack.size()>0) nse[i]=stack.peek();
		   stack.push(i);
	   }
	   // emptying stack
	   while(stack.size()>0) stack.pop();
	   stack.push(0);
	   pse[0]=-1;
	   for(int i=1;i<n;i++){
		   while(stack.size()>0 && arr[stack.peek()]>=arr[i]){
			   stack.pop();
		   }
		   if(stack.size()==0) pse[i]=-1;
		   else if(stack.size()>0) pse[i]=stack.peek();
		   stack.push(i);
	   }
	   int max=-1;
	   for(int i=0;i<n;i++){
		   int area=arr[i]*(nse[i]-pse[i]-1);
		   max=Math.max(max,area);
	   }
       return max;
    }
}