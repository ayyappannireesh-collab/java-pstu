public class DigitSum {

    public static int EvenOddDigitsSum(int input1, String input2) {
        int sum = 0;

        // Make number positive (in case of negative input)
        input1 = Math.abs(input1);

        while (input1 > 0) {
            int digit = input1 % 10;

            if (input2.equalsIgnoreCase("even") && digit % 2 == 0) {
                sum += digit;
            } 
            else if (input2.equalsIgnoreCase("odd") && digit % 2 != 0) {
                sum += digit;
            }

            input1 = input1 / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = 123456;
        
        System.out.println("Sum of even digits: " + EvenOddDigitsSum(number, "even"));
        System.out.println("Sum of odd digits: " + EvenOddDigitsSum(number, "odd"));
    }
}
