package mfedu;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int start = 5;
        int end = 10;
        
        System.out.println("Odd numbers:");
        printOddNumbers(start, end);
        
        System.out.println("\nEven numbers:");
        printEvenNumbers(start, end);
    }
    
    static void printOddNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    static void printEvenNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
