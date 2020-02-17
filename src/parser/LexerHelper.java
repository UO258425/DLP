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



    public static char lexemeToChar(String str) {
        str = str.replace("'","");
        if(!str.contains("\\")){
            return str.charAt(0);
        }
        else{
            str = str.replace("\\","");
            if(str.contains("n"))
                return '\n';
            else if(str.contains("t"))
                return '\t';
            else
                return (char) Integer.parseInt(str);
        }
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
