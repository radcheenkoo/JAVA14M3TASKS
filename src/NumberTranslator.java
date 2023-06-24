public class NumberTranslator {
    public int translate(String romanNumber){
        romanNumber = romanNumber.strip();
        return romanNumber.equalsIgnoreCase("I")? 1: romanNumber.equalsIgnoreCase("II")?
                2: romanNumber.equalsIgnoreCase("III")? 3: romanNumber.equalsIgnoreCase("IV")?
                4: romanNumber.equalsIgnoreCase("V")? 5: romanNumber.equalsIgnoreCase("VI")?
                6: romanNumber.equalsIgnoreCase("VII")? 7: romanNumber.equalsIgnoreCase("VIII")?
                8: romanNumber.equalsIgnoreCase("IX")? 9: romanNumber.equalsIgnoreCase("X")?
                10: romanNumber.equalsIgnoreCase("XI")? 11: romanNumber.equalsIgnoreCase("XII")?
                12: -1;

    }
}
