import com.rahul.converter. *;
import java.util.List;

public class BaseConverter {
    static boolean isNumberNotValid(String number,int base){
        for(int digit: GetDigits.getDigits(number)) {
          if(base <= digit){
              return true;
          }
        }
        return false;
    }

    public static void main(String[] args)
    {
        ParseResult parseing = new ParseResult(args);
        int base = parseing.fromBase;
        if(isNumberNotValid(parseing.number,base)) {
            System.out.println("invalid input");
            return;
        }
        List<Integer> digits = GetDigits.getDigits(parseing.number);
        List<Integer> powers = GetPowers.getPowers(digits.size(),base);
        List<Integer> products = GetProduct.getProduct(powers,digits);
        System.out.println(SumOfList.sumOflist(products));
    }
}

