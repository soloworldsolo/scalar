package soloworld.scalar.intermediate.modular;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 */
public class ExcelTitleNumber {
    public int titleToNumber(String A) {
        char[] charArray = A.toCharArray();
        int sum =0;
        for(int ch:charArray) {
            sum =( (26*sum) +(ch-64));
        }
       return  sum;


    }
}
