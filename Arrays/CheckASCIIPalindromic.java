
class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary = new StringBuilder();

        for (char c : s.toCharArray()) {
            String bits = Integer.toBinaryString(c);

            binary.append("0".repeat(8 - bits.length()));
            binary.append(bits);
        }

        int left = 0;
        int right = binary.length() - 1;

        while (left < right) {
            if (binary.charAt(left) != binary.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
