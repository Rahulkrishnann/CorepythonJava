public class DifferenceCalculator {
    public int calculateDifference(int n) {
        int sumOfSquares = 0;
        int squareOfSum = 0;
        
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }
        
        squareOfSum = squareOfSum * squareOfSum;
        
        int difference = sumOfSquares - squareOfSum;
        return difference;
    }
    
    public static void main(String[] args) {
        DifferenceCalculator calculator = new DifferenceCalculator();
        int n = 10; // Change this value to the desired number of natural numbers
        int difference = calculator.calculateDifference(n);
        System.out.println("The difference between the sum of the squares and the square of the sum of the first " + n + " natural numbers is: " + difference);
    }
}
