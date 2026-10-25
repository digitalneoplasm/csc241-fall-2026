package dataStructures;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 1, warmups = 1)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class StringConcatenationBenchmark {
    private String str1 = "Hello";
    private String str2 = "World";

    @Param({"10", "100", "1000"})
    public int concatCount;

    @Benchmark
    public void concatenateWithPlus(Blackhole blackhole) {
        String result = "";
        for (int i = 0; i < concatCount; i++) {
            result += str1 + str2;
        }
        blackhole.consume(result);
    }
    @Benchmark
    public void concatenateWithStringBuilder(Blackhole blackhole) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < concatCount; i++) {
            sb.append(str1);
            sb.append(str2);
        }
        blackhole.consume(sb.toString());
    }
}