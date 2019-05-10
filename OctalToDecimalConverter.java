import java.util.ArrayList;
import java.util.List;

public class OctalToDecimalConverter {

    static List<Integer> getDigits(String octalNumber) {
        List<Integer> digitOfNumber = new ArrayList<>();
        String[] splitOctalNUmber = octalNumber.split("");
        for (int i = splitOctalNUmber.length; i > 0; i--) {
            digitOfNumber.add(Integer.valueOf(splitOctalNUmber[i - 1]));

        }
        return digitOfNumber;
    }

    static boolean isNotOctal(int octalNumber){
        return octalNumber == 8 || octalNumber == 9;
    }

    public static void main(String[] args)
    {
        int octalNumber = Integer.parseInt(args[0]);
        if(isNotOctal(octalNumber)) {
            System.out.println("invalid input");
            return;
        }
        int i = 0, decimalNumber = 0, base = 8;
        for(Integer digit :getDigits(args[0])){
            decimalNumber += digit * ((int) (Math.pow(base, i)));
            i++;
        }
          System.out.println(decimalNumber);
    }
}

