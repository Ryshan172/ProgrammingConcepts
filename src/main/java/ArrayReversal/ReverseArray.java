package ArrayReversal;

public class ReverseArray {
    /*
    In this example, we have an array originalArray,
    and we reverse it using the reverseArray method.
    The reverseArray method takes the array as a parameter and swaps the elements
    from the beginning and end of the array,
    moving towards the center until the entire array is reversed.
     */
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        reverseArray(originalArray);

        // Print the reversed array
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
