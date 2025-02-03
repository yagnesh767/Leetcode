class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0 itself) cannot be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > 0) {
            int digit = x % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Append digit to reversed number
            x /= 10;  // Remove last digit
        }

        return original == reversed;
    }
}
