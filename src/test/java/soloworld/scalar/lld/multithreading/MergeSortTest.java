package soloworld.scalar.lld.multithreading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    MergeSort mergeSort;



    @Test
    void test1_happyCase() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Integer> input = List.of(10, 9, 7, 5, 6, 3, 1, 2);
        mergeSort = new MergeSort(input,executorService);
        Future<List<Integer>> listFuture = executorService.submit(mergeSort);
        List<Integer> res = listFuture.get();
         assertEquals(res.get(0), 1);
         assertEquals(res.get(1), 2);
         assertEquals(res.get(2), 3);
         assertEquals(res.get(3), 5);
         assertEquals(res.get(4), 6);
    }
}