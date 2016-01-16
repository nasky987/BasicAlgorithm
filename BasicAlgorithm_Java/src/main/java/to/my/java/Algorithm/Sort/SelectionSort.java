package to.my.java.Algorithm.Sort;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Jhon on 2016-01-16.
 */

@AllArgsConstructor
@Data
public class SelectionSort {
    public static int[] sort(final int[] list) {
        final int listLength = list.length;
        int temp;

        for (int i = 0; i < listLength; i++) {
            for (int j = i; j < listLength; j++) {
                if (list[i] > list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        return list;
    }
}
