package dataStructures;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@Fork(1)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class SortingBenchmarks {
    @Param({"1000", "10000", "100000"})
    public int arrayListSize;

    private ArrayList<Integer> arrayList;
    private int middleIndex;

    // Re-initialize for each iteration to ensure fresh data
    @Setup(Level.Iteration)
    public void setup() {
        arrayList = new ArrayList<>();
        middleIndex = arrayListSize / 2;

        // Fill the ArrayList with random integers.
        Random random = new Random();
        for (int i = 0; i < arrayListSize; i++) {
            int randNum = random.nextInt();
            arrayList.add(randNum);
        }

        System.gc();
    }

    // Bubble Sort
    @Benchmark
    public void bubbleSortBenchmark() {
        for (int i = 0; i < arrayListSize; i++) {
            for (int j = 1; j < arrayListSize - i; j++) {
                if (arrayList.get(j).compareTo(arrayList.get(j-1)) < 0) {
                    Integer temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j-1));
                    arrayList.set(j-1, temp);
                }
            }
        }
    }
}