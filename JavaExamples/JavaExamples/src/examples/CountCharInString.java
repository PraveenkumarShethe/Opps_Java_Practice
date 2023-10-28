package examples;

/**
 * Created by Praveenkumar on 10/28/2023.
 */
public class CountCharInString {

    public static void main(String[] args) {
        String input = "In this program, we need to count the number of characters present in the string:\n" +
                "\n" +
                "The best of both worlds\n" +
                "\n" +
                "To count the number of characters present in the string, we will iterate through the string and count the characters. In above example, total numbers of characters present in the string are 251.";
        int count = 0;

        for (int i = 0 ; i <= input.length()-1 ; i++){
            if (input.charAt(i) != ' '){
                count++;
            }
        }
        System.out.printf("String char value are  "+count);
    }
}
