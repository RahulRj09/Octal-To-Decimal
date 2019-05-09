public class OctalToDecimalConverter {

    static int getOctalToDecimal(int octalNumber)
    {
        int decimalNumber = 0;
        int base = 1;
        while (octalNumber != 0) {
            int lastDigit = getLastDigit(octalNumber);
            octalNumber = getOctalNumber(octalNumber);
            decimalNumber += getDecimalNumber(lastDigit,base);
            base = base * 8;
        }
        return decimalNumber;
    }

    static int getLastDigit(int octalNumber){
        return octalNumber % 10;
    }

    static int getOctalNumber(int octalNumber){
        return octalNumber / 10;
    }

    static int getDecimalNumber(int lastDigit,int base){
        return lastDigit * base;
    }

    static boolean isNotOctal(int octalNumber){
        return octalNumber== 8 || octalNumber == 9;
    }

    public static void main(String[] args)
    {
        int octalNumber = Integer.parseInt(args[0]);
        if(isNotOctal(octalNumber)) {
            System.out.println("invalid input");
        } else{
            System.out.println(getOctalToDecimal(octalNumber));
        }
    }
}

