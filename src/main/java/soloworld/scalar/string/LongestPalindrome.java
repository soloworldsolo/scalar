package soloworld.scalar.string;

public class LongestPalindrome {
    public String longestPalindrome(String A) {
       int startIndex =A.length() -1;
       String result = "";
       while (startIndex >=0) {

           for (int i = 0; i+startIndex <A.length(); i++) {
               if(isPalindrome(i ,i+startIndex,A)){

                      return A.substring(i ,i+startIndex+1);

               }
           }

           startIndex--;
       }
       return result;
    }

    private boolean isPalindrome(int startIndex, int endIndex, String a) {
        int start = startIndex;
        int end = endIndex;
        while (start <= end) {
            if(a.toCharArray()[start++] != a.toCharArray()[end--]) {
                return false;
            }
        }
        return true;
    }
}
