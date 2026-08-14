class Solution {
    public String addBinary(String a, String b) {

        int carry = 0;
        int sum = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {

            int digitA = 0;
            int digitB = 0;

            if (i >= 0) {
                digitA = a.charAt(i) - '0';
            }

            if (j >= 0) {
                digitB = b.charAt(j) - '0';
            }

            sum = digitA + digitB + carry;

            int currentDigit = sum % 2;
            carry = sum / 2;

            result.append(currentDigit);

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
