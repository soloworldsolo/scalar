package soloworld.scalar.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ContigiousSubsetTest {

    ContigiousSubset contigiousSubset;

    @BeforeEach
    void setUp() {
        contigiousSubset = new ContigiousSubset();
    }

    @Test
    void test1() {
        int[] input = {1,2,3,10,8,6};
        List<List<Integer>> res = this.contigiousSubset.getContigiousSubset(input);
        List<List<Integer>> result = List.of(List.of(1),List.of(2),List.of(3),List.of(6,8,10));
        Assertions.assertEquals(result ,res);
    }
    @Test
    void test2() {
        int[] input = {4,1,2,3,10,8,6};
        List<List<Integer>> res = this.contigiousSubset.getContigiousSubset(input);
        List<List<Integer>> result = List.of(List.of(1,2,3,4),List.of(6,8,10));
        Assertions.assertEquals(result ,res);
    }

    @Test
    void test3() {
        int[] input = {4,1,2,3,10,8,6,11,7};
        List<List<Integer>> res = this.contigiousSubset.getContigiousSubset(input);
        List<List<Integer>> result = List.of(List.of(1,2,3,4),List.of(6,7,8,10,11));
        Assertions.assertEquals(result ,res);
    }

    @Test
    void test4() {

    }

  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inp = new int[n];
        int i=0;
        while(scanner.hasNext() && i<n) {
            inp[i] = scanner.nextInt();
            i++;
        }
        int index = scanner.nextInt();
        int value = scanner.nextInt();
        for(int j=0;j<n;j++) {
            if(index-1 == j) {
                System.out.print(value + " ");
            }
            System.out.print(inp[j] + " ");
        }
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nofarray = scanner.nextInt();
        List<Integer[]> list = new ArrayList<>();
        for(int i=0;i<nofarray;i++) {
            Integer[] arr = null;
            int j=0;

            while(scanner.hasNext()) {
                if(arr == null) {
                    arr = new Integer[scanner.nextInt()];
                }else {
                    arr[j++] = scanner.nextInt();
                }
                if(j==arr.length) {
                    break;
                }
            }
            list.add(arr);
        }

        for(Integer[] arr:list) {
            process(arr);
        }
    }

    private static void process(Integer[] input) {
        if(input !=null && input.length >0) {
            if(input.length ==1) {
                System.out.println(input[0]);
            }
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<input.length;i++) {
               map.putIfAbsent(input[i],0 );
               map.computeIfPresent(input[i], (key,val) -> val+1);
            }
            List<Integer> collect = map.keySet().stream().filter(key -> map.get(key) == 1).sorted().collect(Collectors.toList());
            Integer[] array = collect.toArray(new Integer[collect.size()]);
            int j=1;
            for(int num:array) {
                if(j== array.length) {
                    System.out.println(num);
                }else {
                    System.out.print(num + " ");
                }
            }

        }
    }
}