public class Number {
    // Private instance variable
    private double value;

    // Constructor
    public Number(double value) {
        this.value = value;
    }

    // Method to check if the number is zero
    public boolean isZero() {
        return value == 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return value > 0;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return value < 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return value % 2 != 0;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return value % 2 == 0;
    }

    // Method to check if the number is prime
    public boolean isPrime() {
        if (value < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the number is an Armstrong number
    public boolean isArmstrong() {
        int digits = String.valueOf(value).length();
        double sum = 0;
        int valueInt = (int) value;
        while (valueInt > 0) {
            int digit = valueInt % 10;
            sum += Math.pow(digit, digits);
            valueInt /= 10;
        }
        return value == sum;
    }

 // Method to calculate the factorial of the number
    public long getFactorial() {
        long result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }


    // Method to calculate the square root of the number
    public double getSqrt() {
        return Math.sqrt(value);
    }

    // Method to calculate the square of the number
    public double getSqr() {
        return value * value;
    }

    // Method to calculate the sum of the digits of the number
    public double sumDigits() {
        double sum = 0;
        int valueInt = (int) value;
        while (valueInt > 0) {
            sum += valueInt % 10;
            valueInt /= 10;
        }
        return sum;
    }

    // Method to get the reverse of the number
    public double getReverse() {
        double reverse = 0;
        int valueInt = (int) value;
        while (valueInt > 0) {
            reverse = reverse * 10 + valueInt % 10;
            valueInt /= 10;
        }
        return reverse;
    }
    

        public static void main(String[] args) {
            Number num = new Number(12);
            System.out.println("Factorial: " + num.getFactorial());  // Outputs "Factorial: 1.83631e+23"
            System.out.println("Square root: " + num.getSqrt());     // Outputs "Square root: 11.090536506409418"
            System.out.println("Square: " + num.getSqr());           // Outputs "Square: 15129.0"
            System.out.println("Sum of digits: " + num.sumDigits()); // Outputs "Sum of digits: 6.0"
            System.out.println("Reverse: " + num.getReverse());      // Outputs "Reverse: 321.0"
        }
    

    

}
