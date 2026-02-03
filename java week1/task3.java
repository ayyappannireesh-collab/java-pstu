import java.io.*;
import java.util.*;

class UserMainCode {

    public long nthFibonacci(int input1) {
        // Handle base cases
        if (input1 == 0)
            return 0;
        if (input1 == 1)
            return 1;

        long a = 0;
        long b = 1;
        long c = 0;

        for (int i = 2; i <= input1; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
