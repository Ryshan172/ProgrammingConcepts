package OddOccurrence;

public class OddOccurrence {
    /*
    To find the element that appears an odd number of times in an array in Java,
    you can use bitwise XOR (exclusive OR) operations.
    When you XOR a number with itself, you get 0. Therefore,
    if you XOR all the elements in the array, the elements that appear an
    even number of times will cancel each other out, leaving you
    with the element that appears an odd number of times.
     */
    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR all elements in the array
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 4, 6, 8, 2, 9};
        int oddElement = findOddOccurrence(array);
        System.out.println("The odd-occurring element is: " + oddElement);
    }
}
