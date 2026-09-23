class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(n!=1){

            if(set.contains(n)){
                return false;
            }

            set.add(n);

              int temp = n;

         
            int square = 0;

            while (temp > 0) {

                int digit = temp % 10;

                square = square + digit * digit;

                temp = temp / 10;
            }


            n = square;
        }

        return true;
    }
}
