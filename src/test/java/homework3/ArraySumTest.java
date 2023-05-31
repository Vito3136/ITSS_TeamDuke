package homework3;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Report;
import net.jqwik.api.Reporting;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Size;
import net.jqwik.api.statistics.Histogram;
import net.jqwik.api.statistics.Statistics;
import net.jqwik.api.statistics.StatisticsReport;

public class ArraySumTest {

    @Property
    @Report(Reporting.GENERATED)
    @StatisticsReport(format = Histogram.class)
    void valueGreaterOrEqualsThanSum(

            @ForAll @IntRange(min = 1, max = 50) int valueRandom,
            @ForAll @Size(value = 10) List<@IntRange(min = 1, max = 10) Integer> listNumbers) {

        int[] array = convertListToArray(listNumbers);
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        int value = sum + valueRandom;

        assertEquals(ArraySumClass.arraySum(value, array), 1);
        Statistics.collect(sum);
        /*Statistics.collect(valueRandom);
        Statistics.collect(value);*/

    }

    private int[] convertListToArray(List<Integer> numbers) {
        int[] array = numbers.stream().mapToInt(x -> x).toArray();
        return array;
    }

}
