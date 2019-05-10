import java.util.ArrayList;
import java.util.List;

public class OctalToDecimalConverter {

    static List<Integer> getDigit(String number){
        int octalNumber = Integer.parseInt(number);
        ArrayList<Integer> lastDigitList = new ArrayList<>();
        while (octalNumber != 0) {
            int lastDigit = getLastDigit(octalNumber);
            octalNumber = getOctalNumber(octalNumber);
            lastDigitList.add(lastDigit);
        }
        return lastDigitList;

    }

    static int getLastDigit(int octalNumber){
        return octalNumber % 10;
    }

    static int getOctalNumber(int octalNumber){
        return octalNumber / 10;
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
        for(Integer digit :getDigit(args[0])){
            decimalNumber += digit * ((int) (Math.pow(base, i)));
            i++;
        }
          System.out.println(decimalNumber);
    }
}

