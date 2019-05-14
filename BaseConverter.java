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
        int i = 0, decimalNumber = 0;
        for(Integer digit :getDigits(args[2])){
            decimalNumber += digit * ((int) (Math.pow(base, i)));
            i++;
        }
          System.out.println(decimalNumber);
    }
}

