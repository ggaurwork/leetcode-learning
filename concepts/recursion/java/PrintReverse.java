package concepts.recursion.java;

public class PrintReverse {

    public static void main(String[] args) {

        System.out.println("Test 1: Normal string");
        printReverse("hello".toCharArray());
        System.out.println();

        System.out.println("Test 2: Single character");
        printReverse("A".toCharArray());
        System.out.println();

        System.out.println("Test 3: Empty string");
        printReverse("".toCharArray());
        System.out.println();

        System.out.println("Test 4: Palindrome");
        printReverse("madam".toCharArray());
        System.out.println();

        System.out.println("Test 5: With spaces");
        printReverse("hello world".toCharArray());
        System.out.println();

        System.out.println("Test 6: Null input");
        printReverse(null);
        System.out.println();
    }


    private static void printReverse(char [] str) {
        printReverseHelper(0, str);
    }

    private static void printReverseHelper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        
        printReverseHelper(index + 1, str);
        System.out.print(str[index]);
    }
}