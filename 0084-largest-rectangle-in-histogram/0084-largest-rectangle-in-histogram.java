class Solution {
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
    }}