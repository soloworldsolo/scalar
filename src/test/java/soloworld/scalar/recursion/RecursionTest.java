package soloworld.scalar.recursion;

import org.junit.jupiter.api.Test;

public class RecursionTest {

    @Test
    public void test() {

        printInreverse("rlsekqrgdkhklkyhfrqohboxmfkztnqgyxatgnmrsqwblcmibmzrrppmajmfkbdjprdrgwhrakgeghxajlnjllqjwnuofjdhjhiyyvhewxrbknmihwdcqlorjvtouflkocdkloxpcmybcaftdoshmxdsfzghgiozdmbuvbndugttsltfzbgtitvrtzcarsjkqhkpwgeplcbvtifytzawydzfaaauvxlpakjoodsvpniqylszdbmfyfoewhxoucnkjhjnpklrbknnadl");

    }

    private  void printInreverse(String input) {
        StringBuilder builder = new StringBuilder();
        process(input,builder,input.length()-1);
        System.out.println(builder.toString());
    }

    public  void process(String input , StringBuilder builder ,int index) {

        if(index <0) {
            return;
        }

        builder.append(input.toCharArray()[index--]);
        process(input,builder,index);

    }
}
