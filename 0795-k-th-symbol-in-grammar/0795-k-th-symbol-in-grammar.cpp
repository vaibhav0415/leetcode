class Solution {
public:
    int kthGrammar(int n, int k) {
        // Base case
        if (n == 1 && k == 1) return 0;
        
        // Calculate the mid point
        int mid = (1 << (n - 1)) / 2;
        
        // Recursive call to find the result
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        } else {
            return !kthGrammar(n - 1, k - mid);
        }
    }
};
