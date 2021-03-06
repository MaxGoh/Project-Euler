/*
  @author Max Goh

  Even Fibonacci numbers

  Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

  By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class Question2 {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int totalSum = 2; // totalSum starts at 2 (Even Number)
        int fibonacci = 0, previousNumber = 1, currentNumber = 2;

        while (currentNumber <= 4000000) {

            fibonacci = previousNumber + currentNumber;

            if (isEven(fibonacci) == true) {
                totalSum += fibonacci;
            }

            previousNumber = currentNumber;
            currentNumber = fibonacci;
        }

        // Answer
        System.out.println("The Answer is: " + totalSum);
   }

}
