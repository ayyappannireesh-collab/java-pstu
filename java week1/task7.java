class UserMainCode {

    public static int uniqueDigitCount(int n) {

        // Handle negative numbers
        n = Math.abs(n);

        boolean[] seen = new boolean[10];
        int count = 0;

        // Special case: n = 0
        if (n == 0)
            return 1;

        while (n > 0) {
            int digit = n % 10;

            if (!seen[digit]) {
                seen[digit] = true;
                count++;
            }
