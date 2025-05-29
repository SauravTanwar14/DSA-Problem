package GeeksProblem;

//Division without using multiplication, division and mod operator
public class Division {

    // //naive solution
    // public static int findQuotient(int dividend, int divisor) {
    //     // Handle division by zero
    //     if (divisor == 0) {
    //         throw new ArithmeticException("Division by zero");
    //     }

    //     // Determine the sign of the result
    //     boolean negativeResult = (dividend < 0) ^ (divisor < 0);

    //     // Work with positive values for the calculation
    //     dividend = Math.abs(dividend);
    //     divisor = Math.abs(divisor);
    //     int rem = dividend - divisor;
    //     int count = 1;

    //     while (rem >= divisor) {
    //         rem = rem - divisor;
    //         count++;
    //     }

    //     return negativeResult ? -count : count;
    // }

    //optimal solution
    public static int findQuotient(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        // Determine the sign of the result
        boolean negativeResult = (dividend < 0) ^ (divisor < 0);

        // Work with positive values for the calculation
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        while (dividend >= divisor) {
            int tempDivisor = divisor, multiple = 1;

            // Double the divisor until it is larger than the dividend
            while (dividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest doubled divisor
            dividend -= tempDivisor;
            quotient += multiple;
        }

        // Adjust the sign of the result
        return negativeResult ? -quotient : quotient;
    }




    public static void main(String[] args) {
        int a = 43;
        int b = -8;

        System.out.println("quotient " + findQuotient(a, b));
    }

}
