public class NaturalNumberSum {
    public int calculateSum(int n) {
        int sum = 0;
        int count = 0;
        
        for (int i = 1; count < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        NaturalNumberSum calculator = new NaturalNumberSum();
        int n = 10; // Change this value to the desired number of natural numbers
        int sum = calculator.calculateSum(n);
        System.out.println("The sum of the first " + n + " natural numbers divisible by 3 or 5 is: " + sum);
    }
}
