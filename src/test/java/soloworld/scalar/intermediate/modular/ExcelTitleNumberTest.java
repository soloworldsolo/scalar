package soloworld.scalar.intermediate.modular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelTitleNumberTest {
    @Test
    public void test() {
        String val = "AAA";
        char[] charArray = val.toCharArray();

        int sum =0;
        for(int ch:charArray) {
            sum =( (26*sum) +(ch-64));

        }
        System.out.println(sum);


    }

    }

