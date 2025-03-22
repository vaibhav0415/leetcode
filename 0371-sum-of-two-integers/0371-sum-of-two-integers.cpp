class Solution {
public:
    int getSum(int a, int b) {
        int xori = a ^ b;
        int carry = a & b;
        if(carry==0){
            return xori;
        }
        else{
            return getSum(xori,carry<<1);
        }
    }
};