
import java.io.*;
import java.util.*;

class UserMainCode {

    public int addLastDigits(int input1, int input2) {

        // Convert negative numbers to positive
        input1 = Math.abs(input1);
        input2 = Math.abs(input2);

        // Get last digits and return their sum
        return (input1 % 10) + (input2 % 10);
    }
}
