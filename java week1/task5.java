import java.io.*;
import java.util.*;

class UserMainCode {

    public int countPrimesInRange(int input1, int input2) {

        int count = 0;

        // Ensure correct order
        if (input1 > input2) {
            int temp = input1;
            input1 = input2;
            input2 = temp;
        }

        for (int num = input1; num <= input2; num++) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    // Helper method to check prime number
    private boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
