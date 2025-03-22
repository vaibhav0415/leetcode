class Solution {
public:
    int c = 0;
    void merge(vector<int>& a, vector<int>& b, vector<int>& res) {
        int i = 0, j = 0, k = 0;
        while (i < a.size() && j < b.size()) {
            if (a[i] <= b[j])
                res[k++] = a[i++];
            else
                res[k++] = b[j++];
        }
        if (i == a.size())
            while (j < b.size())
                res[k++] = b[j++];
        if (j == b.size())
            while (i < a.size())
                res[k++] = a[i++];
    }

    int inversion(vector<int>& a, vector<int>& b) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < a.size() && j < b.size()) {
            if (a[i] > 2LL*b[j]) {
                count += (a.size() - i);
                j++;
            } else {
                // a[i]<=b[j]
                i++;
            }
        }
        return count;
    }

    void mergesort(vector<int>& v) {
        int n = v.size();
        if (n == 1)
            return;
        int n1 = n / 2;
        int n2 = n - n / 2;
        vector<int> a(n1), b(n2);
        for (int i = 0; i < n1; i++) {
            a[i] = v[i];
        }
        for (int i = 0; i < n2; i++) {
            b[i] = v[i + n1];
        }
        mergesort(a);
        mergesort(b);
        // count inversion
        c += inversion(a, b);
        merge(a, b, v);
        a.clear();
        b.clear();
    }
    int reversePairs(vector<int>& nums) {
        mergesort(nums);
        return c;
    }
};