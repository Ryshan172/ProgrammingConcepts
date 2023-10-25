package ArrayReversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionReversal {
    /*
    You can convert the array to a List, reverse it using Collections.reverse(),
     and then convert it back to an array.
     This approach is more memory-intensive because it involves creating a new list
     */
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        List<Integer> list = new ArrayList<>();
        for (int num : originalArray) {
            list.add(num);
        }

        Collections.reverse(list);

        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = list.get(i);
        }

        // Print the reversed array
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }
}
