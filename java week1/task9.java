class UserMainCode {

    public static int sumNonPrimeIndex(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(i)) {
                sum += arr[i];
            }
        }

        return sum;
    }

    // Method to check whether a number is prime
    private static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}

    
