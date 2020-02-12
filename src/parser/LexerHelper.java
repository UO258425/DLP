package parser;

public class LexerHelper {

    public static int lexemeToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return -1;
    }

    private static boolean isSpecialChar(String str) {
        if (str.length() != 4)
            return false;
        if (str.charAt(1) != '\\')
            return false;
        if (str.charAt(2) != 'n' || str.charAt(2) != 't')
            return false;
        return true;
    }

    private static char getSpecialChar(String str) {
        if (str.charAt(2) == 'n')
            return '\n';
        else if (str.charAt(2) == 't')
            return '\t';
        throw new IllegalArgumentException("Not a valid special character");
    }

    public static char lexemeToChar(String str) {
        try {
            if (str == null || str.length() == 0)
                throw new IllegalArgumentException("The lexeme is null or empty");
            else if (str.length() == 3) //single character
                return str.toCharArray()[1];
            else if (isSpecialChar(str))
                return getSpecialChar(str);
            else {
                String character = null;
                for (int i = 2; i < str.length() - 1; i++) {
                    character += str.charAt(i);
                }
                return (char) Integer.parseInt(character);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;

    }

    public static double lexemeToReal(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return -1;
    }
}
