package soloworld.scalar.advanced.recursion;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {

    public ArrayList<ArrayList<Integer>> solve(int num) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        towerOfHanoi(num ,res,1,2,3);
        return res
                ;

    }

    private void towerOfHanoi(int num, ArrayList<ArrayList<Integer>> res, int souce, int helper, int destination) {
        if(num ==0) {
            return;
        }
        towerOfHanoi(num-1,res ,souce, destination,helper);
        ArrayList<Integer> inp = new ArrayList<>();
        inp.add(num);
        inp.add(souce);
        inp.add(destination);
        res.add(inp);
        towerOfHanoi(num-1,res,helper,souce,destination);
    }
}
