package cl.sudamerican.roman;

public class RomanNumerals {

    public String convert(int arabicNumber) {
        String result = "";
        String baseSymbol = "V";
        if(arabicNumber == 4)
            return "IV";
        if(arabicNumber == 9)
            return "IX";
        if(arabicNumber >= 5){
            return baseSymbol + append(arabicNumber - 5, result);
        }
        return append(arabicNumber, result);
    }

    private String append(int arabicNumber, String result) {
        for (int i = arabicNumber; i > 0; i--) {
            result += "I";
        }
        return result;
    }
}
