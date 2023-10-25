package StringReversal;

public class StringBuilderReversal {
    public static void main(String[] args) {
        String original = "Hello, World!";
        StringBuilder reversed = new StringBuilder(original).reverse();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed.toString());
    }
}
