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
        for(int i =0; i< args.length; i++) {
            int octalNumber = Integer.parseInt(args[i]);
            if(args[i].contains("8") || args[i].contains("9")) {
                System.out.println("invalid input");
            } else{
                System.out.println(getOctalToDecimal(octalNumber));
            }
        }

    }

}
