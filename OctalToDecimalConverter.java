import java.util.ArrayList;
import java.util.List;

public class OctalToDecimalConverter {

    static ArrayList<Integer> getDigit(String number) {
        List<Integer> listOfLastDigit = new ArrayList<>();
        String[] arrOfStr = number.split("");
        for (int i = arrOfStr.length; i > 0; i--) {
            listOfLastDigit.add(Integer.valueOf(arrOfStr[i - 1]));
        }
        return (ArrayList<Integer>) listOfLastDigit;
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

