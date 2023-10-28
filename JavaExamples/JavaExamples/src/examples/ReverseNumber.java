package examples;

/**
 * Created by Praveenkumar on 10/28/2023.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;
        int result = 0;

        while (number != 0){
            int reminder = number % 10;
            result = result*10 + reminder;
            number = number/10;
        }
        System.out.print(" Reverse number is :: " + result);
    }
}
