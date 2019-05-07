public class OctalToDecimal {

    static int getOctalToDecimal(int octalNumber)
    {

        int decimalNumber = 0;
        int base = 1;

        while (octalNumber != 0) {

            int lastDigit = octalNumber % 10;
            octalNumber = octalNumber / 10;
            decimalNumber += lastDigit * base;
            base = base * 8;

        }
        return decimalNumber;
    }

    public static void main(String[] args)
    {
        int octalNumber = -1;
        System.out.println(getOctalToDecimal(octalNumber));
    }

}
