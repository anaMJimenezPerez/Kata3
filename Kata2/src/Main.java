import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = FilePersonLoader.with("hw_25000.tsv").load();
        Map<String, Integer> histogram = new WeightHistogramCalculator(people).calculate();
        for(String key: histogram.keySet().stream().sorted().collect(Collectors.toList())){
            System.out.println(key + " " + histogram.get(key));
        }
    }
}
