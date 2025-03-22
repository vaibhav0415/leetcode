class Solution {
public:
    bool check(vector<int>& arr) {
           int n=arr.size();
           bool flag=false;// false seems not visited
           for(int i=0;i<n-1;i++){
            
            if(arr[i]>arr[i+1]){
                 if(flag==true) return false;
                 flag=true;// ek baar aa jaye
                 if(arr[n-1]>arr[0]) return false;
            }
           }   
     return true;
}

};