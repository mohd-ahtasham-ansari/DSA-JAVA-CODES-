class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum <= 9) {
                digits[i] = sum;
                carry = 0;
                break;
            } else {
                digits[i] = 0;
                carry = 1;
            }
        }

        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }
}
