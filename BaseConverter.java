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

    static int getDotProduct(List<Integer> x, List<Integer> y){
        int product = 0;
        for (int i = 0; i < x.size() ; i++) {
            product += x.get(i)*y.get(i);
        }
        return product;
    }

    static List<Integer> getPowers(int size,int base){
        List<Integer> powers = new ArrayList<>();
        for(int i = 0;i < size; i++){
            int power =  ((int) (Math.pow(base, i)));
            powers.add(power);
        }
        return powers;
    }

    public static void main(String[] args)
    {
        int base = Integer.parseInt(args[1]);
        if(isNumberNotValid(args[2],base)) {
            System.out.println("invalid input");
            return;
        }
        List<Integer> digits = getDigits(args[2]);
        List<Integer> powers = getPowers(digits.size(),base);
        System.out.println(getDotProduct(powers,digits));
    }
}

