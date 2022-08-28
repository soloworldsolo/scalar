package soloworld.scalar.intermediate.hashing;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class Distances {
    public int solve(int[] A) {
        Map<Integer ,Integer> map = new HashMap<>();
        int index = 0;
        int distance = Integer.MAX_VALUE;
        for(int input:A) {
            if(!map.containsKey(input)) {
                map.put(input,index++ );
            }

            else {
                int currentdistance = index - (Integer) map.get(input);
                if(currentdistance < distance) {
                    distance = currentdistance;
                }
                index++;

        }

        }
        if(distance == Integer.MAX_VALUE) {
            return  -1;
        }
        return distance;

    }
}
