class UserMainCode {

    public static int mostFrequentDigit(int n) {

        // Handle negative numbers
        n = Math.abs(n);

        int[] freq = new int[10];

        // Special case: n = 0
        if (n == 0)
            return 0;

        // Count frequency of each di

