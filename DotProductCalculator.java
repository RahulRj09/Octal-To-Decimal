import java.util.List;

public class DotProductCalculator {
    static int getDotProduct(List<Integer> x, List<Integer> y){
        int product = 0;
        for (int i = 0; i < x.size() ; i++) {
            product += x.get(i)*y.get(i);
        }
        return product;
    }
}
