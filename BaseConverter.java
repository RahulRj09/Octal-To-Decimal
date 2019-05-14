import java.util.ArrayList;
import java.util.List;

public class BaseConverter {

    static List<Integer> getDigits(String octalNumber) {
        List<Integer> digitOfNumber = new ArrayList<>();
        String[] splitOctalNUmber = octalNumber.split("");
        for (int i = splitOctalNUmber.length; i > 0; i--) {
            digitOfNumber.add(Integer.valueOf(splitOctalNUmber[i - 1]));

        }
        return digitOfNumber;
    }

    static boolean isNumberNotValid(String number,int base){
        for(int digit: getDigits(number)) {
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
        List<Integer> digits = getDigits(args[2]);
        List<Integer> powers = GetPowers.getPowers(digits.size(),base);
        System.out.println(DotProductCalculator.getDotProduct(powers,digits));
    }
}

