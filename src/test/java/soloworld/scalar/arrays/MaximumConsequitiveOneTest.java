package soloworld.scalar.arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Country;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MaximumConsequitiveOneTest {
    @Test
    public void test() {
        int[] inputArr = {10023,1589};



        for(int inp:inputArr) {
            char[] charInp =  String.valueOf(inp).toCharArray();


            System.out.print(charInp[0]);
            System.out.print("  ");
            System.out.println(charInp[charInp.length -1]);

        }

    }

    @Test
    public void test1() {
        int m=10;
        for(int i=0;i<m;i++) {
            int noOfSpaces = (i) *2;
            for(int j=1;j<=2*m;j++) {
                if(noOfSpaces >0 && j> (m-i) ) {
                    System.out.print(" ");
                    noOfSpaces--;
                }else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }

    }
    @Test
    public void test2() {
        int year =0;
        if (year % 400 == 0) {
            System.out.println( year);
        }
        // not a leap year if divisible by 100
        // but not divisible by 400
        else if (year % 100 == 0) {
            System.out.println(year);
        }
        // leap year if not divisible by 100
        // but divisible by 4
        else if (year % 4 == 0) {
            System.out.println(year);
        }
        // all other years are not leap years
        else {
            System.out.println( year);
        }

    }

    @Test
    public void test23() {
        int year =12047;
        int res =0;
        String temp = Integer.toString(year);
        char[] newGuess = temp.toCharArray();
        for (int i = 0; i < newGuess.length; i++)
        {

            res +=Character.getNumericValue(newGuess[i]);
        }
        System.out.println(res);
    }
    @Test
    public void test231() {
        int val =2987712;
        int res =0;
        int sqrt = (int) Math.sqrt(val);
        if(sqrt*sqrt == val) {
            System.out.println(1);
        }

        System.out.println(0);

    }

    @Test
    public void binaryToDecimal() {
        Long input =10000000000L;
        char[] charArray = String.valueOf(input).toCharArray();
        int result =0;
        int counter =0;
        for(int i=charArray.length-1;i>=0;i--) {
            result += Long.parseLong(String.valueOf(charArray[i])) * Math.pow(2,counter);
            counter++;
        }
        System.out.println(result);

    }

    @Test
    public void test567(){


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        boolean hasInput = true;
        int type =0;
        int ammount =0;
        while (hasInput) {
             type = scanner.nextInt();;
             ammount = scanner.nextInt();
            hasInput = false;
        }



        if(type ==1) {
            System.out.println(num1+ammount);
        }

        if(type ==2) {
            if(ammount > num1) {
                System.out.println("Insufficient Funds");
            }else {
                System.out.println(num1 - ammount);
            }
        }

    }

    @Test
    public void test56789() {
         int num = 5;
        for(int i=1;i<=num;i++) {

            for(int j=1;j<=num-i;j++) {
                System.out.print(0 + " ");
            }

            for(int k=0;k<i;k++) {
                System.out.print(k+i);
                System.out.print(" ");
            }

            int counter =2*(i-1);
            for(int m=0;m<i-1;m++) {
                System.out.print(counter-m);
                System.out.print(" ");
            }

            for(int l=1;l<=num-i;l++) {
                System.out.print(0);
                System.out.print(" ");
            }


            System.out.println();



        }
    }

    @Test
    void rfrfrf() throws JsonProcessingException {
        double val =53953/200.0;
        double val2 = 2113%200;
        System.out.println(val);
        Faker faker = Faker.instance();
        Country country = faker.country();
        System.out.println(country.name());
        System.out.println(country.capital());

        ObjectMapper objectMapper = new ObjectMapper();
        String sol = objectMapper.writeValueAsString(country);
    }

    public int solve(String A) {
        char[] charr = A.toCharArray();
        return isPalindrome(charr ,0 ,A.length()-1);
    }

    private int isPalindrome(char[] array ,int s ,int end) {
        if(s > end ) {
            return 1;
        }

        if((array[s] == array[end]) && (isPalindrome(array,++s, --end) ==1)) {
            return 1;
        }

        return 0;
    }
}




