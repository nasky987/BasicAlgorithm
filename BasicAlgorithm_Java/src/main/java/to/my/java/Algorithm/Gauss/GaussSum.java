package to.my.java.Algorithm.Gauss;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Jhon on 2016-01-16.
 */

@AllArgsConstructor
@Data
public class GaussSum {
    public static int sum(final int n) {
       return (1 + n) * n / 2;
    }
}
