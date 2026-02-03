
class UserMainCode {

    public static int sumOfPowerDigits(int n) {

        int temp = n;
        int sum = 0;

        // Count number of digits
        int digits = 0;
        int t = n;
        while (t > 0) {
            digits++;
            t /= 10;
        }

        // Calculate sum of digits raised to power
        while (temp > 0) {
            int d = temp % 10;
