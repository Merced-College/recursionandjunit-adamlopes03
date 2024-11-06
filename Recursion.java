//Adam Lopes
//10.24.2024
//Recursive problems testing with JUnit

public class Recursion {
    public static void main(String [] args) {
        // Test Cases
        System.out.println(count8(8));     // Expected output: 1
        System.out.println(count8(818));   // Expected output: 2
        System.out.println(count8(8818));  // Expected output: 3
        System.out.println(count8(123456)); // Expected output: 0
        System.out.println(count8(88888));  // Expected output: 5
        System.out.println(count8(80808));  // Expected output: 3


    }

    public static int count8(int n) {
        // Base case: if n is 0, there are no digits to count
        if (n == 0) {
            return 0;
        }

        // Check the rightmost digit
        int rightmostDigit = n % 10;


        // If the rightmost digit is 8
        if (rightmostDigit == 8) {
            return 1 + count8(n / 10);

        } else {
            // If the righmost digit is not 8, just procee to the next digit
            return count8(n / 10);
        }//end else
    }//method

    public static int countHi(String str){
        //check for null
        if(str == null)
            return 0;

        //base case
        if(str.length() < 2)
            return 0;

        char char1 = str.charAt(0);
        char char2 = str.charAt(1);

        //check if char1 is an h and char2 is an i
        if(char1 == 'h' && char2 == 'i')
            return 1 + countHi(str.substring(2));//send in the string minus the first  2 chars
        return countHi(str.substring(1));
        
    }

    public static int strCount(String str, String sub) {
        // Base case: if the remaining string is shorter than the substring, return 0
        if (str.length() < sub.length()) {
            return 0;
        }

        // If the string starts with the substring
        if (str.startsWith(sub)) {
            // Recursive case: increment count and skip over the matched substring
            return 1 + strCount(str.substring(sub.length()), sub);
        }

        // If the string does not start with the substring, move one character forward
        return strCount(str.substring(1), sub);
    }

    public static String stringClean(String str) {
        // Base case: if the string is empty or has only one character, return it as is.
        if (str.length() <= 1) {
            return str;
        }

        // check if the first two characters are the same
        if (str.charAt(0) == str.charAt(1)) {
            // Skip the current character if it is the same as the next one
            return stringClean(str.substring(1));
        } else {
            // Otherwise include the first character and process the rest of the string
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }

}//end class