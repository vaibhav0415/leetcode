class Solution {
public:
    vector<int> result;
    void f(int i,int n){
        if(i>n) return;
        if(i<=n and i!=0) result.push_back(i);
        for(int j=(i==0)?1:0 ;j<=9;j++){
            f(10*i+j,n);
        }
    }
    vector<int> lexicalOrder(int n) {
        result.clear();
        f(0,n);
        return result;
    }
};