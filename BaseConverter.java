import com.rahul.converter.DotProductCalculator;
import com.rahul.converter.GetDigits;
import com.rahul.converter.GetPowers;

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
        int base = Integer.parseInt(args[1]);
        if(isNumberNotValid(args[2],base)) {
            System.out.println("invalid input");
            return;
        }
        List<Integer> digits = GetDigits.getDigits(args[2]);
        List<Integer> powers = GetPowers.getPowers(digits.size(),base);
        System.out.println(DotProductCalculator.getDotProduct(powers,digits));
    }
}

