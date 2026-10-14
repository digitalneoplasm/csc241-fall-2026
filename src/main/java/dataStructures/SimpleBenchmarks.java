package dataStructures;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@Fork(1)
@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class SimpleBenchmarks {

    @Param({"1000", "10000", "100000", "1000000", "10000000", "100000000"})
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
    }

    // Get the element at the middle index. Sink the result in a blackhole so this is not
    // optomized out since we never use the value.
    @Benchmark
    public void getBenchmark(Blackhole blackhole) {
        Integer result = arrayList.get(middleIndex);
        blackhole.consume(result);
    }

    // Add a value at the beginning of the ArrayList.
    @Benchmark
    public void addAtBeginningBenchmark() {
        arrayList.add(0, 0);
    }
}