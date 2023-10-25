package OddOccurrence;

import java.util.HashSet;
import java.util.Set;

public class HashSetOdd {
    /*
    Yes, you can use a set (or a map) to find the element that appears
    an odd number of times in an array.
    Here's an approach using a set (HashSet) to achieve that:
     */
    public static int findOddOccurrence(int[] arr) {
        Set<Integer> elements = new HashSet<>();

        for (int num : arr) {
            if (elements.contains(num)) {
                elements.remove(num);
            } else {
                elements.add(num);
            }
        }

        if (!elements.isEmpty()) {
            // The remaining element in the set is the one that appears an odd number of times.
            // You can use elements.iterator().next() to get the element.
            return elements.iterator().next();
        }

        // Return -1 or another suitable value to indicate no odd-occurring element was found.
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 4, 6, 8, 2, 9};
        int oddElement = findOddOccurrence(array);

        if (oddElement != -1) {
            System.out.println("The odd-occurring element is: " + oddElement);
        } else {
            System.out.println("No odd-occurring element found in the array.");
        }
    }
}
