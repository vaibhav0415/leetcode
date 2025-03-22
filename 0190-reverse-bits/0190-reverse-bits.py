class Solution:
    def reverseBits(self, n: int) -> int:
        res=0
        for i in range(32):
            bit= n&1 #this will give the lsb 
            res=res | (bit <<(31-i))
            n=n>>1
        return res