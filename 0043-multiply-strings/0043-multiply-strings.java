import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger sum = BigInteger.ZERO;
        int i = num2.length() - 1;
        int j = 0;
        while (i >= 0) {
            BigInteger ch = BigInteger.valueOf(num2.charAt(i) - '0');
            BigInteger temp = new BigInteger(num1).multiply(ch);
            sum = sum.add(temp.multiply(pow10(j)));
            j++;
            i--;
        }
        return sum.toString();
    }

    private BigInteger pow10(int exp) {
        BigInteger result = BigInteger.ONE;
        while (exp > 0) {
            result = result.multiply(BigInteger.TEN);
            exp--;
        }
        return result;
    }
}
