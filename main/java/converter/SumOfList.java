package converter;

import java.util.List;

public class SumOfList {
    public static int sumOfList(List<Integer> products){
        int sum = 0;
        for (int i = 0; i < products.size(); i++) {
            sum +=products.get(i);
        }
        return sum;
    }
}
